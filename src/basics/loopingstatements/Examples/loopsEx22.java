package basics.loopingstatements.Examples;

public class loopsEx22 {

    public static void main(String[] args) {

        int count = 0;

        for(int i = 1; i <= 20; i++) {
            count = count+1;
        }
        System.out.println(count);
    }
}



/*

### 🔁 LOOP-24 — Count the Numbers

Write a Java program using a `for` loop that counts **how many numbers are between 1 and 20**.

Expected output:

```text
20
```

Don't simply print `20`.

Your program should actually **count the numbers using a variable and the loop**.

 */

/*

The question is:

> How many numbers are there from 1 to 20?

We don't care about the actual values being added.

We just want to say:

```text
I found number 1 → count = 1
I found number 2 → count = 2
I found number 3 → count = 3
...
I found number 20 → count = 20
```

So we need a variable called `count`.

```java
int count = 0;
```

Then every time the loop runs, we increase `count` by **1**.

### Now look at what happens

First:

```java
int count = 0;
```

We haven't counted anything yet.

Then the loop starts:

```text
i = 1
count = 0 + 1
count = 1
```

Next:

```text
i = 2
count = 1 + 1
count = 2
```

Next:

```text
i = 3
count = 2 + 1
count = 3
```

And this keeps happening.

When `i` reaches 20:

```text
count = 19 + 1
count = 20
```

Then the loop stops and:

```java
System.out.println(count);
```

prints:

```text
20
```

---

## 🔑 Remember this difference

### When you want to **ADD** values:

```java
sum = sum + i;
```

Meaning:

> "Give me the value of `i` and add it to my total."

### When you want to **COUNT** things:

```java
count = count + 1;
```

1. int count = 0;

This creates an integer variable called count and gives it the starting value 0.

int count = 0;
2. The for loop
for(int i = 1; i <= 20; i++)

This has three parts:

int i = 1 → Start i at 1
i <= 20 → Keep running while i is less than or equal to 20
i++ → Increase i by 1 after each loop

So i takes these values:

1, 2, 3, 4, ... 19, 20

Therefore, the loop runs 20 times.

n simple words

The program basically says:

Start counting from 0. Run a loop 20 times, and add 1 to the count each time. Finally, print the count.

Output:

20

A useful point: i is controlling how many times the loop runs, while count is keeping track of the number of times it has run.
 */