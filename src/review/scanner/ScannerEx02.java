package review.scanner;

import java.util.Scanner;

public class ScannerEx02 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0;
        int input = 0;
        System.out.println("숫자를 입력하세요. 중단할려면 -1을 입력하세요.");
        while (true) {
            input = scanner.nextInt();
            if (input == -1) break;
            sum += input;
            count++;
        }
        avg = sum / count;
        System.out.println("총합 : "+sum);
        System.out.println("편균 : "+avg);
    }
}
