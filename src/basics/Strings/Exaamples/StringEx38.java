package basics.Strings.Exaamples;

import java.util.Scanner;

public class StringEx38 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the fileName");
        String fileName = sc.nextLine();

        int dotIndex = fileName.lastIndexOf('.');
       System.out.print(fileName.substring(dotIndex +1));
    }
}


/*
STRING-29 — Extract File Extension from File Name

Given:
String fileName = "report.pdf";

What the program does:
- Takes the file name as input from user.
- Finds the last dot (.) in the file name.
- Prints only the part after the dot (the file extension).

The final output will be:
pdf

Step-by-step explanation (simple and clear language):

1. Taking input from user
   Scanner sc = new Scanner(System.in);

   - We need input from user, so we use Scanner.
   - new Scanner(System.in) = we take input from keyboard.
   - This is the standard way to take user input in Java.

2. Asking and storing the file name
   System.out.println("Enter the fileName");
   String fileName = sc.nextLine();

   - println prints the message on screen.
   - nextLine() reads the entire line typed by user (including spaces).
   - We store the input in variable fileName.

3. Finding the last dot (.) in the file name
   int dotIndex = fileName.lastIndexOf('.');

   - lastIndexOf('.') is a built-in method of String.
   - It searches the string from the **end** and returns the position of the **last** dot.
   - Example:
     fileName = "report.pdf" → lastIndexOf('.') = 6
     fileName = "important.docx" → lastIndexOf('.') = 8
   - Why did we use lastIndexOf instead of indexOf?
     Because a file name can have multiple dots (like "data.report.v1.pdf").
     We want the **extension** which is always the part after the **last** dot.

4. Printing the file extension
   System.out.print(fileName.substring(dotIndex +1));

   - substring(dotIndex +1) is a built-in method of String.
   - It returns the part of the string **starting from position dotIndex + 1** to the end.
   - Example:
     fileName = "report.pdf"
     dotIndex = 6
     fileName.substring(7) = "pdf"

   - We used print() instead of println() because we want the output on the same line as the message (or just the extension alone).

Why did we use lastIndexOf('.') and substring(dotIndex +1)?
- lastIndexOf('.') finds the correct position of the last dot.
- substring(dotIndex +1) safely takes only the part after that dot.
- This is the standard and correct way to extract file extension in Java.

*/