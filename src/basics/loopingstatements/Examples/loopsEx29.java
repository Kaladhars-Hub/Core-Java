package basics.loopingstatements.Examples;

public class loopsEx29 {

    public static void main(String[] args) {

        int largest = 0;

        for(int i = 1; i <= 25; i++) {
            if(i % 2 == 0 && i > largest) {
                largest = i;
            }
        }
        System.out.println(largest);
    }
}


/*

## 🔁 LOOP-29 — Find the Largest **Even** Number

This time, we're combining two ideas you've already learned:

* **Checking whether a number meets a condition**
* **Keeping track of the largest value found so far**

Write a Java program using a **`for` loop** to find the **largest even number from 1 to 25**.

Expected output:

```text
24
```

### Rules

* Use a `for` loop.
* No arrays.
* No `while` / `do-while`.
* You may use `if`.
* Print only the largest even number.

Absolutely. This is a good one to record because it combines **checking a condition** with **tracking the largest value**.


# 🔁 LOOP-29 — Find the Largest Even Number

 ## Problem

 Write a Java program using a `for` loop to find the **largest even number from 1 to 25**.

 Expected output:

```
24
```

 The even numbers in the range are:

```
2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24
```

 The largest one is:

```
24
```

---

 ## 🧠 How to Approach the Problem

 This problem combines two ideas:

 1. **Check whether a number is even.**
2. **Keep track of the largest number found so far.**

 We need to check every number from `1` to `25`.

 For each number, we ask two questions:

```
Is the number even?
        AND
Is it larger than the current largest?
```

 Only when **both** answers are yes do we update `largest`.

---

 ## 1\. Create the `largest` Variable

 We need a variable to remember the largest even number found so far.

```
int largest = 0;
```

 Why `0`?

 Because we are looking for even numbers greater than `0`, and `0` gives us a starting value that allows the first even number, `2`, to become the largest.

 Initially:

```
largest = 0
```

---

 ## 2\. Loop Through Every Number

 We need to examine every number from `1` through `25`.

```
for (int i = 1; i <= 25; i++) {
```

 The loop does this:

```
1 → 2 → 3 → 4 → 5 → ... → 25
```

 We use `i++` because we want to check **every number**, including both even and odd numbers.

---

 ## 3\. Check Whether the Number Is Even

 We can use the remainder operator `%`.

 A number is even if dividing it by `2` leaves a remainder of `0`.

```
i % 2 == 0
```

 For example:

```
2 % 2 = 0  → even
4 % 2 = 0  → even
6 % 2 = 0  → even
```

 But:

```
3 % 2 = 1  → odd
5 % 2 = 1  → odd
7 % 2 = 1  → odd
```

 Therefore:

```
i % 2 == 0
```

 means:

 > "Is `i` an even number?"

---

 ## 4\. Check Whether `i` Is Larger

 Being even isn't enough.

 For example, when we reach `4`, it is even, but if:

```
largest = 6
```

 then `4` should not replace `6`.

 So we also check:

```
i > largest
```

 This means:

 > "Is the current number larger than the largest number I've found so far?"

---

 ## 5\. Combine Both Conditions

 We need **both conditions** to be true:

```
i % 2 == 0 && i > largest
```

 The `&&` operator means **AND**.

 So this:

```
if (i % 2 == 0 && i > largest)
```

 means:

 > If `i` is even **AND** `i` is greater than `largest`, update `largest`.

 Then:

```
largest = i;
```

---

 # 🔄 How the Program Runs

 Let's follow the important values.

 Initially:

```
largest = 0
```

 ### `i = 1`

```
1 % 2 = 1
```

 `1` is odd.

 So nothing happens.

```
largest = 0
```

---

 ### `i = 2`

```
2 % 2 = 0
```

 `2` is even.

 Now check:

```
2 > 0 → true
```

 Both conditions are true.

 So:

```
largest = 2
```

---

 ### `i = 3`

 `3` is odd.

```
3 % 2 = 1
```

 So we ignore it.

```
largest = 2
```

---

 ### `i = 4`

 `4` is even:

```
4 % 2 = 0
```

 And:

```
4 > 2 → true
```

 Therefore:

```
largest = 4
```

---

 The same process continues:

```
i = 6  → even → 6 > 4  → largest = 6
i = 8  → even → 8 > 6  → largest = 8
i = 10 → even → 10 > 8 → largest = 10
...
i = 22 → even → 22 > 20 → largest = 22
i = 24 → even → 24 > 22 → largest = 24
```

 Then:

```
i = 25
```

 `25` is odd, so it does not affect `largest`.

 The loop ends.

 Final value:

```
largest = 24
```

 Then:

```
System.out.println(largest);
```

 prints:

```
24
```

---

 # 📋 Iteration Summary

 | `i` | Even? | `i > largest`? | Action | `largest` |
| --- | --- | --- | --- | --- |
| 1 | ❌ | — | Nothing | 0 |
| 2 | ✅ | ✅ | `largest = 2` | 2 |
| 3 | ❌ | — | Nothing | 2 |
| 4 | ✅ | ✅ | `largest = 4` | 4 |
| 5 | ❌ | — | Nothing | 4 |
| 6 | ✅ | ✅ | `largest = 6` | 6 |
| ... | ... | ... | ... | ... |
| 20 | ✅ | ✅ | `largest = 20` | 20 |
| 21 | ❌ | — | Nothing | 20 |
| 22 | ✅ | ✅ | `largest = 22` | 22 |
| 23 | ❌ | — | Nothing | 22 |
| 24 | ✅ | ✅ | `largest = 24` | 24 |
| 25 | ❌ | — | Nothing | 24 |

```

 Output:

```
24
```

---

 # ⭐ Key Concept

 This problem teaches an important programming pattern:

```
START with a value
        ↓
LOOP through the numbers
        ↓
CHECK whether the current number qualifies
        ↓
CHECK whether it is better than the current answer
        ↓
UPDATE the answer
        ↓
REPEAT
```

 For this problem:

```
        i
        ↓
Is i even?
        ↓
      YES
        ↓
Is i > largest?
        ↓
      YES
        ↓
largest = i
```

 The important part is that **odd numbers do nothing**.

 For example, when `i = 23`:

```
23 % 2 == 0
```

 is false, so `largest` remains unchanged.

 When `i = 24`:

```
24 % 2 == 0  → true
24 > 22     → true
```

 Therefore:

```
largest = 24
```

 ## 🧠 General Pattern to Remember

 When a problem asks:

 > **Find the largest number that satisfies a condition**

 think:

```
int largest = startingValue;

for (...) {
    if (condition && i > largest) {
        largest = i;
    }
}
```

 Here:

```
condition → i is even
comparison → i is greater than largest
```

 So:

```
if (i % 2 == 0 && i > largest)
```

 This is the main new idea from LOOP-29: **filter first, then compare.**
 */
