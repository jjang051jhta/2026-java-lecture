package ch05.answer;
//2. Vehicle 클래스 상속

//Vehicle 클래스를 만들고 brand, speed 필드를 선언하시오.
//accelerate() 메서드는 속도를 10 증가시키도록 작성하시오.
//Car 클래스가 Vehicle을 상속받아 accelerate()를 호출할 때 속도를 20 증가시키도록 오버라이딩하시오.
public class Vehicle {
    String brand;
    int speed;
    int accelerate() {
        speed +=10;
        return speed;
    }
}
