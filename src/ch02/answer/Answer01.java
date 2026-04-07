package ch02.answer;

import java.util.Scanner;

//1. Scanner 클래스를 이용하여 입력받은 원화 값을 달러로 바꾸어
//다음 예시와 같이 출력하는 프로그램을 작성하라.
//($1=1500원으로 가정) 원화를 입력하세요(단위 원) >> 3300
//5500원은 $3.0입니다.
public class Answer01 {
    static void main() {
        System.out.println("원을 입력하면 달러로 바꿔줍니다.");
        Scanner scanner = new Scanner(System.in);
        int won = scanner.nextInt();
        double dollar =  won/(double)1500;
        //System.out.println(won+"은 $"+dollar+"입니다.");
        System.out.printf("%d은 $%.3f 입니다.",won,dollar);
    }
}
