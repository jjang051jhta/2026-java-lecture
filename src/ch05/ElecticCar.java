package ch05;

public class ElecticCar extends Car {

    //annotation
    @Override
    void move() {
        System.out.println("전기차가 빠르게 움직입니다.");
    }

    void charge() {
        System.out.println("충전합니다.");
    }
    //override규칙
    //1. 이름이 같아야 한다.
    //2. 반환타입이 같아야 한다.
    //3. 매개변수의 타입 , 갯수 , 순서가 같아야 한다.
}
