package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort2() {
        int[] input = new int[] {4, 3};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {3, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort5() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort5sorted() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort401() {
        int[] input = new int[] {0, 0, 1, 0};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {0, 0, 0, 1};
        assertThat(result, is(expect));
    }


}