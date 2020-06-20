package ru.job4j.array;

/**
 * Класс для создании двухмерного массива и заполнению последовательностью чисел.
 * @author DZN
 * @version 0.0
 */

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            System.out.println();
            for (int k = 0; k < table[i].length; k++) {
                table[i][k] = (i + 1) * (k + 1);
            }
        }
        return table;
    }
}
