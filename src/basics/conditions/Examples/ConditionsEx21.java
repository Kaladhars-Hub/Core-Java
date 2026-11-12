package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        int orderAmount = sc.nextInt();

        System.out.println("Do you stay within 5km radius?");
        boolean isWithin5KmRadius = sc.nextBoolean();

        System.out.println("Is the restaurant currently accepting orders?");
        boolean isAcceptingOrders = sc.nextBoolean();

        if(orderAmount >= 500 || (isWithin5KmRadius && isAcceptingOrders)) {
            System.out.println("Free Delivery");
        }else{
            System.out.println("Delivery Charges Apply");
        }
        sc.close();
    }
}



/*

## OP-22 — Food Delivery

A food delivery app gives **free delivery** when:

* The order amount is **₹500 or more**
* **OR** the customer lives **within 5 km**
* **AND** the restaurant is currently accepting orders

Otherwise, delivery charges apply.

Print:

* `Free Delivery`
* `Delivery Charges Apply`

### Your task

1. What information do you need from the user?
2. What data type will each piece of information use?
3. Explain exactly **when** the customer gets free delivery.


And this one is important because you correctly handled the mixed && and || requirement that caused the mistake in OP-20.

Your condition:

if(orderAmount >= 500 || (isWithin5KmRadius && isAcceptingOrders))

is correct for the requirement.

You understood that:

₹500+ by itself qualifies for free delivery.
Otherwise, being within 5 km isn't enough — the restaurant must also be accepting orders.
Therefore, those two conditions belong together with parentheses.

 */