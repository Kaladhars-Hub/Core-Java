package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Are you a Student?");
        boolean isStudent = sc.nextBoolean();

        System.out.println("Do you have any advanced ticket booking?");
        boolean hasAdvancedBookingTicket = sc.nextBoolean();

        if((age >= 60 || isStudent) && hasAdvancedBookingTicket) {
            System.out.println("Travel Discount Applicable");
        }else{
            System.out.println("No Travel Discount");
        }
        sc.close();
    }
}




/*

## OP-29 — Travel Discount

A person gets a **travel discount** if:

* They are **60 or older**
* **OR** they are a **student**
* **AND** they have booked a ticket **at least 7 days in advance**

Print:

`Travel Discount Applicable`

or

`No Travel Discount`

 */
