package basics.loopingstatements.Examples;

public class WhileEx1 {

    public static void main(String[] args) {

        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}

/*
Let's start the short `while`-loop section.

### First, understand the idea

A `while` loop repeats a block of code **as long as its condition remains true**.

The basic structure is:

```text
start with a value
↓
check the condition
↓
if true → execute the loop body
↓
change the value
↓
check again
```

The important thing is that **you must make sure the value eventually changes so the loop can stop**.

### WHILE-01 — Print numbers 1 to 5

Write a Java program using a **`while` loop** to print:

```text
1
2
3
4
5
```

1. What value should the number start with?
2. What should be the stopping point?
3. What needs to happen after each print?

Explanation:

```java
int i = 1;
```

Starts at `1`.

```java
while (i <= 5)
```

The loop continues as long as `i` is 5 or less.

```java
System.out.println(i);
i++;
```

Prints the current value and then increases it by 1.

So the values are:

`1 → 2 → 3 → 4 → 5 → 6`

When `i` becomes `6`, `i <= 5` is false, so the loop stops.

 */