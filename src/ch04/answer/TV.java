package ch04.answer;

public class TV {
    String brand;
    int size;
    int volumn;

    public TV(String brand, int size, int volumn) {
        this.brand = brand;
        this.size = size;
        this.volumn = volumn;
    }
    void turnOn(){
        System.out.println("TV를 켭니다.");
    }
    void turnOff(){
        System.out.println("TV를 끕니다.");
    }
    int volumeUp() {
       return volumn+=10;
    }
    int volumeDown() {
        return volumn-=10;
    }
}
