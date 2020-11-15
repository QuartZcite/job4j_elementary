package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().
                thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("task 2", 0),
                new Job("task 1", 1)
        );
        assertThat(rsl, lessThan(0));
        rsl = cmpNamePriority.compare(
                new Job("task", 0),
                new Job("task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameUPAndProrityUP() {
        Comparator<Job> cmpNamePriority = new JobDescByNameUP().
                thenComparing(new JobDescByPriorityUP());
        int rsl = cmpNamePriority.compare(
                new Job("task 2", 0),
                new Job("task 1", 1)
        );
        assertThat(rsl, greaterThan(0));
        rsl = cmpNamePriority.compare(
                new Job("task", 0),
                new Job("task", 1)
        );
        assertThat(rsl, lessThan(0));
    }







}