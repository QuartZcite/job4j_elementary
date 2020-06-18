package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] num = new int[5];
        for (int index = 0; index < num.length; index++) {
            num[index] = index * 2 + 3;
        }
//        for (int index = 0; index < num.length; index++) {
//            System.out.println(num[index]);
//        }
         for (int x : num) {
            System.out.println(x);
        }
    }
}
