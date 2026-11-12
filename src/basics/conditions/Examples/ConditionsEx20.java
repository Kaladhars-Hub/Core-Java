package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        int amount = sc.nextInt();

        System.out.println("Do you have a premium membership?");
        boolean hasPremiumMembership = sc.nextBoolean();

        System.out.println("Do you have a coupon?");
        boolean hasCoupon = sc.nextBoolean();

        if(amount >= 2000 && (hasPremiumMembership || hasCoupon)) {
            System.out.println("₹200 discount");
        }else{
            System.out.println("No Discount");
        }
        sc.close();
    }
}


/*

## OP-21 — Online Shopping Offer

A shopping website gives a **₹200 discount** when:

* The customer's order amount is **₹2,000 or more**
* **AND** the customer has **either** a premium membership **or** a coupon.

Otherwise:

`No Discount`

Your program should ask for the required information and print the appropriate result.

The requirement was:

> Amount must be ₹2,000 or more **AND** the customer must have **either** premium membership **OR** a coupon.

So the condition should be:

```java
if (amount >= 2000 && (hasPremiumMembership || hasCoupon)) {
    System.out.println("₹200 discount");
} else {
    System.out.println("No Discount");
}
```

### How to read it

First, Java evaluates:

```java
(hasPremiumMembership || hasCoupon)
```

Meaning **at least one** of these must be `true`.

Then:

```java
amount >= 2000
```

must also be `true.

So the complete requirement is:

```text
Amount >= 2000
        AND
(Premium membership OR Coupon)
```

The **parentheses are important** because they tell Java that the membership/coupon part belongs together.


 */