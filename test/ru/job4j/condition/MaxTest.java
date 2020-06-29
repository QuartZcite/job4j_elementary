package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax4To4Then4() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void when3NumMaxThen10() {
        int result = Max.max(1, 2, 10);
        assertThat(result, is(10));
    }

    @Test
    public void when3NumMaxThen11() {
        int result = Max.max(11, 2, 10);
        assertThat(result, is(11));
    }

    @Test
    public void when3NumMaxThen2() {
        int result = Max.max(2, 2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void when4NumMaxThen40() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
    @Test
    public void when4NumMaxThen30() {
        int result = Max.max(1, 2, 30, 4);
        assertThat(result, is(30));
    }
    @Test
    public void when4NumMaxThen20() {
        int result = Max.max(1, 20, 3, 4);
        assertThat(result, is(20));
    }
    @Test
    public void when4NumMaxThen1() {
        int result = Max.max(1, 1, 1, 1);
        assertThat(result, is(1));
    }


}