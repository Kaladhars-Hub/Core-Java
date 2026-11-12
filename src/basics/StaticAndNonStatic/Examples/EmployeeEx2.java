package basics.StaticAndNonStatic.Examples;

public class EmployeeEx2 {

    static String company = "Google";

    String employeeName;

    static void companyName() {
        System.out.println(company);
    }
        void showEmployeeName() {
            System.out.println(employeeName);
        }

        public static void main(String[] args) {

        EmployeeEx2 e1 = new EmployeeEx2();
        EmployeeEx2 e2 = new EmployeeEx2();

        e1.employeeName = "Steve Jobs";
        e2.employeeName = "Elon Musk";

             companyName();

            e1.showEmployeeName();
            e2.showEmployeeName();
        }
}


/*


Your output will be:
Google
Steve Jobs
Elon Musk

Why your code is correct
You created the shared static variable correctly:
static String company = "Google";

Both employees share this one company value.
You created an object-specific variable:
String employeeName;

So:
e1.employeeName = "Steve Jobs";
e2.employeeName = "Elon Musk";

Each object has its own employeeName.
Your static method:
static void companyName() {
    System.out.println(company);
}

can be called directly from main() because both main() and companyName() are static:
companyName();

And your non-static method:
void employeeName() {
    System.out.println(employeeName);
}

needs an object, which you did correctly:
e1.employeeName();
e2.employeeName();


 */