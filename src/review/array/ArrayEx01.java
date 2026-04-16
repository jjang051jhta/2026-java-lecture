package review.array;

import java.util.Scanner;

public class ArrayEx01 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("역순으로 출력");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + ",");
        }
    }
}
