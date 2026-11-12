package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how much data you have used?");
        int mobileData = sc.nextInt();

        System.out.println("Do you have an active monthly plan?");
        boolean hasActivePlan = sc.nextBoolean();

        System.out.println("Are you a premium customer?");
        boolean isPremiumCustomer = sc.nextBoolean();

        if((mobileData <2 && hasActivePlan) || isPremiumCustomer) {
            System.out.println("10 GB Free Data Add-on");
        }else{
            System.out.println("No Free Data Add-on");
        }
        sc.close();
    }
}


/*

## OP-25 — Mobile Data Plan

A mobile provider gives a customer a **free 10 GB data add-on** when:

* The customer has used **less than 2 GB** of data
* **AND** the customer has an active monthly plan
* **OR** the customer is a premium customer

Otherwise:

`No Free Data Add-on`

Print either:

`10 GB Free Data Add-on`

or

`No Free Data Add-on`


Your condition:

if((mobileData < 2 && hasActivePlan) || isPremiumCustomer)

is correct. ✅

You correctly understood:

Less than 2 GB AND active plan must both be true for the first route.
OR being a premium customer is enough by itself.
The parentheses correctly group the first two requirements.

 */
