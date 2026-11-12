package basics.Arrays.Examples;

public class SingleDimEx9 {

    public static void main(String[] args) {

        int[] numbers = {35, 12, 48, 7, 26};

        int smallest = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println(smallest);
    }
}





/*

### ARRAY-09 — Find the Smallest Element in an Array

Given:

```java
int[] numbers = {35, 12, 48, 7, 26};
```

### Goal

Make the **computer find the smallest number**.

Expected output:

```text
7
```

### Why your code works

Java

```
int smallest = numbers[0];
```

The first element, `35`, is used as the starting smallest value.

Java

```
for(int i = 1; i < numbers.length; i++)
```

The loop starts at index `1` because index `0` was already used as the initial value.

Java

```
if (numbers[i] < smallest)
```

Checks whether the current array element is smaller than the current smallest value.

Java

```
smallest = numbers[i];
```

If the current element is smaller, it becomes the new smallest value.

### Trace

```
35 → starting smallest
12 < 35 → smallest = 12
48 < 12 → false
7 < 12  → smallest = 7
26 < 7  → false
```

Output:

```
7
```

### Important pattern

For largest:

Java

```
if (numbers[i] > largest)
```

For smallest:

Java

```
if (numbers[i] < smallest)
```

 */