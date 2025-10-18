package io.github.isaevisa05.projecte.entity;

import com.google.gson.annotations.SerializedName;
import io.github.isaevisa05.projecte.StudyProfile;
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
public class University {

    @XmlElement(name = "id")
    @SerializedName("id")
    String id;

    @XmlElement(name = "fullName")
    @SerializedName("fullName")
    String fullName;

    @XmlElement(name = "shortName")
    @SerializedName("shortName")
    String shortName;

    @XmlElement(name = "yearOfFoundation")
    @SerializedName("yearOfFoundation")
    int yearOfFoundation;

    @XmlElement(name = "studyProfile")
    @SerializedName("studyProfile")
    StudyProfile studyProfile;

}
