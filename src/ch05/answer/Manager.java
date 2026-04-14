package ch05.answer;

public class Manager extends Employee {
    //생성자
    int bonus;
    Manager(String name,int salary, int bonus) {
       super(name,salary);
       this.bonus = bonus;
    }
    void showSalary() {
        System.out.println(name+"님의 급여 : "+(salary+bonus));
    }
}
