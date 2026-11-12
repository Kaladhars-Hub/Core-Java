package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int number = sc.nextInt();

        if(number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }

        }
    }

/*

Create a program that asks the user to enter an integer.

Your program must print:

10 → Positive
-5 → Negative
0 → Zero
Important

This time, there are three possibilities, not two.

You need to figure out:

IF ?
    Positive

ELSE IF ?
    Negative

ELSE
    Zero

You have already learned the if, else if, else structure in P19.

Don't ask me for the conditions.

Think about the mathematical meaning:

When is a number positive?

When is a number negative?

What is left after those two possibilities?

You can look at your physical notes for the syntax of else if.

But you need to figure out the conditions yourself.

Try it without looking at your previous ConditionsEx1 first.

Then run it with three test values:

25
-10
0

 */





// STEP 1: First understand the problem in plain English.
// Don't start writing Java immediately.

// STEP 2: Identify all possible outcomes.
// Example: Positive, Negative, Zero → 3 outcomes.

// STEP 3: Convert each outcome into a mathematical condition.
// Positive → number is greater than 0
// Negative → number is less than 0
// Zero → neither positive nor negative

// STEP 4: Choose the correct comparison operator.
// >  means greater than
// <  means less than
// == means equal to
// >= means greater than OR equal to
// <= means less than OR equal to

// IMPORTANT:
// >= 0 includes ZERO.
// <= 0 includes ZERO.
// If zero needs to be a separate case, use > 0 and < 0.

// STEP 5: Remember how if-else works.
// Java checks from TOP to BOTTOM.
// Once one condition is TRUE, Java executes that block
// and skips the remaining else-if / else blocks.

// STEP 6: Use ELSE for the remaining possibility
// when the previous conditions have already ruled out other cases.