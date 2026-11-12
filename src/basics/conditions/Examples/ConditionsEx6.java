package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int number = sc.nextInt();

        if(number % 5== 0){
            System.out.println("This number is divisible by 5");
        }else{
            System.out.println("This number is not divisible by 5");
        }
        sc.close();
    }
}



/*

Ask the user to enter an integer.

Determine whether the number is divisible by 5.

Examples:

25 → Divisible by 5
17 → Not divisible by 5
40 → Divisible by 5
Before you write Java

Don't immediately code.

Think about what we learned:

10 % 3 → 1
10 % 2 → 0

Ask yourself:

What should the remainder be when a number is divisible by 5?

Then write the condition in plain English:

IF __________________________
    Divisible by 5
ELSE
    Not divisible by 5

You figure out the condition yourself.

Then write the complete Java program and test:

25
17
40
0

This is a good test because 0 is also divisible by 5 mathematically.

 */


/*

our important learning from OP-07 isn't the exact code.

Write this in your notebook:

Divisible problem → use % → if remainder is 0, it is divisible.

Examples:

25 % 5 = 0 → divisible
17 % 5 = 2 → not divisible
40 % 5 = 0 → divisible

And importantly:

Don't memorize number % 5 == 0. Understand that % checks the remainder. The number after % changes according to the question.

For example:

divisible by 2 → number % 2 == 0
divisible by 5 → number % 5 == 0
divisible by 10 → number % 10 == 0

 */