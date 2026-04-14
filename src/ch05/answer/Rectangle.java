package ch05.answer;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width) {
        this.width = width;
        this.height = width;
    }

    public Rectangle() {
    }

    @Override
    void area() {
        System.out.println("넓이 : "+width+",높이 : "+height+"의 넓이는 "+(width*height));
    }
}
