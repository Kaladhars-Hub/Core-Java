package OOPS.AccessModifiers.Examples;

public class EmployeeEx3 {

   public String company = "TCS";
   private int salary = 50000;
    protected String department = "Development";
}

class DeveloperEx3 extends EmployeeEx3 {

    void showDetails() {
        System.out.println(company);
        System.out.println(department);
    }
    public static void main(String[] args) {
        DeveloperEx3 d = new DeveloperEx3();

        d.showDetails();
    }
}
