package ch01;

public class CircleArea {
    static double circleArea(double radius) {
        final double PI = 3.14;
        //double radius = 10;
        double result = radius*radius*PI;
        return result;
    }

    static void main() {
        //circleArea(); //314.0
        System.out.println(circleArea(10));
        System.out.println(circleArea(4));
    }
}
