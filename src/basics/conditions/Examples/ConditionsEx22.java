package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your income: ");
        int income = sc.nextInt();

        System.out.println("Are you working for atleast 2 years?");
        boolean isWorkingFor2yrs = sc.nextBoolean();

        System.out.println("Do you have a good credit score?");
        boolean hasGoodScore = sc.nextBoolean();

        if(income >= 30000 && isWorkingFor2yrs && hasGoodScore) {
            System.out.println("Loan Application Eligible");
        }else{
            System.out.println("Loan Application Not Eligible");
        }
        sc.close();
    }
}





/*

## OP-23 — Bank Loan Eligibility

A bank allows a customer to apply for a loan if:

* Their monthly income is **₹30,000 or more**
* **AND** they have been working for **at least 2 years**
* **AND** they have a good credit score

Print:

`Loan Application Eligible`

or

`Loan Application Not Eligible`

Your turn.

**First give me the plain-English logic. Then write the code. No condition/operator hints from me.**

 */