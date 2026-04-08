package ch02.answer;

//4. Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.
//평균값을 구하는 것이 아님에 주의
//정수 3개 입력 >> 20 100 33
//중간 값은 33
public class Answer04 {
    static void main() {
        int a = 20, b = 100, c = 33;
        int center = 0;
        //System.out.println(center);
        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            center = a;
        } else if (b >= a && b <= c || b <= a && b >= c) {
            center = b;
        } else {
            center = c;
        }
        System.out.println("세 숫자 "+a+","+b+","+c+"의 중간은 "+center+"입니다.");
    }
}
