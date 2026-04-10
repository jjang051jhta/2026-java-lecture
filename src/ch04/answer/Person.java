package ch04.answer;

public class Person {
    String name;
    int age;

    Person() {

    }

    Person(String name) {
        this.name = name;
    }
    Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
    void showInfo() {
        System.out.
                println("이름 : "+name+" / age : "+age);
    }
}
