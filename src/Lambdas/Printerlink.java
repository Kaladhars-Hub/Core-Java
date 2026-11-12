package Lambdas;

public class Printerlink {

/*

    public static void main(String[] args) {

        Printer p = new Printer() {
            @Override
            public void print(String msg, int times) {
                for(int i = 0; i < times; i++) {
                    System.out.println(msg);
                }
            }
        };
        p.print("Hello", 3);
    }
*/

//Lambda Expression:

    public static void main(String[] args) {

        Printer p = (msg, times) -> {
            for (int i = 0; i < times; i++) {
                System.out.println(msg);
            }
        };
        p.print("Hello", 3);
    }
}




/*
 ============================================================
 TOPIC: PRINTER INTERFACE - ANONYMOUS CLASS AND LAMBDA
 ============================================================

 GOAL:
 Print a message a given number of times.

 Example:
 "Hello" printed 3 times means Hello appears 3 times.
*/


// STEP 1: CREATE THE INTERFACE

/*
 An interface is like a contract.
 It tells us which method must be implemented.

 void          -> the method does not return a value.
 String msg    -> the message we want to print.
 int times     -> how many times to print the message.

 The interface tells us WHAT the method should do,
 but the implementation tells us HOW to do it.
*/

        // ====================================================
        // STEP 2: ANONYMOUS CLASS
        // ====================================================

        /*
         We implement the Printer interface using an anonymous
         class, without creating a separate named class.

         new Printer() creates an implementation of Printer.

         @Override means we are implementing the print()
         method declared in the interface.

         Inside the method:
         1. Receive the message and repetition count.
         2. Use a for loop to repeat the action.
         3. Print the message during each repetition.


        Printer p1 = new Printer() {

            @Override
            public void print(String msg, int times) {

                // Start at 0 and repeat while i is less than times.
                for (int i = 0; i < times; i++) {

                    // Print the message on each repetition.
                    System.out.println(msg);
                }
            }
        };

        // Call the method: print Hello 3 times.
        System.out.println("Anonymous Class Output:");
        p1.print("Hello", 3);


        // ====================================================
        // STEP 3: LAMBDA EXPRESSION
        // ====================================================

        /*
         A lambda is a shorter way to implement an interface
         that has exactly one abstract method.

         Printer has one abstract method: print().

         (msg, times) -> separates the input parameters
         from the code that should execute.

         Java infers the parameter types from the interface,
         so we don't need to write String and int here.

         We use curly braces because the lambda contains
         multiple statements: a for loop and a print statement.

         This is called a BLOCK LAMBDA.


        Printer p2 = (msg, times) -> {

            // Repeat the loop according to the value of times.
            for (int i = 0; i < times; i++) {

                // Print the message during each repetition.
                System.out.println(msg);
            }
        };

        // Call the lambda: print Java 2 times.
        System.out.println("Lambda Output:");
        p2.print("Java", 2);


        // ====================================================
        // STEP 4: UNDERSTAND THE DIFFERENCE
        // ====================================================

        /*
         Anonymous Class:
         new Printer() { ... }

         Lambda Expression:
         (msg, times) -> { ... }

         Both implementations do the same job.
         The difference is how we write the implementation.

         IMPORTANT:
         - void means no value is returned.
         - We don't wrap p2.print() in println().
         - The print() method already displays the message.
         - The loop repeats according to the value of times.
        */
