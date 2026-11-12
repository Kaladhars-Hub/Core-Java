package OOPS.Abstract.Examples;

public abstract class EmployeeEx2 {

    int salary;

    EmployeeEx2(int newSalary) {
        salary = newSalary;
    }

    void showSalary() {
        System.out.println(salary);
    }

    abstract void work();
}
