package ch07.review;

public class StringTest {
    static void main() {
        //  동일성 ( == ) vs 동등성
        String hello =  new String("hello");
        String hello02 =  new String("hello");
        String world01 = "world";  //String pool
        String world02 = "world";
        System.out.println(hello == hello02);
        System.out.println(hello.equals(hello02));
        System.out.println(world01 == world02);
        System.out.println(world01.equals(world02));
    }
}
