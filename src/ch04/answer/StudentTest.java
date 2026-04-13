package ch04.answer;

public class StudentTest {
    static void main() {
        Student student =
                new Student("장성호");
        student.kor=90;
        student.eng=80;
        student.math=56;
        int total = student.getTotal();
        double avg =  student.getAverage();
        System.out.println("총점 : "+total+" / 평균 : "+avg);
    }
}
