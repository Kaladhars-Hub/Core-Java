package basics.loopingstatements.Examples;

public class loopsEx30 {

    public static void main(String[] args) {

        int count = 0;

        for(int i = 1; i <= 50; i++) {
            if(i % 2 == 0 && i > 20) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}

/*
## 🔁 LOOP-30 — Count Numbers With Two Conditions

Let's move away from **largest/smallest** problems and introduce a different kind of reasoning.

Write a Java program using a **`for` loop** to count how many numbers from **1 to 50** are:

* **Even**
* **AND**
* **Greater than 20**

Expected output:

```text
15
```

The qualifying numbers are:

```text
22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50
```

There are **15**.

### Rules

* Use a `for` loop.
* No arrays.
* No `while` / `do-while`.
* You may use `if`.
* Print only the final count.

### Solution :

```java
if(i % 2 == 0 && i > 20) {
    count = count + 1;
}
```

You correctly combined the two requirements:

* The number must be **even**
* The number must be **greater than 20**
* Only when **both** are true does `count` increase.

The loop checks `1` through `50`, and the qualifying numbers are:

```text
22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50
```

So the output is:

```text
15
```

 */