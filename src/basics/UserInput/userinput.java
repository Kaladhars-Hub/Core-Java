package basics.UserInput;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {

        //Create our single scanner object connected to the keyboard
        Scanner sc = new Scanner(System.in);

        // --- QUESTION 1 ---
        System.out.println("What is your name?");
        // .nextLine() reads a complete line of text (String)
        String name = sc.nextLine();

        // --- QUESTION 2 ---
        // \n moves the cursor to a new line. %s acts as a placeholder for our text variable 'name'
        System.out.printf("Hey %s , how are you? \n", name);
        String status = sc.nextLine();

        // --- QUESTION 3 ---
        System.out.println("What is your age?");
        // .nextInt() reads a whole number (Integer) instead of text
        int age = sc.nextInt();

        // --- CLOSING OUT ---
        System.out.print("Thank you for the information.");

        // Step 3: Close the scanner to fix the memory leak warning
        sc.close();

    }
}
