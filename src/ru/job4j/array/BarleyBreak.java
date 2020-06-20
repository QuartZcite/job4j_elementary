package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int num = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int k = 0; k < array[i].length; k++) {
                array[i][k] = num;
                num++;
                System.out.print(array[i][k] + " ");

            }

        }
    }
}
