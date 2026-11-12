package basics.conditions;

import java.util.Scanner;

public class ConditionsEx15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your recharge amount: ");
        int rechargeAmount = sc.nextInt();

        System.out.println("Are you using a 5g plan?");
        boolean is5gplan = sc.nextBoolean();

        if(rechargeAmount >= 299 && is5gplan){
            System.out.println("₹100 Cashback Eligible");
        }else{
            System.out.println("No Cashback");
        }
        sc.close();
    }
 }


 /*

 🟡 OP-16 — Mobile Recharge Offer

A mobile company gives a **₹100 cashback** if:

* The recharge amount is **₹299 or more**
* **AND** the customer is using the company’s **5G plan**

Otherwise, there is no cashback.

Write a Java program that:

1. Takes the recharge amount from the user.
2. Takes whether the customer has a 5G plan (`true`/`false`).
3. Prints:

   * `₹100 Cashback Eligible`
   * or `No Cashback`

### Before writing code, answer these 3 things:

**1. What variables do you need?**
Think about their data types too.

**2. What conditions must be true for cashback?**

**3. Do you need `&&` or `||`? Why?**

  */