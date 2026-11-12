package basics.loopingstatements.Examples;

public class loopsEx7 {

    public static void main(String[] args) {
        for(int i = 30; i >= 3; i = i-3) {
            System.out.println(i);
        }
    }
}


/*

## LOOP-07 — Print Numbers in Reverse

Print:

```text
30
27
24
21
18
15
12
9
6
3
```

 */


/*

Your final code is correct:

```java
for(int i = 30; i >= 3; i = i - 3) {
    System.out.println(i);
}
```

### Let's focus only on the mistake

You initially wrote:

```java
i <= 3
```

But your starting value is:

```text
i = 30
```

Before Java even enters the loop body, it asks:

> **Is 30 less than or equal to 3?**

No.

So Java says:

> "The condition is false right from the beginning. I won't execute the loop even once."

That's why you got **no output**.

---

### Now look at the correct condition

```java
i >= 3
```

Java starts with:

```text
i = 30
```

It asks:

> Is 30 greater than or equal to 3?

**Yes → print 30**

Then:

```text
30 - 3 = 27
```

Java asks:

> Is 27 greater than or equal to 3?

**Yes → print 27**

Then:

```text
27 - 3 = 24
```

And it continues:

```text
30 → 27 → 24 → 21 → 18 → 15 → 12 → 9 → 6 → 3
```

After printing 3:

```text
3 - 3 = 0
```

Java checks:

> Is 0 greater than or equal to 3?

**No → stop.**

---

### 🔑 This is what I want you to start doing

Don't just look at:

```text
i >= 3
```

and try to memorize that it's the "reverse loop condition."

Instead, **put the current value into the condition mentally.**

For example:

```text
Starting i = 30

Is 30 >= 3? YES → run
Is 27 >= 3? YES → run
Is 24 >= 3? YES → run
...
Is 3 >= 3? YES → run
Is 0 >= 3? NO → stop
```

That is **how the loop runs**.

And notice something important: **your original plain-English reasoning was already correct.** You said:

> "starting number is 30 and ending is 3 and after each repetition the numbers will minus by 3"

 */