package basics.conditions;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");

        int number = sc.nextInt();

        switch (number % 2) {

            case 0:
                System.out.println("Given number is even");
                break;

            case 1:
                System.out.println("Given number is odd");
                break;

        }
        sc.close();
    }
}
