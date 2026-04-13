package ch04.answer;

public class RectangleTest {
    static void main() {
        Rectangle rectangle =
       new Rectangle(10,20);
        int area = rectangle.getArea();
        int perimeter = rectangle.getPerimeter();
        System.out.println("면적 : "+area+
                " / 둘레 : "+perimeter);

    }
}
