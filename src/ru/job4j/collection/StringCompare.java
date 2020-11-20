package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0, min;
        if (left.length() > right.length()) {
            min = right.length();
        } else if ((left.length() < right.length())) {
            min = left.length();
        } else {
            min = left.length();
        }
        for (int i = 0; i < min; i++) {
                rsl = Character.compare(left.charAt(i), right.charAt(i));
                if (rsl != 0) {
                    break;
                }
        }
        if (rsl == 0) {
            rsl = Integer.compare(left.length(), right.length());
        }
        return rsl;
    }
}