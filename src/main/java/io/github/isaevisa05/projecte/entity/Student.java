package io.github.isaevisa05.projecte.entity;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor

public class Student {

    @SerializedName("fullName")
    String fullName;
    @SerializedName("universityId")
    String universityId;
    @SerializedName("currentCourseNumber")
    int currentCourseNumber;
    @SerializedName("avgExamScore")
    float avgExamScore;

}
