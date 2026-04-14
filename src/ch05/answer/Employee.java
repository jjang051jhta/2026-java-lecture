package ch05.answer;
//Employee 클래스를 만들고 name, salary 필드를 선언하시오.
//showSalary() 메서드로 급여를 출력하시오.
//Manager 클래스가 Employee를 상속받아 bonus 필드를 추가하고,
//showSalary()를 오버라이딩하여 기본 급여와 보너스를 합친 금액을 출력하시오.
public class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    void showSalary() {
        System.out.println(name+"님의 급여 : "+salary);
    }
}
