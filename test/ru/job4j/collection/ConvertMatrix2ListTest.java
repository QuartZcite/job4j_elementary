package ru.job4j.collection;

import org.junit.Ignore;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertMatrix2ListTest {
    @Test
    public void when2on2ArrayThenList4() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {
                {10, 20},
                {30, 40}
        };
        List<Integer> expect = Arrays.asList(
                10, 20, 30, 40
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }
}