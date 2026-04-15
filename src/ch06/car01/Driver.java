package ch06.car01;

public class Driver {
    private Sonata sonata;
    public void setSonata(Sonata sonata) {
        this.sonata = sonata;
    }
    public void drive() {
        System.out.println("자동차를 운전합니다.");
        sonata.startEngine();
        sonata.pressAccelerator();
        sonata.offEngine();
    }
}
