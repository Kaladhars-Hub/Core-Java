package basics.UserInput.Examples;

import java.util.Scanner;

public class UiEx3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter basic salary:");
        int salary = sc.nextInt();

        System.out.println("Enter HRA:");
        int hra = sc.nextInt();

        System.out.println("Enter travel allowance:");
        int allowance = sc.nextInt();

        System.out.println("----- Salary Details -----");
        System.out.println("Basic Salary: " + salary);
        System.out.println("HRA: " + hra);
        System.out.println("Travel Allowance: " + allowance);
        System.out.println("Gross Salary= " +(salary+hra+allowance));

        sc.close();

    }
}


/*

Imagine a company gives an employee:

Basic salary
HRA
Travel allowance

Ask the user to enter all three amounts.

Then calculate:

Gross Salary = Basic Salary + HRA + Travel Allowance
Example
Enter basic salary:
30000

Enter HRA:
5000

Enter travel allowance:
3000

----- Salary Details -----
Basic Salary: 30000.0
HRA: 5000.0
Travel Allowance: 3000.0
Gross Salary: 38000.0
Requirements

Use:

Scanner
variables
appropriate data types
nextDouble()
arithmetic
System.out.println()

 */