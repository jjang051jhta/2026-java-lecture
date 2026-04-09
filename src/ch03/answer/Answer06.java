package ch03.answer;
//#### 6. 1부터 5까지 반복하면서 아래와 같이 출력하는 프로그램을 작성하시오.
//출력 예:
//1
//22
//333
//4444
//55555
public class Answer06 {
    static void main() {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
