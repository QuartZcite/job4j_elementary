
package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            // поиск минимума в диаппазоне
            int min = MinDiapason.findMin(data, i, data.length - 1);
            // получение индекса с минимумом
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            // замена ячеек
            SwitchArray.swap(data, i, index);
        }
        return data;
    }
}