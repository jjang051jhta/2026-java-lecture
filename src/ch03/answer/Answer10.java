package ch03.answer;
//10. 배열에 저장된 점수 중 60점 이상인 점수만 출력하고, 합격자 수를 구하는 프로그램을 작성하시오.
//int[]scores= {55,70,85,40,90,60};
//  1  2  3  4  5
//  16 17 18 19 6
//  15 24 25 20 7
//  14 23 22 21 8
//  13 12 11 10 9
public class Answer10 {
    static void main() {
        int[]scores= {55,70,85,40,90,60};
        int count=0;
        for(int i=0;i< scores.length;i++) {
            if(scores[i]>=60) {
                System.out.println(scores[i]);
                count++;
            }
        }
        System.out.println(count+"명이 합격");
    }
}
