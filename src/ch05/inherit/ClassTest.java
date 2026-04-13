package ch05.inherit;

public class ClassTest {
    static void main() {
        Student student = new Student();
        student.study();
        student.eat();
        StudentWokrer studentWokrer = new StudentWokrer();
        studentWokrer.work();

        Researcher researcher = new Researcher();
        researcher.eat();
        researcher.research();

        Professor professor = new Professor();
        professor.research();
        professor.teach();

    }
}
