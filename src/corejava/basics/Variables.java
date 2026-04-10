package corejava.basics;

/**
 * Demonstrates different types of variables in Java:
 * - Instance, Static, Local, Parameter
 */
public class Variables {

    // Instance variable (belongs to object)
    int instanceVar = 100;

    // Static / Class variable (shared by all objects)
    static int staticVar = 500;

    public static void main(String[] args) {
        System.out.println("=== Variables in Java ===\n");

        int localVar = 50;                    // Local variable

        Variables obj = new Variables();

        System.out.println("Static Variable  : " + staticVar);
        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Local Variable   : " + localVar);

        // Changing values
        obj.instanceVar = 200;
        staticVar = 999;

        System.out.println("\nAfter modification:");
        System.out.println("Instance : " + obj.instanceVar);
        System.out.println("Static   : " + staticVar);

        showParameterExample(777);   // passing value to parameter
    }

    // Method with parameter
    public static void showParameterExample(int number) {
        System.out.println("Parameter received: " + number);
    }
}
