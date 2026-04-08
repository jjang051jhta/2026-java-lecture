package ch03;

public class WhileTest {
    static void main() {
        int i=1;
        int sum=0;
        while(i<=10) {
            if(i<10) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "=");
            }
            sum+=i;
            i++;
        }
        System.out.print(sum);
        // 1+2+3+4+5+6+7+8+9+10=55
    }
}
