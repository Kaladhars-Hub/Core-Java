package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if(number >= 35) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        sc.close();
    }
}


/*

Ask the user to enter their marks.

Assume:

0–100 marks

Your program should print:

Marks >= 40 → Pass
Marks < 40  → Fail

For example:

Enter marks:
75

Result: Pass

and:

Enter marks:
25

Result: Fail

 */