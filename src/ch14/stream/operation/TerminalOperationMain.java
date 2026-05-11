package ch14.stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class TerminalOperationMain {
    static void main() {
        List<Integer> nums = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);
        System.out.println("1. collect - List 수집");
        List<Integer> evenNums = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("짝수 리스트 : " + evenNums);
        System.out.println("");

        System.out.println("2. toList() - java 16");
        List<Integer> evenNums02 = nums.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("짝수 리스트 : " + evenNums02);
        System.out.println("");

        System.out.println("3. toArray() - 배열로 변환");
        Integer[] evenNums03 = nums.stream()
                .filter(n -> n % 2 == 0)
                .toArray(Integer[]::new);
        System.out.println("짝수 리스트 : " + Arrays.toString(evenNums03));
        System.out.println("");

        System.out.println("4. forEach - 각 요소들을 처리");
        nums.stream()
                .limit(5)
                .forEach(n -> System.out.print(n + ","));
        System.out.println("");

        System.out.println("5. count - 갯수");
        long count = nums.stream()
                .filter(n -> n < 5)
                .count();
        System.out.println("5보다 작은 숫자 갯수 : " + count);
        System.out.println();

        System.out.println("6. reduce 누적연산");
        Optional<Integer> sum01 = nums.stream()
                .reduce((a, b) -> {
                    int result = a + b;
                    System.out.println("a : " + a + " / " + "b : " + b + " = " + result);
                    return result;
                });
        System.out.println("누적된 값은 : " + sum01.get());
        System.out.println();

        System.out.println("7. reduce 누적연산");
        Integer sum02 = nums.stream()
                .reduce(100, (a, b) -> {
                    int result = a + b;
                    System.out.println("a : " + a + " / " + "b : " + b + " = " + result);
                    return result;
                });
        System.out.println("누적된 값은 : " + sum02);
        System.out.println();

        System.out.println("8. reduce 누적연산");
        List<String> words = List.of("Hello", "Java", "!!");
        Optional<String> sum03 = words.stream()
                .reduce((a, b) -> {
                    String result = a + " " + b;
                    System.out.println("a : " + a + " / " + "b : " + b + " = " + result);
                    return result;
                });
        System.out.println("누적된 값은 : " + sum03.get());
        System.out.println();

        System.out.println("9. min() 최소값");
        Optional<Integer> min = nums.stream()
                .min(Integer::compareTo);
        System.out.println("최소 값은 : " + min.get());
        System.out.println();

        System.out.println("10. max() 최대값");
        Optional<Integer> max = nums.stream()
                .max(Integer::compareTo);
        System.out.println("최대 값은 : " + max.get());
        System.out.println();


    }
}
