package ru.job4j.loop;

public class Factorial {
    public static int calc(int num) {
        int result = 1;
        for (int index = 1; index <= num; index++) {
            result = result * index;
        }
        return result;
    }
}