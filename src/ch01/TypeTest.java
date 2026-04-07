package ch01;

public class TypeTest {
    static void main() {
        //자바에서 타입은 기본 타입 8개
        boolean isBool = true;  //true / false
        char ch = 'a'; //작은 따옴표로 문자 하나만 표시 이때 문자는 전부 정수로 변환 가능하다.
        byte b = 127;  // -128 ~ 127  1byte  정수  8bit(1,0)  = 1byte
        short sh = 10000; // 2의 16승              16bit = 2byte
        int num = 19_09899_800; //2의 32승         32bit = 4byte
        long long_num = 1999999999989898392l;  // 64bit = 8byte
        float num_float=0.2f;
        double num_double = 0.2;
        System.out.println(isBool);
        char ch02 = 65; // 65 - 'A', 66 - 'B'
        char ch03 = 24373; // 65 - 'A', 66 - 'B'  44032~55203 사이의 정수를 char로 바꾸면 한글이 나온다.
        System.out.println(  ch03  ); //형변환 (type casting)
        String str = "장성호";
        String strNull = null;
        //리터럴은 프로그래밍에서 사용하는 재료 주로 숫자 문자등 하나의 값으로 인식된다.

        int age = 30;
        age = 31;
        final double PI = 3.14;
        //PI = 4.25;
        System.out.println(PI);

        //type casting  形변환

        int num04 = 300;
        System.out.println(num04*3.14);
        System.out.println(314/(double)10);
        System.out.println((int)2.9);  //작은 타입은 큰 타입에 대입가능하다. 이때 아무런 영향을 받지 않는다.
        byte b02 = (byte)num04;
        // 큰 타입을 작은 타입에 넣을때는 반드시 형변환이 필요하다. 이때 값의 손실이 일어난다.
        System.out.println(b02);

    }
}
