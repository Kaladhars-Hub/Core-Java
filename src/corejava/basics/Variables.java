package corejava.basics;

/**
 * Demonstrates different types of variables in Java:
 * - Instance, Static, Local, Parameter
 */
public class Variables {

    // Instance variable (belongs to object)
    int age = 25;

    // Static / Class variable (shared by all objects)
    static String company = "Google";

    public static void main(String[] args) {
        System.out.println("=== Variables in Java ===\n");

        // Local variable → inside method
        int salary = 50000;

        // Creating object for instance variable
        Variables obj = new Variables();

        // Accessing variables
        System.out.println(obj.age);     // Instance → needs object
        System.out.println(company);    // Static → no object needed
        System.out.println(salary);     // local

        // Changing values
        obj.age = 30;                 // instance variable changed
        company = "Microsoft";        // static variable changed

        System.out.println("\nAfter modification:");
        System.out.println("Instance : " + obj.age);
        System.out.println("Static   : " + company);

        showParameterExample(777);   // passing value to parameter
    }

    // Method with parameter
    public static void showParameterExample(int number) {
        System.out.println("Parameter received: " + number);
    }
}
