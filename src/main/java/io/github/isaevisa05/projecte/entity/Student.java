package io.github.isaevisa05.projecte.entity;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor

public class Student {

    String fullName;
    String universityId;
    int currentCourseNumber;
    float avgExamScore;

}
