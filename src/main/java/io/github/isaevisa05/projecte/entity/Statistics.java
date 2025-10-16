package io.github.isaevisa05.projecte.entity;

import com.google.gson.annotations.SerializedName;
import io.github.isaevisa05.projecte.StudyProfile;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Statistics {

    @SerializedName("studyProfile")
    StudyProfile studyProfile;
    @SerializedName("avgExamScore")
    float avgExamScore;
    @SerializedName("quantityOfStudents")
    int quantityOfStudents;
    @SerializedName("quantityOfUniversities")
    int quantityOfUniversitiesForStudyProfile;
    @SerializedName("universitiesForStudyProfile")
    List<String> universitiesForStudyProfile;

}
