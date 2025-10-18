package io.github.isaevisa05.projecte.entity;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

    @XmlElement(name = "fullName")
    @SerializedName("fullName")
    String fullName;

    @XmlElement(name = "universityId")
    @SerializedName("universityId")
    String universityId;

    @XmlElement(name = "currentCourseNumber")
    @SerializedName("currentCourseNumber")
    int currentCourseNumber;

    @XmlElement(name = "avgExamScore")
    @SerializedName("avgExamScore")
    float avgExamScore;

}
