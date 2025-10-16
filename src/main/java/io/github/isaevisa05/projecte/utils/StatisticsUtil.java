package io.github.isaevisa05.projecte.utils;

import io.github.isaevisa05.projecte.StudyProfile;
import io.github.isaevisa05.projecte.entity.Statistics;
import io.github.isaevisa05.projecte.entity.Student;
import io.github.isaevisa05.projecte.entity.University;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StatisticsUtil {

    public static List<Statistics> createStatistics(List<University> universities, List<Student> students) {

        Set<StudyProfile> profiles = universities.stream()
                .map(University::getStudyProfile)
                .collect(Collectors.toSet());

        List<Statistics> statisticsList = new ArrayList<>();

        profiles.forEach(profile -> {
            Statistics statistics = new Statistics();

            statistics.setStudyProfile(profile);

            statistics.setUniversitiesForStudyProfile(universities.stream()
                    .filter(university -> university.getStudyProfile().equals(statistics.getStudyProfile()))
                    .map(University::getId)
                    .collect(Collectors.toList()));

            statistics.setQuantityOfUniversitiesForStudyProfile(statistics.getUniversitiesForStudyProfile().size());

            int studentCount = 0;
            BigDecimal studentsAvgExamScore = new BigDecimal(0);

            for (Student student : students) {
                if (!statistics.getUniversitiesForStudyProfile().contains(student.getUniversityId())) continue;
                studentCount++;
                studentsAvgExamScore = studentsAvgExamScore.add(new BigDecimal(student.getAvgExamScore() + ""));
            }

            BigDecimal divisor = new BigDecimal(studentCount);
            if (divisor.compareTo(BigDecimal.ZERO) != 0) {
                if (studentsAvgExamScore.compareTo(BigDecimal.ZERO) != 0) {
                    studentsAvgExamScore = studentsAvgExamScore.divide(divisor, RoundingMode.HALF_UP);
                }
            }

            statistics.setQuantityOfStudents(studentCount);
            statistics.setAvgExamScore(Float.parseFloat(studentsAvgExamScore.setScale(2).toString()));

            statisticsList.add(statistics);
        });

        return statisticsList;
    }

}
