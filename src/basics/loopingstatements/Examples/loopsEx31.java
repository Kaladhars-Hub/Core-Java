package basics.loopingstatements.Examples;

public class loopsEx31 {

    public static void main(String[] args) {

        int reversed = 0;

        for(int number = 1234; number > 0; number = number / 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println(reversed);
    }
}

/*
## 🔁 LOOP-31 — Reverse the Digits of a Number

For example, if the input is:

```text
1234
```

the expected output should be:

```text
4321
```

### Explanation:

Absolutely. Let's make this **very simple, like explaining it to a child**, and then go through **every single line**.

 The four things we need to do again and again are:

 > **Get last digit → Remove last digit → Put digit into reversed number → Repeat**

 For `1234`, we want:

 `4 → 3 → 2 → 1`

 which gives `4321`.

 ## Simple Java program

 Since you said **no `Scanner`**, we'll directly use `1234`.

```
public class Main {
    public static void main(String[] args) {

        int reversed = 0;

        for (int number = 1234; number > 0; number = number / 10) {

            int digit = number % 10;

            reversed = reversed * 10 + digit;
        }

        System.out.println(reversed);
    }
}
```

 The output is:

```
4321
```

 Now let's understand **every line**.

---

 ## 1\. Creating the class

```
public class Main {
```

 This creates a class called `Main`.

 Think of a class like a **box** where we put our program.

---

 ## 2\. Starting the main method

```
public static void main(String[] args) {
```

 This is where Java starts running our program.

 For now, you can think:

 > "Java, start running my instructions from here."

---

 ## 3\. Create a place to store the answer

```
int reversed = 0;
```

 We need somewhere to build our reversed number.

 At the beginning, we have nothing.

 So:

```
reversed = 0
```

 Eventually it will become:

```
4
43
432
4321
```

---

 # 4\. The `for` loop

 Here is the most important line:

```
for (int number = 1234; number > 0; number = number / 10) {
```

 A `for` loop has three parts:

```
for (initialization; condition; update)
```

 Our loop is:

```
for (int number = 1234; number > 0; number = number / 10)
```

 Let's break it apart.

 ### Part 1: Initialization

```
int number = 1234;
```

 This is where we start.

 So our number is:

```
1234
```

 Notice that the initialization is **inside the `for` loop**, as you requested.

---

 ### Part 2: Condition

```
number > 0
```

 This asks:

 > "Do we still have digits left?"

 If `number` is greater than `0`, we continue.

 For example:

```
1234 > 0 → yes
123  > 0 → yes
12   > 0 → yes
1    > 0 → yes
0    > 0 → no
```

 So the loop automatically stops when there are no digits left.

 That's how we know **how many times to repeat**.

 We don't need to say:

```
repeat 4 times
```

 Instead, we say:

 > Keep going while the number is greater than 0.

---

 ### Part 3: Update

```
number = number / 10
```

 This removes the last digit.

 For example:

```
1234 / 10 = 123
123  / 10 = 12
12   / 10 = 1
1    / 10 = 0
```

 Because `number` is an `int`, Java throws away the decimal part.

 So:

```
1234 / 10 = 123
```

 not `123.4`.

 This is exactly what we want.

 We are removing one digit at a time.

---

 # 5\. Get the last digit

 Inside the loop we have:

```
int digit = number % 10;
```

 The `%` symbol means **remainder**.

 Let's look at:

```
1234 % 10
```

 When we divide `1234` by `10`:

```
1234 ÷ 10 = 123 remainder 4
```

 So:

```
1234 % 10
```

 gives:

```
4
```

 Therefore:

```
int digit = number % 10;
```

 means:

 > "Take the last digit of `number` and put it into `digit`."

---

 # 6\. Build the reversed number

 Now we have:

```
reversed = reversed * 10 + digit;
```

 This is the part that builds our answer.

 Let's go slowly.

 ### First loop

 Our number is:

```
1234
```

 Get the last digit:

```
1234 % 10 = 4
```

 So:

```
digit = 4
```

 Our reversed number is currently:

```
reversed = 0
```

 Now:

```
reversed = reversed * 10 + digit;
```

 becomes:

```
reversed = 0 * 10 + 4
```

 which gives:

```
reversed = 4
```

 So we've collected our first digit:

```
4
```

---

 # 7\. Second loop

 The update happens:

```
number = number / 10;
```

 So:

```
1234 / 10 = 123
```

 Now:

```
number = 123
```

 Get the last digit:

```
123 % 10 = 3
```

 So:

```
digit = 3
```

 Our reversed number is currently:

```
4
```

 We need to turn it into:

```
43
```

 That's why we do:

```
4 * 10 + 3
```

 which gives:

```
43
```

 So:

```
reversed = reversed * 10 + digit;
```

 does this:

```
4 * 10 + 3 = 43
```

---

 # 8\. Third loop

 Now:

```
number = 123
```

 Remove the last digit:

```
123 / 10 = 12
```

 Get the last digit:

```
12 % 10 = 2
```

 So:

```
digit = 2
```

 Current reversed number:

```
43
```

 Build the new result:

```
43 * 10 + 2
```

 which gives:

```
432
```

---

 # 9\. Fourth loop

 Now:

```
number = 12
```

 Remove the last digit:

```
12 / 10 = 1
```

 Get the last digit:

```
1 % 10 = 1
```

 So:

```
digit = 1
```

 Current reversed:

```
432
```

 Build the new result:

```
432 * 10 + 1
```

 which gives:

```
4321
```

---

 # 10\. The loop stops

 Now the update happens again:

```
1 / 10 = 0
```

 So:

```
number = 0
```

 The condition checks:

```
number > 0
```

 which means:

```
0 > 0
```

 That's **false**.

 Therefore, the loop stops.

---

 # 11\. Print the answer

 Finally:

```
System.out.println(reversed);
```

 At this point:

```
reversed = 4321
```

 So Java prints:

```
4321
```

---

 ## Let's see the whole process

 You can imagine the computer doing this:

 | `number` | `number % 10` → `digit` | `reversed` |
| --- | --- | --- |
| 1234 | 4 | 4 |
| 123 | 3 | 43 |
| 12 | 2 | 432 |
| 1 | 1 | 4321 |
| 0 | stop | 4321 |

 So remember these **three important ideas**:

```
int digit = number % 10;
```

 **Gets the last digit.**

```
number = number / 10;
```

 **Removes the last digit.**

```
reversed = reversed * 10 + digit;
```

 **Adds that digit to the reversed number.**

 And the `for` loop:

```
for (int number = 1234; number > 0; number = number / 10)
```

 means:

 > **Start at 1234 → keep going while there are digits → remove one digit each time.**

 ### The complete code again

```
public class Main {
    public static void main(String[] args) {

        int reversed = 0;

        for (int number = 1234; number > 0; number = number / 10) {

            int digit = number % 10;

            reversed = reversed * 10 + digit;
        }

        System.out.println(reversed);
    }
}
```

 The most important thing to understand is:

 **`% 10` takes the last digit, while `/ 10` removes the last digit.**

> Get last digit → remove last digit → add digit to reversed result → repeat.
 */
