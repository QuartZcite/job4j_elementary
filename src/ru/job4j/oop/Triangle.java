
package ru.job4j.oop;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double poluperimeter(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }


    public boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc && ab + bc > ab && ab + bc > ac);
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double p = poluperimeter(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt((p * (p - ab) * (p - bc) * (p - ac)));
        }
        return rsl;
    }
}