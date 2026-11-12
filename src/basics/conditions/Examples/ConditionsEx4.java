package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number1 = sc.nextInt();

        System.out.println("Enter a number:");
        int number2 = sc.nextInt();

        System.out.println("Enter a number:");
        int number3 = sc.nextInt();

        // To find the greatest of 3 numbers,
        // check whether each number is greater than BOTH other numbers.
        //
        // number1 is greatest if:
        // number1 > number2 AND number1 > number3
        //
        // && means BOTH conditions must be true.

        if (number1 > number2 && number1 > number3) {
            System.out.println("Number 1 is Greater: " + number1);

            // If number1 is not greatest, check whether number2
            // is greater than BOTH number1 and number3.
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Number 2 is Greater: " + number2);

            // If neither number1 nor number2 is greatest,
            // number3 is the greatest for cases where the numbers are different.
        } else {
            System.out.println("Greatest is: " + number3);
        }

        sc.close();
    }
}


/*
HOW TO APPROACH "GREATEST OF 3 NUMBERS":

Don't think about Java syntax first.

Ask:
"What must be true for number1 to be greatest?"

number1 > number2
AND
number1 > number3

Therefore:
number1 > number2 && number1 > number3

Do the same for number2.

If neither number1 nor number2 is greatest,
number3 is greatest (when numbers are different).

&& means BOTH conditions must be true.

Your biggest takeaway from OP-05

Don't memorize this:

number1 > number2 && number1 > number3

Memorize the question you should ask yourself:

"If I claim this number is the greatest, what other numbers must it beat?"

For 3 numbers:

number1 → must beat 2 numbers
number2 → must beat 2 numbers
number3 → must beat 2 numbers

That way, when you see a similar problem in an interview, you can build the condition instead of trying to remember it.



*/