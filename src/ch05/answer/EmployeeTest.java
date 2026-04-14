package ch05.answer;

public class EmployeeTest {
    static void main() {
        Employee employee =
        new Employee("장성호",1000);
        employee.showSalary();

        Manager manager = new Manager("장동건",1500,300);
        manager.showSalary();
    }
}
