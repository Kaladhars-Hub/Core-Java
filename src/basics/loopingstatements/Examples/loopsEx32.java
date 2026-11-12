package basics.loopingstatements.Examples;

public class loopsEx32 {

    public static void main(String[] args) {

        int count = 0;

        for(int number = 12345; number > 0; number = number / 10) {
            count = count + 1;
        }
        System.out.println(count);
    }
}

/*

Let's continue, but I don't want to give you another digit-reversal problem immediately since LOOP-31 was difficult enough.

## 🔁 LOOP-32 — Count the Digits

Write a Java program using a **`for` loop** to count how many digits are present in the number:

```text
12345
```

Expected output:

```text
5
```

### Rules

* Use a `for` loop.
* No arrays.
* No `while` / `do-while`.
* No need for `if/else`.
* Print only the number of digits.

### 🧠 Think before coding

This is related to the idea you just saw in LOOP-31, but the goal is simpler: **we don't need to reverse or rebuild the number**. We only need to keep track of how many times we can remove a digit.

Think about these questions:

1. **What should the number start as?**
   We are given `12345`. What value should you initially store?

2. **What happens when you divide an integer by 10?**
   You just saw that dividing `1234` by 10 gives `123`. What happens to `123` when you do it again?

3. **When should the loop stop?**
   Keep thinking about repeatedly removing the last digit. What value tells you that there are no digits left?

4. **What variable should count the digits?**
   Before processing anything, how many digits have we counted?

5. **When should that counter increase?**
   Each time you successfully remove one digit, what should happen to the count?

Yes. **Your reasoning and code are correct.**

You correctly understood the key idea from LOOP-31 and used only the part needed for this problem.

Your code:

```java
int count = 0;

for(int number = 12345; number > 0; number = number / 10) {
    count = count + 1;
}
System.out.println(count);
```

### Let's trace it

The `number` changes like this:

```text
12345 → 1234 → 123 → 12 → 1 → 0
```

Every time one digit is removed, you do:

```text
count = count + 1
```

So:

```text
count = 0
12345 → count = 1
1234  → count = 2
123   → count = 3
12    → count = 4
1     → count = 5
0     → stop
```

Final output:

```text
5
```

 */