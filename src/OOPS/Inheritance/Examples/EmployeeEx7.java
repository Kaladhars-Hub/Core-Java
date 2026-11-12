package OOPS.Inheritance.Examples;

public class EmployeeEx7 {

    String role = "Employee";
}

class DeveloperEx7 extends EmployeeEx7 {

    String role = "Java Developer";

    void showRoles() {
        System.out.println(role);       // Child's role
        System.out.println(super.role); // Immediate parent's role
    }
    public static void main(String[] args) {

        DeveloperEx7 d = new DeveloperEx7();

        d.showRoles();
    }
}

