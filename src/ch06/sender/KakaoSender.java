package ch06.sender;

public class KakaoSender implements Sender{

    @Override
    public void sendMessage(String message) {
        System.out.println("카카오메세지를 발송합니다. "+message);
    }
}
