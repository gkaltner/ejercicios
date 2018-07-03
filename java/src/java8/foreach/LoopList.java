package java8.foreach;

import java8.Person;

import java.util.List;

public class LoopList {
    public static void main(String[] args) {
        List<Person>  people = Person.getPeople();

        people.forEach((person) -> System.out.println(person.toString()));
    }
}
