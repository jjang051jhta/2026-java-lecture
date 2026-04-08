package ch03.answer;

//1. 1부터 10까지 출력하되, 짝수만 출력하는 프로그램을 작성하시오.
public class Answer01 {
    static void main() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) continue;
            System.out.println(i);
        }
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) continue;
            System.out.println(i);
        }
        for (int i = 0; i <= 10; i+=2) {
            System.out.println(i);
        }
    }
}
