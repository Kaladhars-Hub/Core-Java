package basics.Arrays.Examples;

public class TwoDimEx24 {

    public static void main(String[] args) {

        int[][] numbers = {
                {10, 45, 30},
                {25, 80, 60}
        };

        for(int[] row : numbers) {
            int rowLargest = 0;
            for(int value : row) {
                if(value > rowLargest) {
                    rowLargest = value;
                }
            }
            System.out.println(rowLargest);
        }
    }
}





/*

### ARRAY-24 — Find the largest value in each row

Given:

```java
int[][] numbers = {
        {10, 45, 30},
        {25, 80, 60}
};
```

Find the **largest value from each row**.

Expected output:

```text
45
80
```

This is a useful combination of two things you've already learned:

* Finding the largest value in a 1D array
* Going through each row of a 2D array

### Think before coding

For each row:

1. You need a `largest` variable.
2. Go through every `value` in that row.
3. Compare the current `value` with `largest`.
4. Update `largest` when needed.
5. After finishing that row, print its largest value.

**Important:** `largest` must be reset for each new row.

 */

/*
## Step-by-Step Explanation (Very Simple for Beginners)

### 1. What the code does
This program creates a **2D array**, then finds and prints the **largest number in each row** separately.

### 3. Line-by-Line Breakdown

#### Line 6: Creating the 2D array
```java
int[][] numbers = {
    {10, 45, 30},
    {25, 80, 60}
};
```
- `int[][]` = 2D array (array of arrays)
- `numbers` is the name of the array
- We are storing two rows of numbers

#### Line 11: First for loop (outer loop)
```java
for(int[] row : numbers) {
```
- This loop runs once for **each row** (row 0, then row 1)
- `int[] row` = variable that holds **one entire row** at a time
- First time: `row = {10, 45, 30}`
- Second time: `row = {25, 80, 60}`

#### Line 12: Starting the largest number variable
```java
int rowLargest = 0;
```
- This is placed **inside** the first `for` loop
- It is the **starting value** for finding the biggest number in this row
- Every row gets its own fresh `rowLargest = 0`

#### Line 14: Second for loop (inner loop)
```java
for(int value : row) {
```
- This loop runs **inside** the first loop
- `int value` = one single number from the current row
- It visits every number in the row (10, 45, 30 or 25, 80, 60)

#### Line 15: The “if” condition
```java
if(value > rowLargest) {
    rowLargest = value;
}
```
- This is the **magic line** that finds the largest number
- `value > rowLargest` = “Is this number bigger than what we have seen so far?”
- If yes, we update `rowLargest` to this bigger value
- It starts with `rowLargest = 0` so the first number will always be bigger

#### Line 18: Printing the result
```java
System.out.println(rowLargest);
```
- This prints the biggest number **after** the inner loop finishes
- We only print once per row (after checking all numbers in that row)

### 4. Visual Picture (Think of a Classroom)

```
Row 0:
   [10, 45, 30]          ← Teacher walks to this row
   Teacher checks:
   10 > 0? Yes → 10
   45 > 10? Yes → 45
   30 > 45? No
   Biggest = 45   ← Prints 45

Row 1:
   [25, 80, 60]          ← Teacher walks to this row
   Teacher checks:
   25 > 0? Yes → 25
   80 > 25? Yes → 80
   60 > 80? No
   Biggest = 80   ← Prints 80
```

### 5. What the code prints (Output)
```
45
80
```

### 6. Why we start with `rowLargest = 0`
- Because all numbers are positive, the first number will always be bigger than 0
- This is the simplest way to start finding the maximum

### 7. Common Mistake to Avoid
If you put `int rowLargest = 0;` **outside** the `for (int[] row : numbers)` loop, every row will start from 0 again.
This is the mistake most freshers make.

### 8. One-Line Summary
> `rowLargest = value` inside the `if` condition is how Java keeps track of the biggest number seen so far.

 */