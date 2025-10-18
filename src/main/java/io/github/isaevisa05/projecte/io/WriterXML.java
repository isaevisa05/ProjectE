package io.github.isaevisa05.projecte.io;

import io.github.isaevisa05.projecte.entity.FullInfo;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.var;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class WriterXML {

    private static final Logger logger = LoggerFactory.getLogger(WriterXML.class);

    public static void generateXMLFile(FullInfo xmlInfo) {
        File file = new File("output/xml.xml");
        var dir = new File("output");
        if(!dir.isDirectory()) dir.mkdir();
        generateXMLFile(xmlInfo, file);
    }

    public static void generateXMLFile(FullInfo xmlInfo, File file) {
        try {
            logger.info("generateXMLFile start");
            JAXBContext context = JAXBContext.newInstance(FullInfo.class);
            Marshaller marshaller = context.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(xmlInfo, file);
            logger.info("generateXMLFile end");
        } catch (JAXBException e) {
            logger.info(e.toString());
        }
    }

}
