package ru.job4j.ex;

import org.junit.Test;
import ru.job4j.loop.Factorial;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenVaueLessZero() {
        Fact.calc(-1);
    }
}