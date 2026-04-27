package ch10.exception.ex04;

import ch10.exception.ex03.NetworkClientException01;
import ch10.exception.ex03.NetworkService06;

import java.util.Scanner;

public class Main {
    static void main() throws NetworkClientException01 {
        NetworkService networkService = new NetworkService();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")) {
                break;
            }
            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandling(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }

    private static void exceptionHandling(Exception e) {
        System.out.println("사용자 메세지 : 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("===개발자용 디버깅 메세지===");
        e.printStackTrace();
        if(e instanceof SendException sendException){
            System.out.println("[전송오류] 전송데이터 : "+sendException.getSendData());
        } else if(e instanceof ConnectException connectException) {
            System.out.println("[연결오류]  : "+connectException.getAddress());
        }
    }
}
