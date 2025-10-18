package io.github.isaevisa05.projecte.entity;

import com.google.gson.annotations.SerializedName;
import io.github.isaevisa05.projecte.StudyProfile;
import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Statistics {

    @XmlElement(name = "studyProfile")
    @SerializedName("studyProfile")
    StudyProfile studyProfile;

    @XmlElement(name = "avgExamScore")
    @SerializedName("avgExamScore")
    float avgExamScore;

    @XmlElement(name = "quantityOfStudents")
    @SerializedName("quantityOfStudents")
    int quantityOfStudents;

    @XmlElement(name = "quantityOfUniversities")
    @SerializedName("quantityOfUniversities")
    int quantityOfUniversitiesForStudyProfile;

    @XmlElement(name = "universitiesForStudyProfile")
    @SerializedName("universitiesForStudyProfile")
    List<String> universitiesForStudyProfile;

}
