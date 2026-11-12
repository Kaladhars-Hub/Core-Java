package basics.conditions;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int secondNumber = sc.nextInt();

        System.out.println("Enter the target operation (+, -, *, /): ");
        char operation = sc.next().charAt(0);

        switch (operation) {

            case '+':
                System.out.println("Result is " + (firstNumber + secondNumber));
                break;

            case '-':
                System.out.println("Result is " + (firstNumber - secondNumber));
                break;

            case '*':
                System.out.println("Result is " + (firstNumber * secondNumber));
                break;

            case '/':
                System.out.println("Result is " + (firstNumber / secondNumber));
                break;

            default:
                System.out.println("Invalid operation");

        }

        sc.close();
    }
}
