package br.com.psouza.test;

import br.com.psouza.domain.Person;
import br.com.psouza.domain.Sex;
import br.com.psouza.service.PersonListManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PersonListManagerTest {
    @Test
    @DisplayName("It should return a list of only female person")
    void returnOnlyFemalePeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25, Sex.FEMALE));
        people.add(new Person("Matheus", 30, Sex.MALE));
        people.add(new Person("Sam", 28, Sex.NON_BINARY));
        people.add(new Person("Nicole", 27, Sex.FEMALE));

        List<Person> femalePeople = PersonListManager.returnFemalePeople(people);
        boolean hasMale = femalePeople.stream().anyMatch(person -> person.getSex() == Sex.MALE);

        Assertions.assertFalse(hasMale);
    }
}