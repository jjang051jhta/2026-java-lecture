package ch05.casting.inter;

public  class Pig implements Animal {
    public void sound() {
        System.out.println("꿀꿀");
    }

    @Override
    public void move() {
        System.out.println("돼지는 잘 움직이지 않습니다.");
    }
}
