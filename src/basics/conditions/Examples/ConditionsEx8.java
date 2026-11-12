package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not Eligible to vote");
        }
        sc.close();
    }
}


/*

Write a Java program that:

Takes a person's age as input.
If the age is 18 or above, print:
Eligible to vote
Otherwise, print:
Not eligible to vote

Now convert that into Java yourself.

Your task

Write the complete Java program in IntelliJ, including:

Scanner
age input
if-else
output
sc.close()

 */
