package ch04;

public class Student {
    String name="장성호";
    int grade=1;
    int kor,eng,math;
    Student() {

    }
    Student(String name,int grade) {
        this.name = name;
        this.grade = grade;
    }
    void showInfo(){
        System.out.println("이름 : "+name+
                " / 학년 : "+grade);
    }
    int total() {
       return kor+eng+math;
    }
    double average() {
        //int temp = (int)((kor+eng+math)/3.0 * 100);
        int temp = (int)(total()/3.0 * 100);
        return temp/100.0;
    }
}
