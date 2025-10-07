package io.github.isaevisa05.projecte;

import io.github.isaevisa05.projecte.entity.Student;
import io.github.isaevisa05.projecte.entity.University;

public class Main {

    public static void main(String[] args) {

        University university = new University("1", "Med", "Medi", 1000, StudyProfile.MEDICINE);

        Student student = new Student("N N", "1", 3, 4.73F);

        System.out.println(university);
        System.out.println(student);

    }

}
