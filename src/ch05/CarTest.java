package ch05;

public class CarTest {
    static void main() {
        ElecticCar myElCar = new ElecticCar();
        myElCar.charge();
        myElCar.move();
        myElCar.openDoor();

        GasCar myGasCar = new GasCar();
        myGasCar.fillUp();
        myGasCar.move();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.fillHydrogen();
        hydrogenCar.move();
    }
}
