package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
 //       if (ab + ac > bc && ab + bc > ab && ab + bc > ac) {
 //           return true;
 //       }
 //       return false;
        return (ab + ac > bc && ab + bc > ab && ab + bc > ac);
    }
    public static void main(String[] args) {
        Boolean result = Triangle.exist(1.0, 2.0, 2.0);
        System.out.println("Triangle exist: " + result);
    }
}