package basics.UserInput.Examples;

import java.util.Scanner;

public class UiEx5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your current salary: ");
        int currentsalary = sc.nextInt();

        int increment = currentsalary*10/100;
        System.out.println("Increment: " + increment);

        int newsalary = currentsalary+increment;
        System.out.println("Newsalary: " + newsalary);

        System.out.println("----- Employee Details -----\n");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CurrentSalary: " + currentsalary);
        System.out.println("Increment: " + increment);
        System.out.println("New Salary: " + newsalary);

        sc.close();
    }
}




/*

Create a program that asks the user for:

Name
Age
Current salary

Then calculate their salary after a 10% increment.

Formula
Increment = Salary × 10 / 100

New Salary = Salary + Increment

For example:

Name: Rahul
Age: 24
Salary: 30000

----- Employee Details -----
Name: Rahul
Age: 24
Current Salary: 30000
Increment: 3000
New Salary: 33000

 */
