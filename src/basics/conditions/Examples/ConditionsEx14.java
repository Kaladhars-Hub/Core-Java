package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int availableBalance = 10000;

        System.out.println("Enter withdrawal amount: ");
        int withdrawlAmount = sc.nextInt();

        if (withdrawlAmount <= availableBalance && withdrawlAmount > 0) {
            System.out.println("Allow the withdrawal");
        }else{
            System.out.println("Withdrawal not allowed");
        }
        sc.close();
    }
}








/*

## 🟦 OP-14 — ATM Withdrawal

Imagine you're withdrawing money from an ATM.

The ATM should allow the withdrawal **only if both** of these are true:

* The withdrawal amount is **less than or equal to the available balance**
* The withdrawal amount is **greater than 0**

Otherwise, print:

`Withdrawal not allowed`

 */