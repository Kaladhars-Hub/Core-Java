/*
the next time you see a question like:

"Check whether a number is divisible by both X and Y"

I want you to independently arrive at:

number % X == 0 && number % Y == 0

without me giving you the condition.
 */

package basics.conditions;

import java.util.Scanner;

public class ConditionsEx7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int number = sc.nextInt();

        if(number % 3 == 0 && number % 5 == 0) {
            System.out.println("The number is divisible by both 3 and 5");
        }else{
            System.out.println("\"The number is not divisible by both 3 and 5");
        }
        sc.close();
    }
}



/*

Ask the user for a number.

Print:

Divisible by both 3 and 5

if the number is divisible by both.

Otherwise:

Not divisible by both 3 and 5
Examples
15 → Divisible by both 3 and 5
30 → Divisible by both 3 and 5
12 → Not divisible by both 3 and 5
25 → Not divisible by both 3 and 5

Before coding, think carefully.

You already know:

Divisible by 3 → remainder ?
Divisible by 5 → remainder ?

But this time both conditions must be true.

You learned the operator for AND.

So first write this in plain English:

IF number is divisible by 3 ______ number is divisible by 5
    → Divisible by both
ELSE
    → Not divisible by both

    combining % + == + &&
 */