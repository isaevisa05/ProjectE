package io.github.isaevisa05.projecte;

import io.github.isaevisa05.projecte.comparators.ComparatorManager;
import io.github.isaevisa05.projecte.comparators.enums.StudentComparatorType;
import io.github.isaevisa05.projecte.comparators.enums.UniversityComparatorType;
import io.github.isaevisa05.projecte.entity.Student;
import io.github.isaevisa05.projecte.entity.University;
import io.github.isaevisa05.projecte.utils.JsonUtil;
import io.github.isaevisa05.projecte.utils.StatisticsUtil;
import io.github.isaevisa05.projecte.xlsx.ReadXLSX;
import io.github.isaevisa05.projecte.xlsx.WriterXLSX;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        var universities = ReadXLSX.readUniversities();
        var students = ReadXLSX.readStudents();
        WriterXLSX.writeStatistics(
                StatisticsUtil.createStatistics(
                        universities, students)
                , "file.xlsx");

    }
        /*universities.stream()
                .sorted(ComparatorManager.getUniversityComparator(UniversityComparatorType.ID))
                .forEach(System.out::println);

        students.stream()
                .sorted(ComparatorManager.getStudentComparator(StudentComparatorType.AVG_EXAM_SCORE))
                .forEach(System.out::println);

        String universitiesString = JsonUtil.universitiesToJson(universities);
        String studentsString = JsonUtil.studentsToJson(students);


        System.out.println(universitiesString);
        System.out.println(studentsString);

        var universities2 = JsonUtil.jsonToUniversities(universitiesString);
        var students2 = JsonUtil.jsonToStudents(studentsString);

        System.out.println(universities.size() + " -> " + universities2.size());
        System.out.println(students.size() + " -> " + students2.size());

        universities.stream()
                .forEach((university -> {
                    String json = JsonUtil.universityToJson(university);
                    System.out.println(json);
                    University university2 = JsonUtil.jsonToUniversity(json);
                    System.out.println(university2);
                }));

        students.stream()
                .forEach((student -> {
                    String json = JsonUtil.studentToJson(student);
                    System.out.println(json);
                    Student student2 = JsonUtil.jsonToStudent(json);
                    System.out.println(student2);
                }));
    }*/

}
