package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your bill: ");
        int customerBill = sc.nextInt();

        System.out.println("Do you have a loyalty program membership?");
        boolean isLoyaltyMember = sc.nextBoolean();

        if(customerBill >= 1500 && isLoyaltyMember) {
            System.out.println("10% Discount Applicable");
        }else{
            System.out.println("No Discount");
        }
        sc.close();
    }
}


/*

## OP-27 — Grocery Store Discount

A grocery store gives a **10% discount** when:

* The customer's bill is **₹1,500 or more**
* **AND** the customer is a member of the store's loyalty program.

Otherwise, there is no discount.

Print:

`10% Discount Applicable`

or

`No Discount`

 */
