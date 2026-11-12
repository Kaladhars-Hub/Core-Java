package basics.loopingstatements.Examples;

public class loopsEx25 {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i <= 20; i = i+2) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}


/*

## 🔁 LOOP-25 — Sum of Odd Numbers

Write a Java program using a **`for` loop** to calculate the sum of all **odd numbers from 1 to 20**.

Expected output:

```text
100
```

Because:

```text
1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17 + 19 = 100
```

### Rules

* Use a `for` loop.
* No arrays.
* No `while` / `do-while`.
* No need for `if/else`.
* Print only the final sum.

Absolutely. Here's a **GitHub-friendly explanation** you can keep as notes. The goal is to understand the _thinking process_, not just memorize the code.

 ## LOOP-30 — Sum of Odd Numbers

 ### Problem

 Calculate the sum of all odd numbers from `1` to `20` using a `for` loop.

 Expected output:

```
100
```

 The odd numbers are:

```
1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17 + 19 = 100
```

---

 ## 1\. How should I approach the problem?

 Before writing the `for` loop, identify these four things:

```
1. Where do I start?
2. Where do I stop?
3. How do I move to the next required number?
4. What am I doing with each number?
```

 For this problem:

 ### Starting number

 The first odd number is `1`.

```
int i = 1;
```

 ### Ending condition

 We want numbers up to `20`.

```
i <= 20
```

 ### How do we get only odd numbers?

 Odd numbers increase by `2`:

```
1 → 3 → 5 → 7 → 9 → ...
```

 So:

```
i = i + 2
```

 ### Where does the sum start?

 Before adding anything, the total should be `0`.

```
int sum = 0;
```

 ### What happens each time?

 We take the current `i` and add it to `sum`.

```
sum = sum + i;
```

---

 ## 2\. Complete program

```
int sum = 0;

for (int i = 1; i <= 20; i = i + 2) {
    sum = sum + i;
}

System.out.println(sum);
```

---

 # 3\. How does the `for` loop run?

 This is the most important part to understand.

 The loop is:

```
for (int i = 1; i <= 20; i = i + 2)
```

 It has three important sections:

```
for ( starting ; condition ; update )
```

 So:

```
for (int i = 1; i <= 20; i = i + 2)
     ↑             ↑              ↑
   start         condition       update
```

---

 # 4\. What happens at every iteration?

 Let's trace it.

 Initially:

```
sum = 0
i = 1
```

 ### Iteration 1

 Check:

```
i <= 20
1 <= 20 → true
```

 So enter the loop.

```
sum = sum + i;
```

 Becomes:

```
sum = 0 + 1
sum = 1
```

 Then the update happens:

```
i = i + 2
```

 So:

```
i = 1 + 2
i = 3
```

---

 ### Iteration 2

 Check:

```
3 <= 20 → true
```

 Add:

```
sum = 1 + 3
sum = 4
```

 Update:

```
i = 3 + 2
i = 5
```

---

 ### Iteration 3

```
5 <= 20 → true
```

 Add:

```
sum = 4 + 5
sum = 9
```

 Update:

```
i = 5 + 2
i = 7
```

---

 ### Iteration 4

```
7 <= 20 → true
```

```
sum = 9 + 7
sum = 16
```

 Then:

```
i = 7 + 2
i = 9
```

---

 We can put the whole process into a table:

 | Iteration | `i` | `sum` before | Operation | `sum` after |
| --- | --- | --- | --- | --- |
| 1 | 1 | 0 | `0 + 1` | 1 |
| 2 | 3 | 1 | `1 + 3` | 4 |
| 3 | 5 | 4 | `4 + 5` | 9 |
| 4 | 7 | 9 | `9 + 7` | 16 |
| 5 | 9 | 16 | `16 + 9` | 25 |
| 6 | 11 | 25 | `25 + 11` | 36 |
| 7 | 13 | 36 | `36 + 13` | 49 |
| 8 | 15 | 49 | `49 + 15` | 64 |
| 9 | 17 | 64 | `64 + 17` | 81 |
| 10 | 19 | 81 | `81 + 19` | 100 |

 After `i = 19`, the update happens:

```
i = 19 + 2
i = 21
```

 Now the condition is checked:

```
21 <= 20 → false
```

 Therefore, the loop stops.

 Finally:

```
System.out.println(sum);
```

 prints:

```
100
```

---

 # 5\. The mental model to remember

 Whenever you see a loop problem like this, think:

```
START
  ↓
What number do I begin with?
  ↓
CONDITION
  ↓
Should I continue?
  ↓
WORK
  ↓
What do I do with the current number?
  ↓
UPDATE
  ↓
How do I get to the next number?
  ↓
Repeat
```

 For this problem:

```
Start → 1
   ↓
Check → i <= 20
   ↓
Add → sum = sum + i
   ↓
Jump → i = i + 2
   ↓
Repeat
```

 ### ⭐ Most important lesson

 Don't start by trying to remember the code.

 Start by asking:

 > **What numbers do I need, and how can my loop move from one required number to the next?**

 Here, the answer is:

```
1 → 3 → 5 → 7 → ... → 19
```

 That's why the loop uses:

```
int i = 1;
i <= 20;
i = i + 2;
```

 And because we're building a running total:

```
int sum = 0;
sum = sum + i;
```

 That reasoning will help you solve many of the next `for`-loop problems too.

 */