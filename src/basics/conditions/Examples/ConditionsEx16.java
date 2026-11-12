package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the bill amount: ");
        int billAmount = sc.nextInt();

        System.out.println("Are you paying the amount after due date?");
        boolean isduedate = sc.nextBoolean();

        if(billAmount >= 1000 || isduedate){
            System.out.println("₹50 Late Fee Applicable");
        }else{
            System.out.println("No late fees");
        }
        sc.close();
    }
}




/*

## OP-17 — Electricity Bill Late Fee

A person has an electricity bill.

A **late fee of ₹50** should be charged if:

* The bill amount is **₹1,000 or more**
* **OR**
* The payment is made **after the due date**

Otherwise, no late fee is charged.

Your program should ask for:

1. Bill amount
2. Whether payment is after the due date (`true`/`false`)

Then print either:

`₹50 Late Fee Applicable`

or

`No Late Fee`

**Don't write code yet.**

Tell me:

1. What variables and data types?
2. What conditions?
3. Which operator — `&&` or `||` — and why?

 */