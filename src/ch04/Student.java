package ch04;

public class Student {
    String name="장성호";
    int grade=1;
    int kor,eng,math;
    void showInfo(){
        System.out.println("이름 : "+name+
                " / 학년 : "+grade);
    }
    double average() {
        int temp = (int)((kor+eng+math)/3.0 * 100);
        return temp/100.0;
    }
}
