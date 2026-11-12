package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Are you a student?");
        boolean isStudent = sc.nextBoolean();

        if(age >= 60 || isStudent){
            System.out.println("₹50 Discount Applicable");
        }else{
            System.out.println("No Discount");
        }
        sc.close();
    }
}



/*

## OP-18 — Movie Discount

A cinema offers a **₹50 discount** on a movie ticket when:

* The customer is **60 years old or above**, **or**
* The customer is a **student**

Ask the user for the required information and print:

* `₹50 Discount Applicable`
* or `No Discount`

**Don't write code yet.**

Tell me your logic in plain English first. I won't give you any condition/operator hints.

 */