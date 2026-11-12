package basics.Arrays.Examples;

public class TwoDimEx23 {

    public static void main(String[] args) {

        int sum = 0;

        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60}
        };

        for(int[] row : numbers) {
            int rowSum = 0;                  // ← Starting value for this row

            for(int value : row) {
                 rowSum = rowSum + value;    // ← This line adds numbers
            }
            System.out.println(rowSum);
        }
    }
}

/*
### ARRAY-23 — Find the sum of each row

Given:

```java
int[][] numbers = {
        {10, 20, 30},
        {40, 50, 60}
};
```

We want the output:

```text
60
150
```

That means:

* First row → `10 + 20 + 30 = 60`
* Second row → `40 + 50 + 60 = 150`

This is different from the previous total-sum problem because **we need a separate sum for each row**.

### Think before coding

You already know:

```java
for (int[] row : numbers)
```

gives you one row at a time.

Inside that, you can visit each value using:

```java
for (int value : row)
```

Your main question is:

> Where should the row's `sum` start, and when should it be printed?

 */


/*

## Step-by-Step Explanation

### 1. What the code does
This program creates a **2D array**, then prints the **sum of every row** one by one.

### 2. The key idea is that rowSum resets to 0 every time the outer loop moves to a new row.

### 3. Line-by-Line Breakdown of the code.

#### Creating the 2D array
```java
int[][] numbers = { {10, 20, 30}, {40, 50, 60} };
```
- `int[][]` = 2D array (array of arrays)
- `numbers` is the name of the array
- Each row is a 1D array inside it

#### First for loop (outer loop)
```java
for (int[] row : numbers) {
```
- This loop runs once for **each row**
- `int[] row` = variable that holds **one entire row** at a time
- First time: `row = {10, 20, 30}`
- Second time: `row = {40, 50, 60}`

#### Starting the sum for the row
```java
int rowSum = 0;
```
- This is placed **inside** the first `for` loop (after `for (int[] row : numbers)`)
- It is **only** the **starting value** for that row
- Every row gets its own fresh `rowSum = 0`

#### Second for loop (inner loop)
```java
for (int value : row) {
```
- This loop runs **inside** the first loop
- `int value` = one single number from the current row
- It visits every number in the row (10, 20, 30 or 40, 50, 60)

#### The magic line that adds numbers
```java
rowSum = rowSum + value;
```
- This line **adds** the current `value` to the old `rowSum`
- It uses the old value (left side) + new value (right side)
- The result is put back into `rowSum` so the total keeps growing
*
* What it does (Step by Step)

Java looks at the current value of rowSum (for example 10).
It takes the next value from the row (for example 20).
It adds them together: 10 + 20 = 30.
It puts the answer back into rowSum (so now rowSum becomes 30).

This happens over and over for every number in the row.
Visual Picture (Think of a Running Total)
textBefore loop:   rowSum = 0
After 10:      rowSum = 0 + 10 = 30
After 20:      rowSum = 30 + 20 = 50
After 30:      rowSum = 50 + 30 = 80
After 40:      rowSum = 80 + 40 = 120
After 50:      rowSum = 120 + 50 = 170
After 60:      rowSum = 170 + 60 = 230

### 4. Visual Picture (Think of a Classroom)

```
Row 0 (first element of 2D array):
   [10, 20, 30]          ← Teacher walks to this row
   Teacher: 10 + 20 + 30 = 60   ← Prints 60

Row 1 (second element of 2D array):
   [40, 50, 60]          ← Teacher walks to this row
   Teacher: 40 + 50 + 60 = 150  ← Prints 150
```

### 5. What the code prints
```
Sum of each row:
60
150
```

### 6. Why this works (Key Point)
- `rowSum = 0` must be **inside** the outer loop (not outside the whole program).
- The line `rowSum = rowSum + value;` is what actually builds the sum step by step.
- We print only after the inner loop finishes (so we have added **all** numbers of that row).

### 7. Common Mistake to Avoid
If you put `int rowSum = 0;` **outside** the `for (int[] row : numbers)` loop, every row will start from 0 again.
This is the mistake most freshers make.

### 8. Alternative Version (using normal for loop)
```java
for (int i = 0; i < numbers.length; i++) {
    int rowSum = 0;
    for (int j = 0; j < numbers[i].length; j++) {
        rowSum += numbers[i][j];
    }
    System.out.println(rowSum);
}
```
 */