package ch04.answer;

public class TVTest {
    static void main() {
        int volumn=0;
        TV myTv =
        new TV("삼성 올레드",60,0);
        myTv.turnOn();
        myTv.volumeUp();
        myTv.volumeUp();
        System.out.println("현재 볼륨은 "+myTv.volumn);
        myTv.volumeDown();
        System.out.println("현재 볼륨은 "+myTv.volumn);
        myTv.turnOff();
    }
}
