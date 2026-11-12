package basics.ExceptionHandling;

public class User {

    // throws tells the caller:
    // "This method may throw an exception."
    public static void checkBalance(int balance)
            throws IllegalArgumentException {

        // throw is used to manually throw an exception
        // when our condition is not satisfied.
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        System.out.println("Valid balance: " + balance);
    }

    public static void main(String[] args) {

        try {

            // Calling the method that has 'throws'.
            checkBalance(-50);

        } catch (IllegalArgumentException e) {

            // catch handles the exception thrown by the method.
            System.out.println("Exception handled");

            // Prints detailed information about the exception.
            e.printStackTrace();

        } finally {

            // finally executes after try/catch processing.
            System.out.println("Finally block executed");
        }

        // Code can execute after finally.
        System.out.println("Program continues");
    }
}



/*
 * ============================================================
 * try, catch, finally, throw and throws - COMPLETE FLOW
 * ============================================================
 *
 * When Java reaches:
 *
 * checkBalance(-50);
 *
 * it calls the checkBalance() method.
 *
 * The method is declared as:
 *
 * public static void checkBalance(int balance)
 *         throws IllegalArgumentException
 *
 * 'throws' tells the caller:
 *
 * "This method may throw an IllegalArgumentException."
 *
 * Then Java enters the method:
 *
 * if (balance < 0) {
 *     throw new IllegalArgumentException("Balance cannot be negative");
 * }
 *
 * The value passed to balance is -50.
 *
 * Therefore the condition becomes:
 *
 * -50 < 0
 *
 * This condition is TRUE.
 *
 * So Java executes:
 *
 * throw new IllegalArgumentException("Balance cannot be negative");
 *
 * 'throw' actually throws the exception.
 *
 * The exception then goes back to the place where
 * checkBalance(-50) was called.
 *
 * That call is inside the try block.
 *
 * Therefore the matching catch block handles the exception.
 *
 * After the catch block, the finally block executes.
 *
 * Finally, the program can continue with the code after
 * the try-catch-finally structure.
 */
