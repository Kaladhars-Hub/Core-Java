package OOPS.Encapsulation.Examples;

public class EmployeeEx3 {

    private int employeeId = 101;

    public int getEmployeeId() {
        return employeeId;
    }

    public static void main(String[] args) {
        EmployeeEx3 e = new EmployeeEx3();

        System.out.println(e.getEmployeeId());
    }

}

