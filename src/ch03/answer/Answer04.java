package ch03.answer;
//1부터 10까지 반복하면서 각 숫자가 홀수인지 짝수인지 출력하는 프로그램을 작성하시오.
public class Answer04 {
    static void main() {
        for(int i=0;i<=10;i++) {
//            if(i%2==0) {
//                System.out.println(i+":"+"짝수");
//            } else {
//                System.out.println(i+":"+"홀수");
//            }
            String str = i%2==0 ? "짝수" : "홀수";
            System.out.println(i+":"+str);
        }
    }
}
