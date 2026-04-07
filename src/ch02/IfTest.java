package ch02;

public class IfTest {
    static void main() {
        int num = 6778989;
        if (num % 2 == 1) {
            System.out.println("홀수입니다.");
        } else {
            System.out.println("짝수입니다.");
        }
        int score = 82;
        if (score > 90) {
            System.out.println("A");
        } else if (score > 80) {
            System.out.println("B");
        } else if (score > 70) {
            System.out.println("C");
        } else if(score > 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
