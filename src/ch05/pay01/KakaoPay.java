package ch05.pay01;

public class KakaoPay {
    public boolean pay(int amount) {
        System.out.println("카카오페이 시스템과 연결을 시도합니다.");
        System.out.println(amount+"원을 결제합니다.");
        return true;
    }
}
