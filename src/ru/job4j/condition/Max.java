package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
//       String result = "left = right = " +left;
 //       String result = left > right ? "left are max: " + left : "right are max: " + right;
//        if (left == right) result= "left = right = " +left;
        int result = left > right ? left : right;
        return result;
    }

    public  static void main(String[] args) {
        System.out.println(Max.max(2, 12));
    }
}