package OOPS.Encapsulation.Examples;

public class EmployeeEx1 {

    private int salary = 30000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        salary = newSalary;
    }
    public static void main(String[] args) {
        EmployeeEx1 e = new EmployeeEx1();

        System.out.println(e.getSalary());
        e.setSalary(45000);
        System.out.println(e.getSalary());
    }
}


/*
Flow:

salary = 30000

e.getSalary()
     ↓
returns 30000

e.setSalary(45000)
     ↓
newSalary receives 45000
     ↓
salary = newSalary
     ↓
salary becomes 45000

e.getSalary()
     ↓
returns 45000

 */