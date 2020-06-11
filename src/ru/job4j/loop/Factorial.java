package ru.job4j.loop;

import ru.job4j.condition.Triangle;

public class Factorial {
    public static int calc(int num) {
        int result = 1;
        for (int index = 1; index <= num;) {
            result = result * index;
            index++;
        }
        return result;
    }
}