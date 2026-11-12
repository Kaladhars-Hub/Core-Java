package basics.conditions;

import java.util.Scanner;

public class ConditionsEx12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        int amount = sc.nextInt();

        System.out.println("Do you have a membership? (true/false): ");
        boolean membership = sc.nextBoolean();

        if(amount >= 500 || membership) {
            System.out.println("Free delivery");
        }else{
            System.out.println("Delivery charge applies");
        }
        sc.close();
    }
}


/*

### 🟦 An online shop has this rule:

> A customer gets **free delivery** if:
>
> * their order total is **₹500 or more**, **OR**
> * they have **premium membership**.

Otherwise, they have to pay the delivery charge.

Your program should take:

1. Order amount
2. Whether they have premium membership (`true` / `false`)

Then print:

```text
Free delivery
```

or

```text
Delivery charge applies
```


**What are the two conditions that make someone eligible for free delivery?**


 */