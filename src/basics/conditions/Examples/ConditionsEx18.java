package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many group of people are you?");
        int numberOfPeople = sc.nextInt();

        System.out.println("Do we a have table available?");
        boolean isAvailable = sc.nextBoolean();

        if(numberOfPeople <= 4 && isAvailable) {
            System.out.println("Table Booking Confirmed");
        }else{
            System.out.println("Table Booking Not Available");
        }
        sc.close();
    }
}


/*

## OP-19 — Restaurant Table Booking

A restaurant allows a customer to book a table if:

* The customer has **4 or fewer people** in their group
* **AND**
* The restaurant has a table available

Ask the user for the required information.

Print:

`Table Booking Confirmed`

or

`Table Booking Not Available`

 */