package java8.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Flatting {
    public static void main(String[] args) {
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        Stream<String[]> temp = Arrays.stream(data);

        Stream<String> stringStream = temp.flatMap(Arrays::stream);

        Stream<String> stream = stringStream.filter(item -> !"a".equals(item));

        stream.forEach(System.out::println);
    }
}
