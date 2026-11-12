package basics.Arrays.Examples;

public class TwoDimEx21 {

    public static void main(String[] args) {

       int largest = 0;

        int[][] numbers = {
                {10, 45, 30},
                {25, 80, 60}
        };
        for(int[] row : numbers) {
            for(int value : row) {
                if(value > largest) {
                    largest = value;
                }
            }
        }
        System.out.println(largest);
    }
}





/*
### ARRAY-21 — Find the largest value in a 2D array

Given:

```java
int[][] numbers = {
        {10, 45, 30},
        {25, 80, 60}
};
```

Find the **largest value**.

Expected output:

```text
80
```

You already know how to find the largest value in a **1D array**. Now apply the same idea to a 2D array.

### Think before coding

* What should you use as the initial `largest` value?
* You already know how to visit every value using the nested loops.
* For each `value`, what comparison should you make with `largest`?

 */