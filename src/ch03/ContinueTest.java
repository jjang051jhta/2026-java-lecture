package ch03;

public class ContinueTest {
    static void main() {
        int sum = 0;
        //continue는 건너뛰기(반복문 안에 실행문을 건너뛴다)
        //break는 반복문을 빠져 나간다.
        for(int i = 1;i<=30;i++) {
            if(i%20 == 0) {
                break;
            }
            System.out.print(i+" / ");
        }
    }
}
