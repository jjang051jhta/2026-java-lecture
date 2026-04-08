package ch02.answer;

public class Answer09 {
    static void main() {
        double weight = 95.5;
        double height = 182.2;
        double bmi = 0;
        double heightMeter =  height/100;
        bmi =  weight / (heightMeter*heightMeter);
        String result = null;
        if(bmi<20) {
            result="저체중";
        } else if(bmi>=20 && bmi<25) {
            result="정상";
        } else if(bmi>=25 && bmi<30) {
            result="과체중";
        } else {
            result="비만";
        }
        System.out.printf("당신의 몸무게는 %.2f 키는 %.2f이고 %s",weight, height,result);
    }
}
