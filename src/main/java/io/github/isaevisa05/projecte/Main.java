package io.github.isaevisa05.projecte;

import io.github.isaevisa05.projecte.comparators.ComparatorManager;
import io.github.isaevisa05.projecte.comparators.enums.StudentComparatorType;
import io.github.isaevisa05.projecte.comparators.enums.UniversityComparatorType;

public class Main {

    public static void main(String[] args) {
        var universities = ReadXLSX.readUniversities();
        var students = ReadXLSX.readStudents();

        universities.stream()
                .sorted(ComparatorManager.getUniversityComparator(UniversityComparatorType.ID))
                .forEach(System.out::println);

        students.stream()
                .sorted(ComparatorManager.getStudentComparator(StudentComparatorType.AVG_EXAM_SCORE))
                .forEach(System.out::println);
    }

}
