package java8.streams;

import java8.Person;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        List<Person> people = Person.getPeople();

        System.out.println("-------- filter ----------");
        peopleFiltered(people).forEach(System.out::println);
        System.out.println("-------- findAny ----------");
        System.out.println(findAnyPerson(people));
        System.out.println("-------- mapping ----------");
        mappingPeople(people).forEach(System.out::println);
        System.out.println("-------- GroupBy ----------");
        LinkedHashMap<Integer,Long> ordered = new LinkedHashMap<>();
        groupBy(people)
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered((item)->ordered.put(item.getKey(),item.getValue()));
        System.out.println(ordered);
    }

    private static List<Person> peopleFiltered(List<Person> people) {
        return people.stream()
                .filter( (person) -> person.getAge() > 20)
                .collect(Collectors.toList());
    }

    private static Person findAnyPerson(List<Person> people) {
        return people.stream()
                .filter( (person) -> person.getAge() > 20)
                .findAny().orElse(null);
    }

    private static List<String> mappingPeople(List<Person> people) {
        return people.stream().map(Person::getName).collect(Collectors.toList());
    }

    private static Map<Integer,Long> groupBy(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(Person::getAge,Collectors.counting()));
    }
}
