package ch14.stream.operation;

import java.util.Arrays;
import java.util.List;
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
        System.out.println("5보다 작은 숫자 갯수 : "+count);
        System.out.println();


    }
}
