package basics.loopingstatements.Examples;

public class loopsEx33 {

    public static void main(String[] args) {

        int smallest = 5;

        for(int i = 5; i <= 20; i++) {

            if(i < smallest) {
                smallest = i;
            }
        }
        System.out.println(smallest);
    }
}


/*

Find the smallest number from 5 to 20.

Expected output:

5
```

### Step-by-step execution

#### Step 1 — Initial value

```java
int smallest = 5;
```

We assume **5 is the smallest number initially**.

So:

```text
smallest = 5
```

---

#### Step 2 — Loop starts

```java
for(int i = 5; i <= 20; i++)
```

The loop starts with:

```text
i = 5
```

Now the condition is checked:

```text
5 <= 20 → true
```

So the loop enters the `if`.

---

#### Step 3 — First comparison

```java
if(i < smallest)
```

Current values:

```text
i = 5
smallest = 5
```

Comparison:

```text
5 < 5 → false
```

So `smallest` is **not changed**.

```text
smallest = 5
```

Then `i` increases to 6.

---

#### Step 4 — Second comparison

```text
i = 6
smallest = 5
```

Check:

```text
6 < 5 → false
```

So:

```text
smallest = 5
```

Then `i` becomes 7.

---

#### Step 5 — The loop continues

The same process happens:

| `i` | `smallest` | `i < smallest` | Result  |
| --: | ---------: | :------------: | ------- |
|   5 |          5 |      false     | stays 5 |
|   6 |          5 |      false     | stays 5 |
|   7 |          5 |      false     | stays 5 |
|   8 |          5 |      false     | stays 5 |
|   9 |          5 |      false     | stays 5 |
|  10 |          5 |      false     | stays 5 |
| ... |          5 |      false     | stays 5 |
|  20 |          5 |      false     | stays 5 |

Every number from **6 to 20 is greater than 5**, so none of them can become the new smallest number.

---

#### Step 6 — Loop finishes

After `i = 20`, `i++` makes:

```text
i = 21
```

Now:

```text
21 <= 20 → false
```

The loop stops.

---

#### Step 7 — Print the answer

```java
System.out.println(smallest);
```

The value is still:

```text
smallest = 5
```

Therefore the output is:

```text
5
```

### Main idea to remember

> `smallest` stores the smallest value found so far.
> Each loop iteration compares the current `i` with `smallest`.
> If `i` is smaller, `smallest` is replaced.
> If it isn't smaller, `smallest` remains unchanged.

**Tracker:** 🟡 LOOP-33 — Find Smallest Number — **Assisted** (because you received meaningful guidance while building the logic).

 */