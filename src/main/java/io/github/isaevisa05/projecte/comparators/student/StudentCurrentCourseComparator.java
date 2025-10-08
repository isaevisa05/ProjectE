package io.github.isaevisa05.projecte.comparators.student;

import io.github.isaevisa05.projecte.comparators.StudentComparator;
import io.github.isaevisa05.projecte.entity.Student;

public class StudentCurrentCourseComparator implements StudentComparator {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getCurrentCourseNumber(), o2.getCurrentCourseNumber());
    }
}
