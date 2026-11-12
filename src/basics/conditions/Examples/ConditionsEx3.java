package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int number1 = sc.nextInt();

        System.out.println("Enter a Number:");
        int number2 = sc.nextInt();

        if(number1 > number2) {
            System.out.println("Greater Number is: " + number1);
        } else if (number2 > number1) {
            System.out.println("Greater Number is: " + number2);
        } else
            System.out.println("Both are Equal");

        sc.close();

    }
    }


/*

Find the greater of two numbers.

Example:

Enter first number: 25
Enter second number: 40

Greater number: 40

This will teach you another important skill:

Comparing two variables instead of comparing a variable with a fixed value.

must use scanner for input of two integers.

 */