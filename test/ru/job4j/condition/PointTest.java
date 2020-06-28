package ru.job4j.condition;

//тест рассчета расстояния по координатам

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

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
}