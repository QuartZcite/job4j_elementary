package ru.job4j.array;
/**
 * Класс для поиска минимума в массиве типа int.
 * @author DZN
 * @version 0.0
 */
public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}