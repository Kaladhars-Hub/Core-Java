package basics.conditions;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");

        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Given number is Even");
        } else {
            System.out.println("Given number is Odd");
        }
        sc.close();

    }
}


//Here use scanner class instead of directly passing the variable values and also using only switch condition
//
//1.verify any given number is Even or odd
//
//eg:
//
//input:5
//
//output:given number is odd
//
//input:4
//
//output:given number is even