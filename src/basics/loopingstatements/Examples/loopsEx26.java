package basics.loopingstatements.Examples;

public class loopsEx26 {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 50; i = i + 1) {
            if (i % 5 == 0) {
                count = count + 1;
            }
        }
        System.out.println(count);
        }
    }


/*

## 🔁 LOOP-31 — Count Multiples

Let's increase the difficulty a little.

Write a Java program using a **`for` loop** to count how many numbers from **1 to 50** are divisible by **5**.

Expected output:

```text
10
```

Because the numbers are:

```text
5, 10, 15, 20, 25, 30, 35, 40, 45, 50
```

There are **10 numbers**.

### Rules

* Use a `for` loop.
* No arrays.
* No `while` / `do-while`.
* You **may use `if`**.
* Print only the final count.

### 🧠 Think before coding

This one introduces a **new idea**: instead of making the loop visit only the required numbers, you can visit **all numbers from 1 to 50** and determine which ones meet the requirement.

Absolutely — here is a clean **GitHub-ready note** you can save alongside your LOOP-31 solution.

 LOOP-31 — Count Multiples

# 🔁 LOOP-31 — Count Multiples

 ## Problem

 Write a Java program using a `for` loop to count how many numbers from **1 to 50** are divisible by **5**.

 Expected output:

```
10
```

 The numbers divisible by 5 are:

```
5, 10, 15, 20, 25, 30, 35, 40, 45, 50
```

 There are **10 numbers**.

---

 ## 🧠 How to Approach the Problem

 The important idea in this problem is:

 > **Check every number from 1 to 50 and count the numbers that satisfy the condition.**

 Unlike the previous problem, we don't make the loop jump directly from one multiple of 5 to the next.

 Instead, we visit **every number**:

```
1 → 2 → 3 → 4 → 5 → 6 → ... → 50
```

 Then we check each number to see whether it is divisible by 5.

---

 ## 1\. Create the Counter

 We need a variable to keep track of how many divisible numbers we have found.

 Before checking any numbers, we haven't found any.

 Therefore:

```
int count = 0;
```

 Think of `count` as a box that keeps track of our answer.

 Every time we find a number divisible by 5, we add `1` to `count`.

---

 ## 2\. Create the `for` Loop

 We need to check **every number from 1 to 50**.

 Therefore:

```
for (int i = 1; i <= 50; i = i + 1)
```

 The three parts mean:

```
int i = 1       → Start at 1

i <= 50         → Continue while i is 50 or less

i = i + 1       → Move to the next number
```

 So `i` will become:

```
1 → 2 → 3 → 4 → 5 → 6 → ... → 50
```

 ### Why don't we use `i = i + 5`?

 Because we want to **check every number**.

 If we used:

```
i = i + 5
```

 the numbers would be:

```
1 → 6 → 11 → 16 → 21 → ...
```

 We would skip numbers.

 The purpose of this problem is to visit every number and then decide whether it should be counted.

---

 ## 3\. How Do We Know If a Number Is Divisible by 5?

 We use the **remainder operator `%`**.

 The `%` operator gives us the remainder after division.

 For example:

```
10 % 5 = 0
```

 because 10 divides evenly by 5.

 But:

```
11 % 5 = 1
```

 because 11 divided by 5 leaves a remainder of 1.

 Therefore:

 > If a number is divisible by 5, its remainder after dividing by 5 will be `0`.

 So our condition is:

```
if (i % 5 == 0)
```

 This means:

 > "If the remainder when `i` is divided by 5 is zero..."

---

 ## 4\. Increase the Counter

 If the condition is true, we found a number divisible by 5.

 So increase the counter:

```
count = count + 1;
```

 For example:

```
i = 5

5 % 5 = 0

Therefore:
count = count + 1
```

 The same thing happens for:

```
10
15
20
25
30
35
40
45
50
```

---

 ## 5\. Complete Code

```
public class loopsEx26 {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 50; i = i + 1) {

            if (i % 5 == 0) {
                count = count + 1;
            }

        }

        System.out.println(count);
    }
}
```

 Output:

```
10
```

---

 # 🔄 How the Program Runs

 Let's follow the important iterations.

 ### When `i = 1`

```
1 % 5 = 1
```

 Not divisible by 5.

```
count = 0
```

---

 ### When `i = 5`

```
5 % 5 = 0
```

 Divisible by 5.

 So:

```
count = 0 + 1
count = 1
```

---

 ### When `i = 10`

```
10 % 5 = 0
```

 Divisible by 5.

 So:

```
count = 1 + 1
count = 2
```

---

 ### When `i = 15`

```
15 % 5 = 0
```

 So:

```
count = 2 + 1
count = 3
```

 This continues until `i = 50`.

 At `50`:

```
50 % 5 = 0

count = 9 + 1

count = 10
```

 Then `i` becomes `51`.

 The condition:

```
51 <= 50
```

 is false, so the loop stops.

 Finally:

```
System.out.println(count);
```

 prints:

```
10
```

---

 # ⚠️ Common Mistake

 Be careful with the semicolon after `if`.

 ❌ Wrong:

```
if (i % 5 == 0);
{
    count = count + 1;
}
```

 The semicolon ends the `if` statement.

 That means the counter can increase even when the number is **not** divisible by 5.

 ✅ Correct:

```
if (i % 5 == 0) {
    count = count + 1;
}
```

---

 # 🧠 Mental Model

 When solving **counting problems**, think:

```
1. Create a counter → count = 0

2. Loop through the required range

3. Check each number

4. If it matches the condition
       ↓
   increase the counter

5. Print the counter after the loop
```

 For this problem:

```
        i = 1
          ↓
     Check every number
          ↓
    Is i divisible by 5?
       ↙          ↘
     YES           NO
      ↓             ↓
 count + 1        Do nothing
      ↓             ↓
      └──────→ next number
```

 ## ⭐ Key Lesson

 There are two different approaches you should recognize:

 ### Approach 1 — Jump between required numbers

 If you already know exactly which numbers you need:

```
1 → 3 → 5 → 7 → 9
```

 you can increase by `2`.

 ### Approach 2 — Check every number

 If the problem asks you to **count numbers that satisfy a condition**, visit every number:

```
1 → 2 → 3 → 4 → 5 → ... → 50
```

 and use an `if` statement to decide whether to count it.

 For LOOP-31, **Approach 2 is the important new concept.**
 */