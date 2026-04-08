package ch03;

public class Star {
    static void main() {
        for (int j = 5; j >=1; j--) {
            //j=1   i=*
            //j=2   i=**
            //j=3   i=***
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
