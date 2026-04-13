package ch05;

public class CarTest {
    static void main() {
        ElecticCar myElCar = new ElecticCar();
        myElCar.charge();
        myElCar.move();

        GasCar myGasCar = new GasCar();
        myGasCar.fillUp();
        myGasCar.move();
    }
}
