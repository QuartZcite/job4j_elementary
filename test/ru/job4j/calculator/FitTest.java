package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMenTo80() {
        /* Входные параметры. */
        short in = 192;
        /* ожидаемое значение. Это всегда одна переменная. */
        double expected = 80;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        double out = Fit.manWeight(in);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, out, 0.1);

    }

    @Test
    public void whenMenTo65() {
        /* Входные параметры. */
        short in = 175;
        /* ожидаемое значение. Это всегда одна переменная. */
        double expected = 65.2;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        double out = Fit.manWeight(in);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, out, 0.1);

    }


    @Test
    public void whenWomanTo40() {
        /* Входные параметры. */
        short in = 156;
        /* ожидаемое значение. Это всегда одна переменная. */
        double expected = 40;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        double out = Fit.womanWeight(in);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, out, 0.1);

    }
     @Test
    public void whenWomanTo50() {
        /* Входные параметры. */
        short in = 157;
        /* ожидаемое значение. Это всегда одна переменная. */
        double expected = 40.8;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        double out = Fit.womanWeight(in);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, out, 0.1);

    }


}