package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Are you accompanied by parent/gaurdian at present?");
        boolean accompaniedByParent = sc.nextBoolean();

        System.out.println("Do you have a valid ticket?");
        boolean hasValidTicket = sc.nextBoolean();

        if((age >= 18 || accompaniedByParent) && hasValidTicket) {
            System.out.println("Entry Allowed");
        }else{
            System.out.println("Entry Not Allowed");
        }
        sc.close();
    }
}


/*

## OP-28 — Concert Entry

A person can enter a concert if:

* They are **18 or older**
* **OR** they are accompanied by a parent/guardian who is present.

However, **everyone must have a valid ticket**.

Print:

`Entry Allowed`

or

`Entry Not Allowed`

**First give me your plain-English logic. Don't write code yet.**

 */