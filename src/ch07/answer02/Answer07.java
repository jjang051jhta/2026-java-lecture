package ch07.answer02;

import java.util.Random;

public class Answer07 {
    //    1부터 100까지의 랜덤 정수 5개를 생성하고,
    //
    //    각 숫자와 합계, 평균을 출력하시오.
    static void main() {
        Random random = new Random();
        int sum = 0;
        for(int i=0;i<5;i++) {
            int num = random.nextInt(100)+1;
            System.out.println("생성된 수 : "+num);
            sum+=num;
        }
        System.out.println("합계 : "+sum);
        System.out.println("평균 : "+ sum/5.0);
    }
}
