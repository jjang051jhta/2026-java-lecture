package ch04;

public class TV {
    int size;
    int pixel;
    String brand;
    int volumn;
    //function 정의
    // 메서드 (method)
    void turnOn() {
        System.out.println("전원 들어옵니다.");
    }
    void volumnUp() {
        if(volumn<50) {
            volumn = volumn + 10;
        }
        System.out.println("현재 볼륨은 "+volumn+"입니다.");
    }
    void volumnDown() {
        if(volumn > 0) {
            volumn = volumn - 10;
        }
        System.out.println("현재 볼륨은 "+volumn+"입니다.");
    }

    void turnOff() {
        System.out.println(" tv를 끕니다.");
    }

    void showInfo() {
        System.out.println("나의 tv 브랜드는 " +brand +
                " size는 " +size +
                " 화소는 " +pixel+
                " 현재 볼륨은 "+volumn);
    }
}
