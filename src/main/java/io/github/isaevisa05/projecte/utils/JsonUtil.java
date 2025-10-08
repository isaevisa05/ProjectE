package io.github.isaevisa05.projecte.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.isaevisa05.projecte.entity.Student;
import io.github.isaevisa05.projecte.entity.University;

import java.util.Collection;

public class JsonUtil {

    private static final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public static String studentToJson(Student student) {
        return gson.toJson(student);
    }

    public static String universityToJson(University university) {
        return gson.toJson(university);
    }

    public static String studentsToJson(Collection<Student> students) {
        return gson.toJson(students);
    }

    public static String universitiesToJson(Collection<University> universities) {
        return gson.toJson(universities);
    }

    public static Student jsonToStudent(String json) {

    }
}
