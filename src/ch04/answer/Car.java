package ch04.answer;

public class Car {
    String brand;
    int speed;
    Car() {
        speed = 0;
    }
    void showInfo() {
        System.out.println
                ("나의 차는 "+brand+"이고 현재 속도는 "+speed);
    }
    void accelerate() {
        speed = speed + 10;
    }
}
