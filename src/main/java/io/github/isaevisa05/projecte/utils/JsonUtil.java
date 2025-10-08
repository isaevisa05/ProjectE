package io.github.isaevisa05.projecte.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import io.github.isaevisa05.projecte.entity.Student;
import io.github.isaevisa05.projecte.entity.University;

import java.util.Collection;
import java.util.List;

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

    public static String studentsToJson(List<Student> students) {
        return gson.toJson(students);
    }

    public static String universitiesToJson(List<University> universities) {
        return gson.toJson(universities);
    }

    public static Student jsonToStudent(String json) {
        return gson.fromJson(json, Student.class);
    }

    public static University jsonToUniversity(String json) {
        return gson.fromJson(json, University.class);
    }

    public static List<Student> jsonToStudents(String json) {
        return gson.fromJson(json, new TypeToken<List<Student>> () {}.getType());
    }
    public static List<University> jsonToUniversities(String json) {
        return gson.fromJson(json, new TypeToken<List<University>> () {}.getType());
    }
}
