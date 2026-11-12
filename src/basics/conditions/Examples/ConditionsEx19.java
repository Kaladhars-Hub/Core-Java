package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the weight of the bag?");
        int bagWeight = sc.nextInt();

        System.out.println("Do you have a membership?");
        boolean hasMembership = sc.nextBoolean();

        if(bagWeight <= 20 || hasMembership) {
            System.out.println("No Extra Baggage Charge");
        }else{
            System.out.println("Extra Baggage Charge Applicable");
        }
        sc.close();
    }
}



/*

## OP-20 — Airport Baggage

An airline allows a passenger to check in their baggage **without an extra charge** when:

* The baggage weighs **20 kg or less**
* **OR**
* The passenger has **premium membership**

Otherwise, the passenger has to pay an extra baggage charge.

Print either:

`No Extra Baggage Charge`

or

`Extra Baggage Charge Applicable`


First tell me:

1. What information does the program need?
2. What data type will you use for each?

 */
