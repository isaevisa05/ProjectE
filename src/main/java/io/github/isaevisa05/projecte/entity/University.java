package io.github.isaevisa05.projecte.entity;

import com.google.gson.annotations.SerializedName;
import io.github.isaevisa05.projecte.StudyProfile;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor

public class University {

    @SerializedName("id")
    String id;
    @SerializedName("fullName")
    String fullName;
    @SerializedName("shortName")
    String shortName;
    @SerializedName("yearOfFoundation")
    int yearOfFoundation;
    @SerializedName("studyProfile")
    StudyProfile studyProfile;

}
