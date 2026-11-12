package basics.loopingstatements.Examples;

public class loopsEx9 {

    public static void main(String[] args) {
        for(int i = 1; i <= 28; i = i+3) {
            System.out.println(i);
        }
    }
}

/*

## LOOP-09 — Print Numbers with a Specific Pattern

Print the following numbers:

```text
1
4
7
10
13
16
19
22
25
28
```


Work out the logic:

1. **Starting number?**
2. **Ending number?**
3. **What happens after each repetition?**
4. **How many numbers are printed?**
5. **Which loop would you choose, and why?**

 */


/*

Let's understand exactly how Java runs your LOOP-09, just like we did for LOOP-07.

Your loop is:

```java
for(int i = 1; i <= 28; i = i + 3) {
    System.out.println(i);
}
```

### Step-by-step execution

#### First time

Starting value:

```text
i = 1
```

Check:

```text
Is 1 <= 28? → YES
```

So Java prints:

```text
1
```

Then the update happens:

```text
1 + 3 = 4
```

Now:

```text
i = 4
```

---

#### Second time

Check:

```text
Is 4 <= 28? → YES
```

Print:

```text
4
```

Update:

```text
4 + 3 = 7
```

---

And it keeps going:

```text
i     condition       output       next i
1     1 <= 28 YES       1          4
4     4 <= 28 YES       4          7
7     7 <= 28 YES       7          10
10    10 <= 28 YES     10          13
13    13 <= 28 YES     13          16
16    16 <= 28 YES     16          19
19    19 <= 28 YES     19          22
22    22 <= 28 YES     22          25
25    25 <= 28 YES     25          28
28    28 <= 28 YES     28          31
```

After printing `28`, the update happens:

```text
28 + 3 = 31
```

Now Java checks:

```text
Is 31 <= 28?
```

**NO.**

So the loop stops.

### 🔑 Compare this with LOOP-07

In LOOP-07, you were going **downward**:

```text
30 → 27 → 24 → ... → 3 → 0
```

So you needed to continue while the number was **at or above 3**.

Here you're going **upward**:

```text
1 → 4 → 7 → ... → 28 → 31
```

So you continue while the number is **at or below 28**.

The most important habit is:

> **Don't memorize `<=` for increasing loops and `>=` for decreasing loops.**
>
> Look at the actual starting value, the direction you're moving, and the point where you need to stop.

 */