package ch05.pay02;


//ocp(open close principle)
//open 확장에는 열려있어야 한다.
//close 기존코드에는 닫혀있어야 한다.
public class PayMain {
    static void main() {
        PayService payService = new PayService();
        String payOption01 = "kakao";
        int amount = 10000;
        payService.payProcess(payOption01,amount);

        String payOption02 = "naver";
        amount = 30000;
        payService.payProcess(payOption02,amount);

        String payOption03 = "toss";
        amount = 50000;
        payService.payProcess(payOption03,amount);
    }
}
