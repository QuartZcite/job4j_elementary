package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Test;
import ru.job4j.calculator.X2;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //входной параметр
        int num = 5;
        //ожидаемое значение
        int expected = 120;
        //результат вычисления
        int rsl = Factorial.calc(num);
        //сравниваем с ожидаемым
        assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //входной параметр
        int num = 1;
        //ожидаемое значение
        int expected = 1;
        //результат вычисления
        int rsl = Factorial.calc(num);
        //сравниваем с ожидаемым
        assertThat(rsl, Matchers.is(expected));
    }
}