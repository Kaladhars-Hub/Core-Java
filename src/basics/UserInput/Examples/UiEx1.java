package basics.UserInput.Examples;

import java.util.Scanner;

public class UiEx1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:\n");
        String name = sc.nextLine();

        System.out.println("Enter your age:\n");
        int age = sc.nextInt();

        System.out.println("Enter your branch: ");
        String branch = sc.next();

        System.out.println("----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);

        sc.close();

    }
}


/*

Create a Java program that asks the user for:

Name
Age
Engineering branch

Then print:

Enter your name:
Rahul

Enter your age:
24

Enter your branch:
EEE

----- Student Details -----
Name: Rahul
Age: 24
Branch: EEE
Requirements

You need to:

Create a Scanner object.
Take all three values from the user.
Store them in variables.
Print those variables.
One important challenge

You need to decide which Scanner method to use for each input.

For example, you have learned methods such as:

next()
nextInt()
nextDouble()

 */