package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return rsl;
    }

    public static void main(String[] args) {
          double result = Point.distance(0, 0, 0, 25);
//        System.out.println("result ("+ x1 +", "+ y1 +") to ("+ x2 +", "+ y2 +") " + result);
          System.out.println("result (0, 0) to (0, 25) " + result);
          result = Point.distance(1, 1, 3, 5);
          System.out.println("result (1, 1) to (3, 5) " + result);
          result = Point.distance(4, 4, 4, 4);
          System.out.println("result (4, 4) to (4, 4) " + result);
    }
}