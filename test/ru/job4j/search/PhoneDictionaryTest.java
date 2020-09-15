package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByOnesResult() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Ivan");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));

    }

    @Test
    public void whenFindByMultipleResult() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Ivan", "Ivanov", "534872", "Domna")
        );
        ArrayList<Person> persons = phones.find("348");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
        assertThat(persons.get(1).getSurname(), is("Ivanov"));
    }
}