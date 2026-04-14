package ch05.casting.inter;

public class Nalchi implements Animal, Swimable, Fly {
    @Override
    public void sound() {
        System.out.println("날치도 소리를 냅니다.");
    }

    @Override
    public void move() {
        System.out.println("날치도 움직입니다.");
    }

    @Override
    public void fly() {
        System.out.println("날치도 하늘을 날아다닙니다.");
    }

    @Override
    public void swim() {
        System.out.println("날치도 헤엄쳐 다닙니다.");

    }
}
