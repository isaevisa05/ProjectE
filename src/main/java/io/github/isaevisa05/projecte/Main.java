package io.github.isaevisa05.projecte;

import io.github.isaevisa05.projecte.entity.FullInfo;
import io.github.isaevisa05.projecte.io.WriterJSON;
import io.github.isaevisa05.projecte.utils.StatisticsUtil;
import io.github.isaevisa05.projecte.io.ReadXLSX;
import io.github.isaevisa05.projecte.io.WriterXML;
import lombok.var;

public class Main {

    public static void main(String[] args) {
        var universities = ReadXLSX.readUniversities();
        var students = ReadXLSX.readStudents();
        var statistics = StatisticsUtil.createStatistics(universities, students);

        FullInfo xmlInfo = new FullInfo(students, universities, statistics);

        WriterXML.generateXMLFile(xmlInfo);
        WriterJSON.generateJSONFile(xmlInfo);
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
