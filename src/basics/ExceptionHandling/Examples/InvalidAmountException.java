package basics.ExceptionHandling.Examples;

public class InvalidAmountException extends Exception {

        public InvalidAmountException(String message) {
            super(message);
        }
}


/*
 * CUSTOM / USER-DEFINED EXCEPTION
 * --------------------------------
 *
 * What is a Custom Exception?
 *
 * Java already provides many built-in exceptions such as:
 * - ArithmeticException
 * - IOException
 * - IllegalArgumentException
 *
 * But applications can have their own business-specific problems.
 *
 * Examples:
 * - InvalidAmountException
 * - InsufficientBalanceException
 * - InvalidAgeException
 *
 * Java does not automatically provide exceptions for every
 * business rule, so we can create our own exception class.
 *
 *
 * HOW TO CREATE A CUSTOM EXCEPTION:
 *
 * 1. Create a class with a meaningful exception name.
 *
 * 2. Extend Exception:
 *
 *        extends Exception
 *
 *    Since we are extending Exception here,
 *    InvalidAmountException is a CHECKED exception.
 *
 *    This means Java requires us to either:
 *    - handle it using try-catch
 *                OR
 *    - declare it using throws
 *
 * 3. Create a constructor that receives an exception message.
 *
 * 4. Pass that message to the parent Exception class using:
 *
 *        super(message);
 *
 *    This allows the exception message to later be accessed
 *    using methods such as:
 *
 *        e.getMessage();
 *
 *
 * IMPORTANT:
 *
 * Creating this class does NOT automatically throw an exception.
 *
 * To actually raise the exception somewhere in our program,
 * we would use:
 *
 *        throw new InvalidAmountException("Amount cannot be negative");
 *
 *
 * Remember:
 *
 * throws → declares that a method may throw an exception
 *
 * throw  → actually raises an exception
 *
 *
 * CHECKED vs UNCHECKED CUSTOM EXCEPTION:
 *
 * extends Exception
 *      → checked custom exception
 *
 * extends RuntimeException
 *      → unchecked custom exception
 *
 * For now, knowing this difference is enough.
 */


//public class InvalidAmountException extends Exception {

    /*
     * Constructor of our custom exception.
     *
     * 'message' receives the reason for the exception.
     *
     * Example:
     *
     * "Amount cannot be negative"
     */
    //public InvalidAmountException(String message) {

        /*
         * super(message) calls the constructor of
         * the parent Exception class.
         *
         * It passes our custom error message to Exception
         * so Java can store it as the exception's message.
         *
         * Later we can retrieve it using:
         *
         * e.getMessage()

       // super(message);
    }
}
/*

        ### Quick revision

```text
Business-specific problem
        ↓
Create our own exception class
        ↓
                extends Exception
        ↓
Checked custom exception
        ↓
Constructor receives message
        ↓
                super(message)
        ↓
        throw new InvalidAmountException(...)
        ↓
Exception is actually raised.

 */