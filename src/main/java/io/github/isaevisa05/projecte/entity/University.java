package io.github.isaevisa05.projecte.entity;

import io.github.isaevisa05.projecte.StudyProfile;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor

public class University {

    String id;
    String fullName;
    String shortName;
    int yearOfFoundation;
    StudyProfile studyProfile;

}
