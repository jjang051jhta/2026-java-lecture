package ch04.answer;

public class CarTest {
    static void main() {
        Car myCar = new Car();
        myCar.brand="페라리";
        for(int i=0;i<100;i++) {
            myCar.accelerate();
        }


        myCar.showInfo();
        myCar.decelerate();
        myCar.decelerate();
        myCar.decelerate();
        myCar.decelerate();
        myCar.showInfo();

    }
}
