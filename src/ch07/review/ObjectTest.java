package ch07.review;

public class ObjectTest {
    static void main() {
        action(new Pig());
        action(new Airplane());
    }
    static void action(Object object) {
        //object.sound();
        if(object instanceof Pig pig) {
            pig.sound();
        } else if(object instanceof Airplane airplane) {
            airplane.fly();
        }
    }

}
class Pig {
    public void sound() {
        System.out.println("꿀꿀");
    }
}
class Airplane {
    public void fly() {
        System.out.println("하늘을 납니다.");
    }
}
