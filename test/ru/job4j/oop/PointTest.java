package ru.job4j.oop;



import org.junit.Assert;
import org.junit.Test;


public class PointTest {

    @Test
    public void whenDist0() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double expected = 0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDist5NegativeInput() {
        Point a = new Point(-5, 0);
        Point b = new Point(0, 0);
        double expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3DDist4() {
        Point a = new Point(4, 4, 8);
        Point b = new Point(4, 4, 4);
        double expected = 4;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}