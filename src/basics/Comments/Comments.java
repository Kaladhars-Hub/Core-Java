package basics.Comments;

/**
 * 3. DOCUMENTATION COMMENT:
 * This class demonstrates how comments are used in real-world automation scripts.
 */
public class Comments {

    public static void main(String[] args) {

        // 1. SINGLE-LINE COMMENT: This sets up our initial money marker
        int currentCash = 1000;

        /* * 2. MULTI-LINE COMMENT:
         * The code block below is being skipped temporarily because
         * we are testing a new payment feature room instead.
         */
        /*
        currentCash = currentCash + 500;
        System.out.println("Intermediate Cash: " + currentCash);
        */

        System.out.println("Final Balance: " + currentCash); // Prints 1000
    }
}