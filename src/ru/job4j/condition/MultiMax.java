package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first > second ? first : second;
        result = third > result ? third : result;
        return result;
    }

    public  static void main(String[] args) {
        System.out.println(MultiMax.max(6, 1, 4));
    }
}