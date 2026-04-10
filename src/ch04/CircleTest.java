package ch04;

public class CircleTest {
    static void main() {
        Circle circle = new Circle(30);
        //circle.radius=10;
        circle.name="자바 피자";
        double area = circle.getArea();
        System.out.println(circle.name+"의 면적은 "+area+"입니다.");

        Circle donut = new Circle("자바도넛",15);
        double area02 = donut.getArea();
        System.out.println(donut.name+"의 면적은 "+area02+"입니다.");

    }
}
