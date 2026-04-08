package ch03.answer;

public class Answer03 {
    static void main() {
        int sum = 0;
        for (int i=0;i<=100;i++) {
            if (i%5==0) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
