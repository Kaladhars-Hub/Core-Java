package basics.Arrays.Examples;

public class TwoDimEx22 {

    public static void main(String[] args) {

        int count = 0;

        int[][] numbers = {
                {10, 25, 30},
                {45, 80, 61}
        };

        for(int[] row : numbers) {
            for(int value : row) {

                if(value %2 == 0) {
                    count = count + 1;
                }
            }
        }
        System.out.println(count);
    }
}





/*
### ARRAY-22 — Count even numbers in a 2D array

Given:

Java

```
int[][] numbers = {
        {10, 25, 30},
        {45, 80, 61}
};
```

Count how many values are even.

Expected output:

```
3
```

The even values are `10`, `30`, and `80`.

### Your task

Use:

* A `count` variable

* Nested loops to visit every value

* A condition to check whether the current value is even

* Print the count after both loops

 */