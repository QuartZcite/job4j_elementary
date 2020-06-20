package ru.job4j.array;

/**
 * Класс для поиска в массивах типа int значений по всему массиву и заданному интервалу.
 *  * @author DZN
 * @version 0.0
 */

public class FindLoop {
    /*** Метод поиска по всему массиву */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
    /*** Метод поиска по интервалу */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}