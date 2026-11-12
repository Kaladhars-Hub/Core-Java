package basics.loopingstatements.Examples;

public class loopsEx35 {

    public static void main(String[] args) {

        int count = 0;

        for(int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}


/*

### LOOP-35 — Count numbers that are divisible by **both 3 and 5**

Find how many numbers from **1 to 100** are divisible by **both 3 and 5**.

Expected output:

```text
6
```

Because the matching numbers are:

`15, 30, 45, 60, 75, 90`

This is useful because you're now combining **a loop, a counter, and multiple conditions**.

Before writing code, explain your logic in plain English:

1. What should the counter start at?
2. What range should the loop go through?
3. What must be true for the counter to increase?

Explanation:

You’re **very close**. There are actually **two mistakes** in your code.

 ### 1. Your counter should start at `0`

 You wrote:

```
int count = 1;
```

 But before checking any numbers, you have found **zero matching numbers**.

 So:

```
int count = 0;
```

 Then every time you find a number divisible by both 3 and 5, increase it by 1.

---

 ### 2\. You have an accidental `;` after the `if`

 This is the **main problem**:

```
if(i % 3 == 0 && i % 5 == 0);
```

 That `;` means:

 > "The `if` statement is finished. Do nothing."

 So Java then executes this line **every single time**:

```
count = count + 1;
```

 That's why your counter increases for **all 100 numbers**, instead of only `15, 30, 45, 60, 75, 90`.

 Remove the semicolon:

```
if(i % 3 == 0 && i % 5 == 0)
```

 ### Your corrected code

```
public class loopsEx35 {

    public static void main(String[] args) {

        int count = 0;

        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                count = count + 1;
            }
        }

        System.out.println(count);
    }
}
```

 Output:

```
6
```

 ### Think about the logic like this

 1. **Counter starts at 0** because we haven't found anything yet.
2. **Loop from 1 to 100** because that's the range we're checking.
3. For every `i`, ask:
   - Is `i` divisible by 3?
   - **AND** is `i` divisible by 5?
4. Only when **both are true**, increase `count`.

 For example, when `i = 15`:

```
15 % 3 == 0 → true
15 % 5 == 0 → true

true && true → true
```

 So:

```
count = count + 1;
```

 But when `i = 12`:

```
12 % 3 == 0 → true
12 % 5 == 0 → false

true && false → false
```

 So the counter doesn't change.

 **The big lesson here:** whenever you write an `if`, be careful about accidentally putting `;` immediately after the condition. That turns the `if` into an empty statement.

 */