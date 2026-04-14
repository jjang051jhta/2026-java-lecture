package ch05.answer;

public class Circle extends Shape{
    int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("반지름 "+radius+"의 면적은 "+
                (radius*radius*3.14));
    }
}
