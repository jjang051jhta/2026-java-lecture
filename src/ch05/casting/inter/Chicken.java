package ch05.casting.inter;


public class Chicken implements Animal,Fly {
    String vale= "Chicken";
    public void sound() {
        System.out.println("꼬꼬댁");
    }

    @Override
    public void move() {
        System.out.println("닭이 날듯이 뛰어다닙니다.");
    }

    @Override
    public void fly() {
        System.out.println("치킨은 가끔 하늘을 날기도 합니다.");
    }
}
