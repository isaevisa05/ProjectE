package io.github.isaevisa05.projecte.comparators.student;

import io.github.isaevisa05.projecte.comparators.StudentComparator;
import io.github.isaevisa05.projecte.entity.Student;

public class StudentAvgExamScoreComparator implements StudentComparator {

    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o2.getAvgExamScore(), o1.getAvgExamScore());
    }
}
