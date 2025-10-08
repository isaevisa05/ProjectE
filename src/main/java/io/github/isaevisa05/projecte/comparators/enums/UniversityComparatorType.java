package io.github.isaevisa05.projecte.comparators.enums;

import io.github.isaevisa05.projecte.comparators.UniversityComparator;
import io.github.isaevisa05.projecte.comparators.university.*;
import lombok.Getter;

@Getter
public enum UniversityComparatorType {

    ID(new UniversityIdComparator()),
    FULL_NAME(new UniversityFullNameComparator()),
    SHORT_NAME(new UniversityShortNameComparator()),
    YEAR_OF_FOUNDATION(new UniversityYearOfFoundationComparator()),
    STUDY_PROFILE(new UniversityStudyProfileComparator());

    private final UniversityComparator universityComparator;

    private UniversityComparatorType(UniversityComparator universityComparator) {
        this.universityComparator = universityComparator;
    }

}
