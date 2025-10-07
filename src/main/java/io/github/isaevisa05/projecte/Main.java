package io.github.isaevisa05.projecte;

import io.github.isaevisa05.projecte.entity.Student;
import io.github.isaevisa05.projecte.entity.University;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Список университетов");
        for(University university : ReadXLSX.readUniversities()) System.out.println(university);

        System.out.println("\nСписок учеников этих университетов");
        for(Student student : ReadXLSX.readStudents()) System.out.println(student);
    }

}
