package ch05.answer;
//1. Animal 클래스 상속
//
//Animal 클래스를 만들고 name 필드를 선언하시오.
//sound() 메서드는 "동물이 소리를 냅니다."를 출력하도록 작성하시오.
//Dog 클래스가 Animal을 상속받아 sound()를 "멍멍"으로 오버라이딩하도록 작성하시오.
public class Animal {
    String name;

    void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}
