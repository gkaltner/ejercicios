package java8.lambda;

import java8.Person;
import java.util.List;

public class LambdaInSorting {

    public static void main(String[] args){
        List<Person> people = Person.getPeople();

        for (Person person :people) {
            System.out.println(person);
        }

        people.sort( (p1, p2) -> p2.getAge().compareTo(p1.getAge()));

        System.out.println("--------------------");
        for (Person person:people) {
            System.out.println(person);
        }
    }
}
