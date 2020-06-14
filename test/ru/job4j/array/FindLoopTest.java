package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
// тест поиска по всему
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas5ThenNimus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {2, 15, 31, 50};
        int value = 0;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas5ThenNimus3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {1, 3, 5, 7, 9};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }
//тест поиска по интервалу
    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));

    }    @Test
    public void whenFind5() {
        int[] input = new int[] {2, 15, 31, 50, 1, 3, 5, 7, 9};
        int value = 9;
        int start = 2;
        int finish = 8;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 8;
        assertThat(result, is(expect));
    }
}