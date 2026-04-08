package ch03;

public class ForTest {
    static void main() {
        int sum = 0;
        for (int i = 1; i <= 100; i+=2) {
            //System.out.println("hello world  " + i);
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
