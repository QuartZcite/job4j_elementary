package ru.job4j.array;
/**
 * Класс для поиска минимума в массиве типа int в диаппазоне.
 * @author DZN
 * @version 0.0
 */
public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index <= finish; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}