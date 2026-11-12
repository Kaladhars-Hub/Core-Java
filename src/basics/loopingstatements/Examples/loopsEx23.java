package basics.loopingstatements.Examples;

public class loopsEx23 {

    public static void main(String[] args) {

        int factorial = 1;

        for(int number = 5; number >= 1; number-- ) {
            factorial = factorial * number;
            System.out.println(factorial);
        }
    }
}



/*

### 🔁 LOOP-26 — Factorial of 5

Our goal is:

```text
5 × 4 × 3 × 2 × 1 = 120
```

Think of the `for` loop as the thing that will **visit each number one by one**. Your job is to figure out what numbers it should start with, where it should stop, and how it should move.

### Question 1️⃣ — What is the starting number?

Look at the calculation:

```text
5 × 4 × 3 × 2 × 1
```

The first number that our loop needs to work with is **5**. So before writing any Java code, tell me:

> **What number should our loop start from?**

EXPLANTION:

The question is asking you to **find the factorial of 5**.

### What is factorial?

The factorial of a number `n` means multiplying all positive numbers from `n` down to `1`.

So:

**5! = 5 × 4 × 3 × 2 × 1 = 120**

Now let's understand your Java code:


### Step 1: `int factorial = 1;`

```java
int factorial = 1;

int factorial = 1 is ONLY the initial value.
It does not run again in every iteration,
and it does not reset factorial back to 1.

```


We create a variable called `factorial`.

We start it at **1** because we are going to multiply numbers.

```text
factorial = 1
```

If we started with `0`, everything would become 0:

```text
0 × 5 × 4 × 3 × 2 × 1 = 0
```

So we start with **1**.

---

### Step 2: The `for` loop

```java
for (int number = 5; number >= 1; number--)
```

This has three parts:

**1. `int number = 5`**

Start `number` at 5.

```text
number = 5
```

**2. `number >= 1`**

Continue the loop as long as `number` is greater than or equal to 1.

**3. `number--`**

After each loop, decrease `number` by 1.

So `number` will be:

```text
5 → 4 → 3 → 2 → 1
```

---

### Step 3: Multiplication

Inside the loop:

```java
factorial = factorial * number;
```

This means:

> Take the current value of `factorial`, multiply it by `number`, and store the result back in `factorial`.

Let's see what happens:

| `number` | Calculation | `factorial` |
| -------: | ----------- | ----------: |
|        5 | `1 × 5`     |           5 |
|        4 | `5 × 4`     |          20 |
|        3 | `20 × 3`    |          60 |
|        2 | `60 × 2`    |         120 |
|        1 | `120 × 1`   |         120 |

At the end:

```text
factorial = 120
```

---

### Step 4: Print the answer

```java
System.out.println(factorial);
```

This prints:

```text
120
```

### The whole logic in simple words

Think of the program as doing this:

```text
Start with 1

1 × 5 = 5
5 × 4 = 20
20 × 3 = 60
60 × 2 = 120
120 × 1 = 120

Answer = 120
```

So the program is calculating:

**5! = 5 × 4 × 3 × 2 × 1 = 120**.


 */