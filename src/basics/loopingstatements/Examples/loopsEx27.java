package basics.loopingstatements.Examples;

public class loopsEx27 {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i <= 50; i = i+1) {
            if(i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}


/*

## 🔁 LOOP-32 — Sum of Multiples

Now we're going to combine **selection + accumulation**.

Write a Java program using a **`for` loop** to find the **sum of all numbers from 1 to 50 that are divisible by 5**.

Expected output:

```text
275
```

Because:

```text
5 + 10 + 15 + 20 + 25 + 30 + 35 + 40 + 45 + 50 = 275
```

### Rules

* Use a `for` loop.
* No arrays.
* No `while` / `do-while`.
* You may use `if`.
* Print only the final sum.

 */
