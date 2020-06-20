package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int i = index; i < array.length; i++) {
                    if (array[i] != null) {
                        SwitchArray.swapString(array, i, index);
                        break;

                    }

                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        for (String x: input) {
            System.out.print(x + " ");
        }
        System.out.println();
        String[] compressed = compress(input);
        for (String x: compressed) {
            System.out.print(x + " ");
             }
    }
}