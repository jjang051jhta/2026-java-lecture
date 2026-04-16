package review.scanner;

import java.util.Scanner;

public class Scanner01 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");
        String str = scanner.nextLine(); //입력을 String으로 바꿔준다.
        System.out.println(str);
        System.out.println("정수를 입력하세요,");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수 : "+intValue);
        System.out.println("입력한 정수의 두배 : "+intValue*2);

        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수 : "+doubleValue);
        System.out.println("입력한 실수의 두배 : "+doubleValue*2);




    }
}
