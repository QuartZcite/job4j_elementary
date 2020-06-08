package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class SqAreaTest {

    @Test
    public void whenSqZero() {
        /* Входные параметры. */
        int p = 10;
        int k = 0;
        /* ожидаемое значение. Это всегда одна переменная. */
        double expected = 0;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        double out = SqArea.square(p, k);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, out, 0.1);

    }
    @Test
    public void whenSq25() {
        /* Входные параметры. */
        int p = 20;
        int k = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        double expected = 0;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        double out = SqArea.square(p, k);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, out, 0.1);

    }






}