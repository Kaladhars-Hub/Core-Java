package basics.loopingstatements.Examples;

public class loopsEx19 {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}



/*

## 🔁 LOOP-19 —

Write a program using a for loop to calculate the sum of numbers from 1 to 5.
Expected result = 15;


You need to get:

```text
1 + 2 + 3 + 4 + 5 = 15
```

### sum is the variable that stores the answer as we keep adding.

So we can start with:

```java
int sum = 0;
```

Why `0`?

Because we haven't added anything yet.

```text
sum = 0
number = 1
```

We want:

```text
0 + 1 = 1
```

Next:

```text
1 + 2 = 3
```

Next:

```text
3 + 3 = 6
```

Then:

```text
6 + 4 = 10
```

Finally:

```text
10 + 5 = 15
```


```java
public class Loop21 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
```

### The important part

```java
int sum = 0;
```

We start the total at `0`.

Then:

```java
for (int i = 1; i <= 5; i++) {
```

The loop gives us:

```text
i = 1
i = 2
i = 3
i = 4
i = 5
```

And every time, this runs:

```java
sum = sum + i;
```

So:

```text
sum = 0 + 1  → 1
sum = 1 + 2  → 3
sum = 3 + 3  → 6
sum = 6 + 4  → 10
sum = 10 + 5 → 15
```

Finally:

```java
System.out.println(sum);
```

prints:

```text
15
```

### 🧠 Remember just this idea

When a loop needs to **keep adding things together**, we usually create a variable first:

```java
int sum = 0;
```

Then inside the loop, we keep updating it:

```java
sum = sum + i;
```

That's the main lesson from this problem.

And yes — **you should absolutely expect to struggle with these at first.** We're going to repeat this pattern with a few different problems until your brain starts recognizing it naturally.

 */
