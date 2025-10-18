package io.github.isaevisa05.projecte.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class FullInfo {

    @XmlElementWrapper(name = "studentsInfo")
    @XmlElement(name = "studentEntry")
    List<Student> students;

    @XmlElementWrapper(name = "universitiesInfo")
    @XmlElement(name = "universityEntry")
    List<University> universities;

    @XmlElementWrapper(name = "statisticalInfo")
    @XmlElement(name = "statisticsEntry")
    List<Statistics> statistics;

    @XmlElement(name = "processedAt")
    Date processedAt;

    public FullInfo(List<Student> students, List<University> universities, List<Statistics> statistics) {
        this.students = students;
        this.universities = universities;
        this.statistics = statistics;
        processedAt = new Date();
    }
}
