package ru.job4j.array;
/**
 * Класс для замены ячеек в массиве
 * @author DZN
 * @version 0.0
 */
public class SwitchArray {
    /*** метод для обмена значениями между двух ячеек в массиве типа int */
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[dest];
        array[dest] = array[source];
        array[source] = temp;
        return array;
    }
    /*** метод для обмена значениями между двух ячеек в массиве типа String */
    public static String[] swapString(String[] array, int source, int dest) {
        String temp = array[dest];
        array[dest] = array[source];
        array[source] = temp;
        return array;
    }
    /*** метод для обмена значениями между первой и последней ячеек в массиве типа int */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index : rsl) {
            System.out.println(index);
        }
    }
}