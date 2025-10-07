package io.github.isaevisa05.projecte;

public enum StudyProfile {

    MEDICINE("Медицина"),
    DEVELOPER("Разработчик"),
    LINGUISTICS("Лингвистика"),
    MATHEMATICS("Математика"),
    PHYSICS("Физика");
    private final String profile;

    private StudyProfile(String profile) {
        this.profile = profile;
    }

}