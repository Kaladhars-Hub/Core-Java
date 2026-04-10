package corejava.basics;

public class PrintStatements {

    public static void main(String[] args) {

        System.out.println("=== Different ways to Print in Java ===\n");

        // 1. println() - prints and moves to next line
        System.out.println("Hello World using println");

        // 2. print() - prints without new line
        System.out.print("Hello ");
        System.out.print("World using print");
        System.out.println(); // just to move to next line

        // 3. printf() - formatted printing
        String name = "Light";
        int age = 25;
        double salary = 75000.50;

        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d years\n", age);
        System.out.printf("Salary: %.2f\n", salary);

        // Combining text + variables using +
        System.out.println("My name is " + name + " and I am " + age + " years old.");

        // Using System.err for error messages
        System.err.println("This is an error message printed in red color!");
    }
}
