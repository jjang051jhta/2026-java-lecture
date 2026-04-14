package ch05.casting.abs;

public  class Pig extends Animal {
    void sound() {
        System.out.println("꿀꿀");
    }

    @Override
    void move() {
        System.out.println("돼지는 잘 움직이지 않습니다.");
    }
}
