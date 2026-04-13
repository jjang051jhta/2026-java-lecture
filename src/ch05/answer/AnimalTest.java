package ch05.answer;

public class AnimalTest {
    static void main() {
        Dog dog = new Dog();
        dog.name = "댕댕이";
        System.out.println("나의 강아지 이름은 "+dog.name+"입니다.");
        dog.sound();
    }
}
