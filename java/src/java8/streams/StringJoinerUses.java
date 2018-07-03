package java8.streams;

import java8.Person;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerUses {

    public static void main(String []args){
        stringJoin();
        collertorsJoining();
    }

    private static void stringJoin(){
        System.out.println("------------- stringJoin ---------------");
        StringJoiner sj = new StringJoiner(",");
        sj.add("aaa");
        sj.add("bbb");
        sj.add("ccc");
        System.out.println(sj.toString()); //aaa,bbb,ccc

        sj = new StringJoiner("/", "prefix-", "-suffix");
        sj.add("2016");
        sj.add("02");
        sj.add("26");
        System.out.println(sj.toString()); //prefix-2016/02/26-suffix

        String result = String.join("-","2018","7","2");
        System.out.println(result);
    }

    private static void collertorsJoining(){
        System.out.println("------------- collertorsJoining ---------------");

        System.out.println("Join List<String> example.");
        List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
        String result = list.stream().collect(Collectors.joining(" | "));
        System.out.println(result);

        System.out.println("Join List<Object> example");
        List<Person> people = Person.getPeople();
        result = people.stream().map(Person::getName).collect(Collectors.joining(",","[","]"));
        System.out.println(result);
    }
}
