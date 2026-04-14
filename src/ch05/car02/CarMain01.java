package ch05.car02;

public class CarMain01 {
    static void main() {
        Driver driver = new Driver();

        Car sonata = new Sonata();
        driver.setCar(sonata);
        driver.drive();

        Car k5 = new K5();
        driver.setCar(k5);
        driver.drive();

        Car sorrento = new Sorrento();
        driver.setCar(sorrento);
        driver.drive();
    }
}
