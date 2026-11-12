package basics.Arrays.Examples;

public class TwoDimEx25 {

    public static void main(String[] args) {

        int count = 0;

        int[][] numbers = {
                {10, 45, 30},
                {25, 80, 60}
        };

        for(int[] row : numbers) {
            for(int value : row) {
                if(value > 30) {
                    count = count + 1;
                }
            }
        }
        System.out.println(count);
    }
}





/*
### ARRAY-25 — Count values greater than 30 in a 2D array

Given:

```java
int[][] numbers = {
        {10, 45, 30},
        {25, 80, 60}
};
```

Count how many values are **greater than 30**.

Expected output:

```text
3
```

Before coding, think:

* You need a `count` variable.
* Visit every value using the nested loops you already know.
* Check the current `value`.
* If it satisfies the condition, increase `count`.
* Print `count` after both loops.

 */