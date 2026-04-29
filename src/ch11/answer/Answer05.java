package ch11.answer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Answer05 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("장동건","모바일",1,3.4));
        studentList.add(new Student("원빈","데이터베이스",2,3.9));
        studentList.add(new Student("현빈","자동차",3,4.1));
        studentList.add(new Student("고수","화학",4,3.25));
        while(true) {
            System.out.println("이름을 입력하세요.");
            String name = scanner.nextLine();
            if(name.equals("그만")) break;
            Iterator<Student> iterator = studentList.iterator();
            while (iterator.hasNext()){
                Student student = iterator.next();
                if(student.name.equals(name)) {
                    System.out.println(student.name+","+student.department+","+student.id+","+student.score);
                }
            }
        }
    }
}
class Student {
    String name;
    String department;
    int id;
    double score;

    public Student(String name, String department, int id, double score) {
        this.name = name;
        this.department = department;
        this.id = id;
        this.score = score;
    }
}
