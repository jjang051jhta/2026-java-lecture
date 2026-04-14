package ch05.car01;

public class CarMain01 {
    static void main() {
        Driver driver = new Driver();

        Sonata sonata = new Sonata();
        driver.setSonataCar(sonata);
        driver.drive();

        K5 k5 = new K5();
        driver.setSonataCar(null);
        driver.setK5Car(k5);
        driver.drive();
    }
}
