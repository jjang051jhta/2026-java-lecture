package ch14.stream.start;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamStartMain {
    static void main() {
        //Stream
        List<String> names = List.of("Apple", "Banana", "Berry", "Tomato");
        Stream<String> stream = names.stream();
        List<String> result = stream
                .filter(s -> s.startsWith("B"))
                .map(s -> s.toUpperCase())
                .toList(); //최종연산
        System.out.println(result);
        for(String s:result) {
            System.out.println(s);
        }
        names.stream()
                .filter(s -> s.startsWith("B"))  //filter, map은 중간연산
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));
        names.stream()
                .filter(s -> s.startsWith("B"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
