package ch05.pay02;

public class PayService {
    public void payProcess(String option,int amount) {
        System.out.println("결제를 시작합니다. option : "+option+" , amount : "+amount);
        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);
        if(result) {
            System.out.println("결제를 성공했습니다.");
        } else {
            System.out.println("결제를 실패했습니다.");
        }
    }
}
