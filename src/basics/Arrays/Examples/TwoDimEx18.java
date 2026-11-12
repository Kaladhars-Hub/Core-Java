package basics.Arrays.Examples;

public class TwoDimEx18 {

    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60}
        };

        for(int[] row : numbers) {
            for(int value : row ) {
                System.out.println(value);
            }
        }
    }
}

/*

### ARRAY-18 — Print all 2D array elements

Your task is to print:

```text
10
20
30
40
50
60
```

Think about what you already know from 1D arrays:

* One loop was enough for a 1D array.
* Here we have **rows and columns**.

 */


/*
Explanation:

---

## Step-by-Step Explanation (Simple for Total Fresher)

### 1. What the code does
This small Java program creates a **2D array**, then prints every single number in it using **nested for-each loops**.

- It prints:
  ```
  10
  20
  30
  40
  50
  60
  ```

### 2. Line-by-Line Breakdown

#### Line 5–10: Creating the 2D array
```java
int[][] numbers = {
    {10, 20, 30},
    {40, 50, 60}
};
```

- `int[][] numbers` = **2D array** (array of arrays).
- `numbers` is the name of the array.
- The two lines `{10, 20, 30}` and `{40, 50, 60}` are the **two rows**.
- Each row is itself a **1D array** of `int`.

**Visual (how Java stores it):**
```
numbers =
[
  [10, 20, 30],   ← Row 0
  [40, 50, 60]    ← Row 1
]
```

#### Line 12: First `for` loop (`for(int[] row : numbers)`)
```java
for(int[] row : numbers) {
    // ...
}
```

- This loop **loops through each row** one by one.
- `int[] row` = the **variable name** (holds one entire row).
- `: numbers` = “in the array called numbers”.
- `int[]` tells Java that `row` will be a **1D array** (because each element of `numbers` is a 1D array).
- It first gives `row = {10, 20, 30}`, then `row = {40, 50, 60}`.

**Visual:**
```
First time: row = [10, 20, 30]
Second time: row = [40, 50, 60]
```

#### Line 13: Second `for` loop (`for(int value : row)`)
```java
for(int value : row ) {
    System.out.println(value);
}
```

- This is a **normal for-each loop** inside the first loop.
- `int value` = the **variable name** (holds one single number).
- `: row` = “in the row that we just got”.
- Every time the outer loop runs, the inner loop prints every number in that row.

### 3. How the loops work together (Think like a classroom)
- Outer loop = **Teacher walking to each row** (Row 0, then Row 1).
- Inner loop = **Teacher asking each student** (10, 20, 30 in Row 0; 40, 50, 60 in Row 1).

### 4. Why we use this pattern (Real reason)
- 2D array = **array of arrays**.
- So we must loop **first through the rows**, then **through the numbers inside each row**.
- This is the standard way to work with 2D arrays in Java.

### 5. What happens if we remove the inner loop?
```java
for(int[] row : numbers) {
    System.out.println(row);   // This would print the entire row as [I@hashcode
}
```
It would only print the rows themselves, not the numbers inside.

### 6. Bonus: Same code using normal `for` loop (alternative)
```java
for(int i = 0; i < numbers.length; i++) {        // i = row index
    for(int j = 0; j < numbers[i].length; j++) {  // j = column index
        System.out.println(numbers[i][j]);
    }
}
```

---

## Full Output of the Code
```
10
20
30
40
50
60
```

---

## Why This Code is Important for Beginners
- This is the **classic way** to print every element in a 2D array.
- You will use this pattern in almost every 2D array program (timetable, marks, grid, etc.).
- It shows the power of **nested for-each loops** in Java.

---

## Quick Tips for You (Fresher)
- Always use `int[] row : numbers` when looping 2D arrays.
- Never forget the inner loop — that’s what prints the actual numbers.
- You can change the array values anytime — the loop logic stays the same.

 */