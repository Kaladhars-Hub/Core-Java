package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if(number == 6 || number ==7) {
            System.out.println("Weekend");
        }else{
            System.out.println("Weekday");
        }
        sc.close();
    }
}



/*

## 🟦 OP-12 — Weekend Check

This time we're introducing **`||` (OR)**.

### Problem

Write a Java program that takes a **day number** as input:

```text
1 → Monday
2 → Tuesday
3 → Wednesday
4 → Thursday
5 → Friday
6 → Saturday
7 → Sunday
```

Your program should print:

* `Weekend` if the day number is **6 or 7**
* `Weekday` for all other valid days

### You're very close, but there's **one important correction** in your condition.
/*
 * OR (||) OPERATION:
 *
 * || means "OR".
 * It is used when there are multiple possible conditions,
 * and at least ONE condition must be true.
 *
 * How to approach:
 * 1. First understand the requirement in plain English.
 * 2. Identify the possible conditions.
 * 3. Ask: "Can either condition be true?"
 * 4. If YES, use ||.
 *
 * Example:
 * Weekend = day 6 OR day 7
 *
 * day == 6 || day == 7
 *
 * If day = 6:
 * day == 6 -> TRUE
 * day == 7 -> FALSE
 * One condition is TRUE -> Weekend
 *
 * If day = 7:
 * day == 6 -> FALSE
 * day == 7 -> TRUE
 * One condition is TRUE -> Weekend
 *
 * If day = 5:
 * day == 6 -> FALSE
 * day == 7 -> FALSE
 * Both are FALSE -> Weekday
 *
 * IMPORTANT:
 * || does NOT mean there are two conditions.
 * It means at least ONE of the conditions must be true.
 *
 * Difference:
 * && -> BOTH conditions must be true
 * || -> AT LEAST ONE condition must be true
 *
 * OP-12:
 * Valid day numbers are 1 to 7.
 * 1-5 -> Weekday
 * 6-7 -> Weekend
 *
 * Since only 6 OR 7 should produce Weekend:
 *
 * day == 6 || day == 7
 *
 * We are not handling numbers outside 1-7 in this exercise
 * because the question only defines 1-7 as valid day numbers.

 */


/*

⭐ The most important line to remember

Don't memorize:

"|| means use ==."

Instead remember:

|| = At least ONE condition must be true.

Then build the individual conditions from the question.

For example:

Weekend → 6 OR 7

becomes:

day == 6 || day == 7

Whereas:

Number must be between 10 AND 50

becomes:

number >= 10 && number <= 50

The question determines the conditions.
&& or || only tells Java how those conditions are connected.

 */