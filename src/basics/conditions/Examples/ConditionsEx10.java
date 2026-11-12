package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int number = sc.nextInt();

        if(number >= 10 && number <= 50) {
            System.out.println("Number is in the range");
        }else{
            System.out.println("Number is outside the range");
        }
        sc.close();
    }
}


/*

## 🟦 OP-11 — Number in a Range

This one will strengthen your understanding of **multiple conditions with `&&`**.

### Problem

Write a Java program that takes a number as input and checks whether the number is **between 10 and 50**.

* If the number is between **10 and 50**, print:
  `Number is in the range`
* Otherwise, print:
  `Number is outside the range`


### For a number to be between 10 and 50, what **two things** must be true at the same time?

The important thing is: don't memorize one formula for &&. && simply means:

Condition 1 must be true AND Condition 2 must be true.

The actual conditions depend on the problem.

For this problem

"Number is between 10 and 50" means two things must be true:

The number must be 10 or greater
The number must be 50 or less

📝 Put this in your notebook

&& does NOT have one fixed pattern.
It means both conditions must be true.
First understand what the question requires, then create each condition.

For range problems:

Between 10 and 50
→ >= 10 AND <= 50

 */