package ch04.answer;

public class PersonTest {
    static void main() {
        Person p01 = new Person();
        p01.name = "장성호";
        p01.age=30;
        p01.showInfo();

        Person p02 = new Person("현빈");
        p02.age=40;
        p02.showInfo();

        Person p03 = new Person("송강호",50);
        p03.showInfo();
    }
}
