package ch05.answer;

public class Car extends Vehicle {
    @Override
    int accelerate() {
        speed+=20;
        return speed;
    }
}
