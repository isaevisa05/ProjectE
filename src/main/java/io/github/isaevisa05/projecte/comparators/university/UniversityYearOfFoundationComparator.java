package io.github.isaevisa05.projecte.comparators.university;

import io.github.isaevisa05.projecte.comparators.UniversityComparator;
import io.github.isaevisa05.projecte.entity.University;

public class UniversityYearOfFoundationComparator implements UniversityComparator {
    @Override
    public int compare(University o1, University o2) {
        return Integer.compare(o1.getYearOfFoundation(), o2.getYearOfFoundation());
    }
}
