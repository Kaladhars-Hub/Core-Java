package basics.Arrays.Examples;

import java.util.Arrays;

public class SingleDimEx15 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 30) {
                numbers[i] = 300;
                break;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}





/*

### ARRAY-15 — Replace an Array Element

Given:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

### Goal

Change the value **30 to 300** and then print the complete array.

Expected output:

```text
10
20
300
40
50
```

### The important new concept

This line:

```java
numbers[i] = 300;
```

means:

> Replace the value currently stored at index `i` with `300`.

When the loop reaches `30`:

```text
numbers[2] = 30
```

Then:

```java
numbers[2] = 300
```

So the array becomes:

```text
10, 20, 300, 40, 50
```

### About this line

```java
System.out.println(Arrays.toString(numbers));
```

`Arrays.toString()` is a convenient way to print the whole array.

It produces:

```text
[10, 20, 300, 40, 50]
```

Your expected output in the previous problem showed each number on a separate line, but your current output format is completely valid for the task of printing the complete array.

### One thing to remember

You actually **don't need a loop** if you already know that `30` is at index `2`:

```java
numbers[2] = 300;
```

But the loop version you wrote is more useful because it **searches for 30 first and then replaces it**. That is a better practice problem.



 */