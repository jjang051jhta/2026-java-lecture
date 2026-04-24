package ch10.exception.ex02;

import java.util.Scanner;

public class Main02 {
    static void main() {
        NetworkService02 networkService02 = new NetworkService02();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")) {
                break;
            }
            networkService02.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
