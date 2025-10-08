package io.github.isaevisa05.projecte.comparators.enums;

import io.github.isaevisa05.projecte.comparators.StudentComparator;
import io.github.isaevisa05.projecte.comparators.student.StudentAvgExamScoreComparator;
import io.github.isaevisa05.projecte.comparators.student.StudentCurrentCourseComparator;
import io.github.isaevisa05.projecte.comparators.student.StudentFullNameComparator;
import io.github.isaevisa05.projecte.comparators.student.StudentUniversityIdComparator;
import lombok.Getter;

@Getter
public enum StudentComparatorType {

    FULL_NAME(new StudentFullNameComparator()),
    UNIVERSITY_ID(new StudentUniversityIdComparator()),
    CURRENT_COURSE_NUMBER(new StudentCurrentCourseComparator()),
    AVG_EXAM_SCORE(new StudentAvgExamScoreComparator());

    private final StudentComparator studentComparator;

    private StudentComparatorType(StudentComparator studentComparator) {
        this.studentComparator = studentComparator;
    }

}
