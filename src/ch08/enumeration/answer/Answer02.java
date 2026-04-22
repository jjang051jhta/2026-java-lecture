package ch08.enumeration.answer;

import java.util.Scanner;

public class Answer02 {
    static void main() {
        //Grade grade = Grade.GOLD;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (grade) {
            case BASIC:
                System.out.println("BASIC");
                break;
            case GOLD:
                System.out.println("GOLD");
                break;
            case DIAMOND:
                System.out.println("DIAMOND");
                break;
            default:
                System.out.println("등급이 없습니다.");
        }
        switch (grade) {
            case BASIC -> System.out.println("BASIC");
            case GOLD -> System.out.println("GOLD");
            case DIAMOND -> System.out.println("DIAMOND");
            default -> System.out.println("등급이 없습니다.");
        }

    }
}
