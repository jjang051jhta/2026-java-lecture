package ch05.answer;

public class CarTest {
    static void main() {
        Car car = new Car();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        System.out.println("현재 자동차의 속도는 "+car.speed+"입니다.");
    }
}
