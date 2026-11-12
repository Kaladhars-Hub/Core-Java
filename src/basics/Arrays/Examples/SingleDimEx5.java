package basics.Arrays.Examples;

public class SingleDimEx5 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}


/*

### ARRAY-05 — Print array elements using index

Given:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

Print every element using a **regular `for` loop**, so the output is:

```text
10
20
30
40
50
```

This time, **do not use `for-each`**.

Think about:

1. Where does the array index start?
2. How do you know when the index should stop?
3. What should you use to access the value at the current index?

###Explanation:

Your code:

```java
for(int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

For this array:

```text
Value:  10   20   30   40   50
Index:   0    1    2    3    4
```

### Why `i = 0`?

Because the **first index of an array is 0**.

So we start at index `0`.

### Why `i < numbers.length`?

Your array has:

```text
numbers.length = 5
```

But the indexes are:

```text
0, 1, 2, 3, 4
```

There is **no index 5**.

So we continue while:

```text
i < 5
```

That allows:

```text
i = 0
i = 1
i = 2
i = 3
i = 4
```

When `i` becomes `5`, the condition is false and the loop stops.

### Why `numbers[i]`?

Because `i` represents the **current index**.

So:

```text
i = 0 → numbers[0] → 10
i = 1 → numbers[1] → 20
i = 2 → numbers[2] → 30
i = 3 → numbers[3] → 40
i = 4 → numbers[4] → 50
```

> **`i` is the index, and `numbers[i]` gets the value at that index.**


 */