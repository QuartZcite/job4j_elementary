package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            System.out.println();
            for (int k = 0; k < table[i].length; k++) {
                table[i][k] = (i + 1) * (k + 1);
 //               System.out.print(table[i][k] + " ");
            }
        }
        return table;
    }
}
