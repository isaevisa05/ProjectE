package io.github.isaevisa05.projecte.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import io.github.isaevisa05.projecte.entity.Statistics;
import io.github.isaevisa05.projecte.entity.Student;
import io.github.isaevisa05.projecte.entity.University;

import java.util.Collection;
import java.util.List;

public class JsonUtil {

    private static final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public static String toJson(Object object) {
        return gson.toJson(object);
    }

    public static Student jsonToStudent(String json) {
        return gson.fromJson(json, Student.class);
    }

    public static University jsonToUniversity(String json) {
        return gson.fromJson(json, University.class);
    }

    public static Statistics jsonToStatistics(String json) {
        return gson.fromJson(json, Statistics.class);
    }

    public static List<Student> jsonToStudentsList(String json) {
        return gson.fromJson(json, new TypeToken<List<Student>> () {}.getType());
    }
    public static List<University> jsonToUniversitiesList(String json) {
        return gson.fromJson(json, new TypeToken<List<University>> () {}.getType());
    }

    public static List<Statistics> jsonToStatisticsList(String json) {
        return gson.fromJson(json, new TypeToken<List<Statistics>> () {}.getType());
    }
}
