package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int number = sc.nextInt();

        int remainder = number%2;
        System.out.println("Remainder: " + remainder);

        if(remainder == 0) {
            System.out.println("Even");

        } else {
                System.out.println("odd");
        }
            sc.close();
        }
    }



/*

Create a program that asks the user to enter an integer.

Then determine whether the number is even or odd.

Examples
Enter a number:
24

Output:
24 is even

and:

Enter a number:
17

Output:
17 is odd
Your job

You already know:

Scanner
int
%
System.out.println()

But there's one thing we haven't practiced properly yet:

if/else.

You've already watched P19, so now we're going to use it.

Think before coding

Ask yourself:

What happens when an even number is divided by 2?

What will its remainder be?

And what happens with an odd number?

 */