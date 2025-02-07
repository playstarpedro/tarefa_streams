package br.com.psouza.test;

import br.com.psouza.domain.Person;
import br.com.psouza.domain.Sex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTaskM22 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25, Sex.FEMALE));
        people.add(new Person("Matheus", 30, Sex.MALE));
        people.add(new Person("Sam", 28, Sex.NON_BINARY));
        people.add(new Person("Davi", 22, Sex.MALE));
        people.add(new Person("Nicole", 27, Sex.FEMALE));

        System.out.println("All people");
        people.forEach(System.out::println);
        System.out.println("\n##################\n");

        Stream<Person> femalePeople = people.stream().filter(person -> person.getSex().equals(Sex.FEMALE));
        System.out.println("Female people: ");
        femalePeople.forEach(System.out::println);
    }
}
