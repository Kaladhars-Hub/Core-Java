package basics.loopingstatements.Examples;

public class loopsEx20 {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 0; i <= 10; i = i+2) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}




/*

### 🔁 LOOP-22 — Sum of Even Numbers

Write a Java program using a **`for` loop**.

The program should calculate the sum of all **even numbers from 1 to 10**.

Expected result:

```text
30
```

Because:

```text
2 + 4 + 6 + 8 + 10 = 30
```

**Rules:**

* Use a `for` loop.
* No arrays.
* No `while` loop.
* No `do-while`.

 */


/*

Yes. **Your code is correct. ✅**

```java
int sum = 0;
```

Good — you started the total at `0`.

```java
for(int i = 0; i <= 10; i = i + 2)
```

This is also good. You're starting at `0` and increasing by `2`, so the loop visits:

```text
0 → 2 → 4 → 6 → 8 → 10
```

Then:

```java
sum = sum + i;
```

adds each number to the running total.

So:

```text
0 + 0  = 0
0 + 2  = 2
2 + 4  = 6
6 + 6  = 12
12 + 8 = 20
20 + 10 = 30
```

And:

```java
System.out.println(sum);
```

prints:

```text
30
```

### One small observation

The question said **even numbers from 1 to 10**, so starting at `0` technically includes `0`. But because adding `0` changes nothing, your final answer is still correct.

For this problem, **I would accept your solution as correct.** 👍

You also did something important here: **you figured out the loop step yourself (`i = i + 2`) instead of me giving it to you.**


 */