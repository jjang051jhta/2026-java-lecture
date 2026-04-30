package ch11.compare.answer;

import java.util.Arrays;
import java.util.Comparator;

public class Answer08 {
    static void main() {
        Student [] students= {
                new Student("kim",80,90),
                new Student("lee",90,70),
                new Student("park",85,85),
                new Student("choi",90,90)
        };
        Arrays.sort(students,new StudentComparator());
        System.out.println(Arrays.toString(students));
    }
}
class Student {
    private String name;
    private  int kor;
    private int eng;

    public Student(String name, int kor, int eng) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }
    public int getTotal() {
        return kor+eng;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                '}';
    }
}
//일론머스크  메서드가 하나일때 굳이 이름을 호출하지 않아도 된다. 이때 람다식을 쓸 수 있다.
class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        //int sum01 = o1.getTotal();
        //int sum02 = o2.getTotal();
        int result = Integer.compare(o1.getTotal(),o2.getTotal());
        if(result==0) {
            return o1.getName().compareTo(o2.getName());
        }
        return result;
    }
}