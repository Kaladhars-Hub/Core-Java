package basics.Arrays.Examples;

public class JaggedEx3 {

    public static void main(String[] args) {

        int largest = 0;

        int[][] numbers = {
                {10, 20},
                {30, 40, 50},
                {60}
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
JAGGED-03 — Find the largest value in the jagged array.

Use the same array:

Java

```
int[][] numbers = {
    {10, 20},
    {30, 40, 50},
    {60}
};
```

 */