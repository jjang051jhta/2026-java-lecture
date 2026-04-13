package ch04.answer;

public class Rectangle {
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
    int getArea(){
       return  width*height;
    }
    int getPerimeter() {
        return width*2+ height*2;
    }
}
