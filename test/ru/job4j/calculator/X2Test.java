package ru.job4j.calculator;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

//import junit.framework.TestCase;

//public class X2Test extends TestCase {

public class X2Test {

    @Test
    public void whenXZeroOtherOne() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 1;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenALLone() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 3;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenAZeroOtherOne() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 2;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCZeroOtherOne() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 2;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(rsl, is(expected));
    }
}