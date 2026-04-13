package ch05.answer;
//3. Person 클래스 상속
//Person 클래스를 만들고 name, age 필드를 선언하시오.
//생성자를 이용해 이름과 나이를 초기화하시오.
//Student 클래스가 Person을 상속받아 grade 필드를 추가하고, 생성자에서 super()를 사용하여 부모 생성자를 호출하시오.
//showInfo() 메서드로 이름, 나이, 학년을 모두 출력하시오.
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
