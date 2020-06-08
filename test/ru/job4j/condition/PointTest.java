package ru.job4j.condition;

//тест рассчета расстояния по координатам

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class PointTest {

    @Test
    public void whenDist0() {
        /* Входные параметры. */
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        double expected = 0;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        double out = Point.distance(x1, y1, x2, y2);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDist5NegativeInput() {
        /* Входные параметры. */
        int x1 = -5;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        /* ожидаемое значение. Это всегда одна переменная. */
        double expected = 5;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        double out = Point.distance(x1, y1, x2, y2);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, out, 0.01);
    }


}