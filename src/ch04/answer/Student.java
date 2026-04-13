package ch04.answer;

public class Student {
    String name;
    int kor;
    int eng;
    int math;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
       return kor+eng+math;
    }
    double getAverage() {
        return (int)(getTotal()/3.0*100) / 100.0;
    }
}
