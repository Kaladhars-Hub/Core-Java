package Lambdas;

public class Booleanlink {

/*
 //Anonymous Class:

    public static void main(String[] args) {

        Checker c = new Checker() {
            @Override
            public boolean isAdult(int age) {

                if(age >= 18)
                    return true;
                else
                return false;
            }
        };
        System.out.println(c.isAdult(20));
       System.out.println(c.isAdult(15));
    }

 */
    //Lambda Expression:

    public static void main(String[] args) {

        // Create a Checker implementation using a lambda expression.
        Checker c = (age) ->   age >= 18;

        // Test with age 20: should print true.
        System.out.println(c.isAdult(20));

        // Test with age 15: should print false.
        System.out.println(c.isAdult(15));
    }
}


/*
 * TOPIC: Lambda Expression in Java
 *
 * GOAL:
 * Create a Checker that checks whether a person is an adult.
 * A person is considered an adult if their age is 18 or above.
 *
 * STEP 1: Understand the interface
 *
 * The Checker interface contains a method:
 * boolean isAdult(int age);
 *
 * This means:
 * - isAdult is the method name.
 * - int age means the method receives an integer age.
 * - boolean means the method must give back either true or false.
 *
 * STEP 2: Create the implementation using a lambda
 *
 * Checker c = (age) -> age >= 18;
 *
 * - Checker is the interface type.
 * - c is the variable that will hold our implementation.
 * - (age) represents the input received by the method.
 * - -> separates the input from the logic to execute.
 * - age >= 18 checks whether the age is at least 18.
 *
 * STEP 3: Understand the shortcut
 *
 * Normally, we might write an if-else statement:
 *
 * if (age >= 18)
 *     return true;
 * else
 *     return false;
 *
 * But age >= 18 already gives us true or false.
 * Therefore, we can write just age >= 18.
 *
 * Since this is a single expression, Java automatically
 * returns its result. We don't need return or curly braces.
 *
 * STEP 4: Test the implementation
 *
 * c.isAdult(20)
 * - Java passes 20 as the age.
 * - Java checks whether 20 >= 18.
 * - The result is true.
 *
 * c.isAdult(15)
 * - Java passes 15 as the age.
 * - Java checks whether 15 >= 18.
 * - The result is false.
 *
 * STEP 5: Display the results
 *
 * System.out.println() displays the returned value on screen.
 *
 * Expected output:
 * true
 * false
 */

