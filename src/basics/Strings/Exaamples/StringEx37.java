package basics.Strings.Exaamples;

import java.util.Scanner;

public class StringEx37 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your First name: ");
        String firstName = sc.nextLine();

        System.out.println("Enter your Last name: ");
        String lastName = sc.nextLine();

        char ch = firstName.charAt(0);

        System.out.print(lastName + "," + ch);
    }
}

/*
STRING-28 — Take First Letter of First Name and Print with Last Name

Given:
We take input from user for First Name and Last Name.

Example run:
Enter your First name: Steve
Enter your Last name: Jobs

What the program does:
- Asks user for First Name
- Asks user for Last Name
- Takes only the first letter of First Name
- Prints Last Name + comma + first letter of First Name

Final output:
Jobs,S

Step-by-step explanation (simple and clear language):

1. Taking input from user
   Scanner sc = new Scanner(System.in);

   - We need input from user, so we use Scanner.
   - new Scanner(System.in) = we take input from keyboard.
   - This is the standard way to take user input in Java.

2. Asking and storing First Name
   System.out.println("Enter your First name: ");
   String firstName = sc.nextLine();

   - println prints the message on screen.
   - nextLine() reads the entire line typed by user (including spaces).
   - We store the input in variable firstName.

3. Asking and storing Last Name
   System.out.println("Enter your Last name: ");
   String lastName = sc.nextLine();

   - Same as above, but for Last Name.
   - Now we have two strings: firstName and lastName.

4. Getting the first character of First Name
   char ch = firstName.charAt(0);

   - charAt(0) returns the first character of the string.
   - In Java, string indexing starts from 0.
   - Example: "Rahul" → charAt(0) = 'R'
   - Why did we store it in char ch? Because we need to print only one character.

5. Printing the result
   System.out.print(lastName + "," + ch);

   - print() prints everything on the same line.
   - lastName + "," + ch = combines the last name, a comma, and the first letter.
   - Example output: Sharma,R

Why did we use print instead of println?
Because we want everything in one line: Last Name + comma + first letter.

*/