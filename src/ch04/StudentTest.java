package ch04;

public class StudentTest {
    static void main() {
        Student student01 = new Student();
        student01.name = "장동건";
        student01.grade=2;
        Student student02 = new Student();
        student02.name="현빈";
        student02.grade=3;
        Student student03 = new Student();
        student01.showInfo();
        student02.showInfo();
        student03.showInfo();
    }
}
