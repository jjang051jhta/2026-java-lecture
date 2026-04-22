package ch07.answer02;

import java.util.Random;

public class Answer06 {
    //1부터 45까지의 랜덤 정수 10개를 출력하시오.
    static void main() {
        Random random = new Random();
        for(int i=0;i<6;i++) {
            int num = random.nextInt(45)+1;
            System.out.print(num+"/");
        }
    }
}
