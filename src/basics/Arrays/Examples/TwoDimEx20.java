package basics.Arrays.Examples;

public class TwoDimEx20 {

    public static void main(String[] args) {

        int sum = 0;

        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60}
        };

        for(int[] row : numbers) {
            for(int value : row) {
                sum = sum + value;
            }
        }
        System.out.println(sum);
    }
}





/*
### ARRAY-20 — Sum all values in a 2D array

Given:

```java
int[][] numbers = {
        {10, 20, 30},
        {40, 50, 60}
};
```

Find the **total sum of all 6 values**.

Expected output:

```text
210
```

This is useful because it combines what you already learned:

* 2D array
* rows and columns
* nested loops
* accumulator (`sum`)

 */


/*

        ## Explanation

### 1. Create the sum variable

```java
int sum = 0;
```

        `sum` is used to store the total of all the array values.

We start with `0` because we have not added any values yet.

        ---

        ### 2. Create the 2D array

```java
int[][] numbers = {
        {10, 20, 30},
        {40, 50, 60}
};
```

This array has:

        * 2 rows
* 3 columns in each row
* 6 values in total

The structure is:

        ```text
Row 0 → 10  20  30
Row 1 → 40  50  60
        ```

        ---

        ### 3. Outer enhanced for loop

```java
for (int[] row : numbers)
        ```

The outer loop goes through the **rows** of the 2D array.

Each time the loop runs, `row` represents one complete 1D array.

        First:

        ```text
        row = {10, 20, 30}
```

Then:

        ```text
        row = {40, 50, 60}
```

        ---

        ### 4. Inner enhanced for loop

```java
for (int value : row)
        ```

The inner loop goes through each value inside the current row.

For the first row:

        ```text
        value = 10
value = 20
value = 30
        ```

For the second row:

        ```text
        value = 40
value = 50
value = 60
        ```

        ---

        ### 5. Add each value to sum

```java
        sum = sum + value;
```

This adds the current `value` to the existing `sum`.

Execution:

        ```text
Initial sum = 0

value = 10
sum = 0 + 10
sum = 10

value = 20
sum = 10 + 20
sum = 30

value = 30
sum = 30 + 30
sum = 60

value = 40
sum = 60 + 40
sum = 100

value = 50
sum = 100 + 50
sum = 150

value = 60
sum = 150 + 60
sum = 210
        ```

        ---

        ### 6. Print the final sum

```java
System.out.println(sum);
```

After both loops finish, `sum` contains the total:

        ```text
210
        ```

        ---

        ## Important Points to Remember

1. A 2D array contains multiple rows.
        2. The outer loop goes through each row.
3. The inner loop goes through each value in the current row.
4. `value` represents the current array element.
5. `sum = sum + value` adds each element to the total.
        6. `sum` must be initialized before the loops.
        7. The final result is printed after both loops finish.
8. This uses **nested enhanced for-each loops**.

        ## Connection to 1D Arrays

For a 1D array, you previously used:

        ```java
        sum = sum + numbers[i];
```

For this 2D array, the inner enhanced for loop already gives us the current value through:

        ```java
        value
```

Therefore:

        ```java
        sum = sum + value;
```

The main idea is still the same:

        > **Take the current value and add it to the existing sum.**

 */