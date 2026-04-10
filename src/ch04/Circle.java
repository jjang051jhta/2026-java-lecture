package ch04;

public class Circle {
    //생성자   연산자
    //class
    int radius = 10;
    String name;

    Circle() {
        System.out.println("생성자도 결국 함수다.");
        radius = 100;
    }
    Circle(int _radius) {
        radius = _radius;
        System.out.println("나는 매개변수를 가지는 생성자 함수이다.");
    }
    Circle(String _name,int _radius) {
        System.out.println("나는 매개변수를 2개 가지는 생성자 함수이다.");
        radius = _radius;
        name = _name;
    }

    //f(x,y) = x+y;  f(3,4) = 3+4;


    double getArea() {
        return radius * radius * 3.14;
    }
}
