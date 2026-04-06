public class OperatorTest {
    static void main() {
        //산술 연산  +,-,*,/,%
        System.out.println(10 + 10);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10.0 / 4);
        System.out.println(10 % 2);
        //
        int time = 5000;//초단위의 숫자를 입력받았을때 몇시간 몇분 몇초인지 알 수 있는 프로그래밍
        int second = time % 60;
        int minute = time / 60 % 60;
        int hour = time / 60 / 60;
        System.out.println(time + "초는 " + hour + "시간" + minute + "분 " + second + "초 입니다.");

        /////////////////////////////////////////////////////
        int a = 1;
        int b = 1;
        a = a + 1;
        a += 1;
        a++;
        int c = a++; //  ++은  후위 증감 연산자 먼저 할당하고 나중에 연산
        // c = 4 , a = 5
        //int c = ++a; //  ++은  선위 증감 연산자 먼저 할당하고 나중에 연산
        //c = 5, a = 5
        System.out.println(a + "===" + c);
        a = a * 3;
        //비교 연산
        int d = 5;
        int e = 3;
        System.out.println(d > e);
        System.out.println(d < e);
        System.out.println(d >= e);
        System.out.println(d <= e);
        System.out.println(d == e);
        System.out.println(d != e);
        //논리 연산
        System.out.println( !(5 > 3) ); //  !는 부정 연산
        System.out.println(!true);
        System.out.println( 5 > 3 || 4 > 5 );  // or 연산
        System.out.println( 5 > 3 && 4 > 5 );  // and 연산
        System.out.println( 5 < 3 ^ 4 > 5 );  // xor 연산 서로 다르면 true

    }
}
