package io.github.isaevisa05.projecte.io;

import com.google.gson.Gson;
import io.github.isaevisa05.projecte.entity.FullInfo;
import io.github.isaevisa05.projecte.utils.JsonUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.var;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class WriterJSON {

    private static final Logger logger = LoggerFactory.getLogger(WriterJSON.class);

    public static void generateJSONFile(FullInfo xmlInfo) {
        File file = new File("output/json.json");
        var dir = new File("output");
        if(!dir.isDirectory()) dir.mkdir();
        generateJSONFile(xmlInfo, file);
    }

    public static void generateJSONFile(FullInfo info, File file) {
        try (FileOutputStream fos = new FileOutputStream(file);) {
            logger.info("generateJSONFile start");
            String json = JsonUtil.toJson(info);
            fos.write(json.getBytes(StandardCharsets.UTF_8));
            logger.info("generateJSONFile end");
        } catch (IOException e) {
            logger.info(e.toString());
        }
    }
}
