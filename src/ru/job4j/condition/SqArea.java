package ru.job4j.condition;

//площадь прямоугольника

@SuppressWarnings("UnnecessaryLocalVariable")

public class SqArea {
    public static double square(int p, int k) {
/*
        double h = p/(2*(k+1));
        double l = h * k;
        double rsl = l * h;
*/
        double rsl = Math.pow((p / (2 * (k + 1))), 2) * k;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = " + result1);
    }
}