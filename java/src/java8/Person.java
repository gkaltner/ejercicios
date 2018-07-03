package java8;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person { name: " + this.getName() + ", age: " + this.getAge() +" }";
    }

    public static List<Person> getPeople(){
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("gaston",34));
        people.add(new Person("carlos",56));
        people.add(new Person("felipe",13));
        people.add(new Person("mengano",13));
        people.add(new Person("fulano",34));

        return people;
    }
}
