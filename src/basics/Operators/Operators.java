package basics.Operators;

public class Operators {

    public static void main(String[] args) {

        System.out.println("=== 1. Arithmetic Operators (Calculations) ===");
        System.out.println("Addition: " + (2 + 5));
        System.out.println("Subtraction: " + (2 - 5));
        System.out.println("Multiplication: " + (2 * 5));
        System.out.println("Division: " + (2 / 5.0)); // Perfect! Outputs 0.4
        System.out.println("Modulus (Remainder): " + (2 % 5)); // 5 goes into 2 zero times, remainder is 2

        System.out.println("\n=== 2. Relational Operators (Comparisons) ===");
        // These always output a true or false switch
        int myAge = 25;
        int drivingAge = 18;
        System.out.println("Am I eligible to drive? " + (myAge >= drivingAge)); // true
        System.out.println("Is my age exactly 18? " + (myAge == drivingAge)); // false

        System.out.println("\n=== 3. Logical Operators (Gatekeepers) ===");
        // Used to combine multiple checks together
        boolean hasIdCard = true;
        boolean hasTicket = false;
        // Both must be true for the whole thing to be true
        System.out.println("Can I enter the concert? " + (hasIdCard && hasTicket)); // false

        System.out.println("\n=== 4. Assignment Operators (Shifters) ===");
        int currentBalance = 1000;
        currentBalance += 500; // Shorthand for: currentBalance = currentBalance + 500;
        System.out.println("Updated Balance: " + currentBalance); // 1500
    }
}