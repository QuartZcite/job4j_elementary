package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void thenSqare8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        ru.job4j.oop.Triangle triangle = new ru.job4j.oop.Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void thenSquare21() {
        Point a = new Point(-3, 1);
        Point b = new Point(1, 8);
        Point c = new Point(3, 1);
        ru.job4j.oop.Triangle triangle = new ru.job4j.oop.Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(21, 0.001));
    }
}