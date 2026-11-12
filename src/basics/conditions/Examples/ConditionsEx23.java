package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Do you have a valid ticket?");
        boolean hasValidTicket = sc.nextBoolean();

        if((age >= 60 || age < 12) && hasValidTicket) {
            System.out.println("₹100 Discount Applicable");
        }else{
            System.out.println("No Discount");
        }
        sc.close();
    }
}



/*

## OP-24 — Travel Ticket Discount

A bus company offers a **₹100 discount** if:

* The passenger is **60 years or older**
* **OR** the passenger is **under 12 years old**

However, the passenger must also have a **valid ticket**.

If eligible, print:

`₹100 Discount Applicable`



> At least one of the two age conditions must be true, **and** having a valid ticket is mandatory.

However, your **Java condition has a logic problem**, so **OP-23 is 🟡 Assisted** for now.

You wrote:

```java
if(age >= 60 || age < 12 && hasValidTicket)
```

The problem is that `hasValidTicket` is only being required for the **under-12** case. Someone aged 65 with `hasValidTicket = false` would still get the discount.

You need to group the two age possibilities together so that the valid-ticket requirement applies to **both**.

> **(one of the age conditions) AND (valid ticket)**


 */