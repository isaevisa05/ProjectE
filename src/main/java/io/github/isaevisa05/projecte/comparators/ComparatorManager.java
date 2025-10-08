package io.github.isaevisa05.projecte.comparators;

import io.github.isaevisa05.projecte.comparators.enums.StudentComparatorType;
import io.github.isaevisa05.projecte.comparators.enums.UniversityComparatorType;

public class ComparatorManager {

    public static StudentComparator getStudentComparator(StudentComparatorType studentComparatorType) {
        return studentComparatorType.getStudentComparator();
    }

    public static UniversityComparator getUniversityComparator(UniversityComparatorType universityComparatorType) {
        return universityComparatorType.getUniversityComparator();
    }

}
