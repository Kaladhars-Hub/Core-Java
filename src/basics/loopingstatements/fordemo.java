package basics.loopingstatements;

import java.util.Scanner; // Step 1: Import the scanner tool

public class fordemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Step 2: Create our keyboard scanner

        System.out.println("--- Welcome to the Train Booking System ---");
        System.out.println("We will now book 3 tickets for your group.");

        // Step 3: The FOR Loop.
        // It starts at passenger 1, checks if passenger is <= 3, and adds 1 after each lap.
        for (int i = 1; i <= 3; i++) {

            System.out.println("--- Processing Ticket #" + i + " ---");
            System.out.print("Enter passenger's age: ");

            // Step 4: Program pauses here waiting for the user to type the age
            int age = input.nextInt();

            // Step 5: The IF-ELSE block to decide the price category
            if (age < 12) {
                System.out.println("Result: Child Ticket (50% Discount Applied!)\n");
            } else {
                System.out.println("Result: Adult Ticket (Full Price)\n");
            }
        } // The loop ends here and jumps back to the top if 'i' is still 3 or less.

        // Step 6: Outside the loop. This runs only after all 3 tickets are processed.
        System.out.println("All 3 tickets booked successfully! Have a safe journey.");

        input.close(); //Close the scanner
    }
}
