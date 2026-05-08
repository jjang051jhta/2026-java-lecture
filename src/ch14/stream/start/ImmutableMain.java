package ch14.stream.start;

import java.util.List;

public class ImmutableMain {
    static void main() {
        List<Integer> originalList = List.of(1,2,3,4,5);
        List<Integer> filteredList = originalList.stream()
                .filter(n->n%2==0)
                .toList();
        System.out.println("filteredList = "+filteredList);
        System.out.println("originalList = "+originalList);
    }
}
