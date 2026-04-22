package ch07.answer02;

import java.util.Random;

public class Answer09 {
    //Random을 이용하여 주사위를 2개 던진 결과를 출력하고,
    //두 눈의 합도 출력하시오.
    static void main() {
        Random random = new Random();
        int dice01 = random.nextInt(6)+1;
        int dice02 = random.nextInt(6)+1;
        System.out.println("첫번째 주사위 : "+dice01);
        System.out.println("두번째 주사위 : "+dice02);
        System.out.println("합계 : "+(dice01+dice02));
    }
}
