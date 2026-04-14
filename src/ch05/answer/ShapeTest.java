package ch05.answer;

public class ShapeTest {
    static void main() {
        //Circle circle02 = new Circle();
        Circle circle = new Circle(5);
        circle.radius=10;
        circle.area();

        Rectangle rectangle = new Rectangle(10,5);
        rectangle.area();
    }
}
