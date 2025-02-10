package br.com.psouza.service;

import br.com.psouza.domain.Person;
import br.com.psouza.domain.Sex;

import java.util.List;
import java.util.stream.Stream;

public class PersonListManager {
    static public List<Person> returnFemalePeople(List<Person> people) {
        Stream<Person> femalePeople = people.
                stream().
                filter(person -> person.getSex().equals(Sex.FEMALE));
        return femalePeople.toList();
    }
}
