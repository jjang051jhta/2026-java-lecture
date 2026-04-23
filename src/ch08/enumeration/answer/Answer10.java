package ch08.enumeration.answer;

public class Answer10 {
    static void main() {
        Operator operator = Operator.MULTIPLY;
        int result = operator.calculate(10, 10);
        System.out.println(result);
    }
}
