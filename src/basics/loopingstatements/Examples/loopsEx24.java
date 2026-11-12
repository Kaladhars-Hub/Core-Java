package basics.loopingstatements.Examples;

public class loopsEx24 {

    public static void main(String[] args) {

        int count = 0;

        for(int i = 1; i <= 20; i++) {
            if(i % 2 == 0)
            count = count + 1;
        }
        System.out.println(count);
    }
}


/*

## 🔁LOOPS-24: Count Even numbers from 1 to 20.

Good. Now let's make the next step **conceptually different**, not just change the numbers.

## 🔁 LOOP-29 — Count Even Numbers

Write a Java program using a **`for` loop** to count how many even numbers are present from **1 to 20**.

Expected output:

```text
10
```

Because the even numbers are:

```text
2, 4, 6, 8, 10, 12, 14, 16, 18, 20
```

There are **10** of them.

### Rules

* Use a `for` loop.
* No arrays.
* No `while` / `do-while`.
* You may use `if/else` if you decide it is necessary.
* Don't print each number; print only the final count.


### Correct code

```java
public static void main(String[] args) {

    int count = 0;

    for (int i = 1; i <= 20; i++) {

        if (i % 2 == 0) {
            count = count + 1;
        }
    }

    System.out.println(count);
}
```

### Let's understand it step by step

#### 1. `count = 0`

```java
int count = 0;
```

`count` is answering:

> **How many even numbers have I found so far?**

Before we start checking numbers, we haven't found any.

So:

```text
count = 0
```

---

#### 2. The loop checks every number

```java
for (int i = 1; i <= 20; i++)
```

Here `i` goes:

```text
1
2
3
4
5
...
20
```

We're checking **every number**, because we need to determine which ones are even.

---

#### 3. Check whether `i` is even

```java
if (i % 2 == 0)
```

Remember what you discovered earlier:

> An even number divided by 2 has a remainder of 0.

`%` gives us the **remainder**.

So:

```text
2 % 2 → 0 → even
3 % 2 → 1 → odd
4 % 2 → 0 → even
5 % 2 → 1 → odd
```

Therefore, this condition means:

> **"If the current number is even..."**

---

#### 4. Increase the count only when it's even

```java
count = count + 1;
```

This is inside the `if`, which is very important.

For example:

```text
i = 1 → odd  → don't increase count
i = 2 → even → count becomes 1
i = 3 → odd  → don't increase count
i = 4 → even → count becomes 2
i = 5 → odd  → don't increase count
i = 6 → even → count becomes 3
```

Eventually:

```text
2, 4, 6, 8, 10, 12, 14, 16, 18, 20
```

There are **10** even numbers.

So:

```text
count = 10
```

and finally:

```java
System.out.println(count);
```

prints:

```text
10
```

### ⭐ The key difference from your attempt

You had:

```java
for (...) {
    count = count + 1;
}
```

That says:

> **"Every number I see is something I should count."**

We need:

```java
for (...) {
    if (...) {
        count = count + 1;
    }
}
```

That says:

> **"Check every number, but only count it when it is even."**


 */