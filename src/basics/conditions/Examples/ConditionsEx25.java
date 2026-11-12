/*
One very important notebook rule

        When you see an English requirement like:

        A OR B, AND C must also be true

        write the structure first:

        (A OR B) AND C

        Then convert it to Java:

        (A || B) && C
*/

package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Do you have a valid ticket?");
        boolean hasValidTicket = sc.nextBoolean();

        if((age >= 60 || age <12) && hasValidTicket) {
            System.out.println("₹100 Discount");
        }else{
            System.out.println("No Discount");
        }
        sc.close();
    }
}




/*

## OP-26 — Train Ticket

A passenger gets a **₹100 discount** on a train ticket if:

* They are **60 years or older**, **OR** they are **under 12 years old**.
* They must also have a **valid ticket**.

Print:

`₹100 Discount`

or

`No Discount`

 */
