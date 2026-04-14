package ch05.casting.inter;


public class Dog implements Animal {
    String value = "Dog";

    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 미쳐 날뜁니다.");
    }
}
