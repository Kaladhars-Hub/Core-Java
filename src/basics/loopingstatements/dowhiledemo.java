package basics.loopingstatements;

import java.util.Scanner; // 1. Tells Java we want to use the keyboard scanner tool

public class dowhiledemo {
    public static void main (String[] args) {

        // 2. Create the scanner object and name it 'input'
        Scanner input = new Scanner(System.in);

        // 3. Set up our variables (our storage boxes in memory)
        int correctPin = 1234; // The real password stored in the bank database
        int enteredPin;       // An empty box that will hold whatever the user types

        // 4. Start the DO-WHILE loop
        // "Do the actions inside these curly braces first, ask questions later..."
        do {
            // A. Prompt the user to type something
            System.out.print("Enter your 4-didgit PIN: ");

            // B. Pause the program and wait for the user to type a number and press Enter
            enteredPin = input.nextInt();

            // C. The IF-ELSE Decision Block inside the loop:
            if (enteredPin == correctPin) {
                // '==' means "is exactly equal to".
                // If they typed 1234, say congrats!
                System.out.println("Checking database... Success!");
            } else {
                // If what they typed does NOT equal 1234, give an error message.
                System.out.println("Incorrect PIN. Please try again.");
            }
        } while (enteredPin != correctPin);
        // 5. The Loop Condition Check:
        // '!=' means "is NOT equal to".
        // Translate this line as: "Keep looping back to the top AS LONG AS the entered PIN is wrong."
        // If enteredPin is 1234, then (1234 != 1234) becomes FALSE, and the loop stops!

        // 6. This line only runs AFTER we successfully break out of the loop
        System.out.println("PIN Correct. Access Granted! Welcome to your bank account.");

        // 7. Clean up and close the scanner tool (good practice)
        input.close();

    }
}
