package basics.Arrays.Examples;

public class JaggedEx2 {

    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20},
                {30, 40, 50},
                {60}
        };
        for(int[] row : numbers) {
            for(int value : row) {
                System.out.println(value);
            }
        }
    }
}

/*

### JAGGED-02 — Print all values

Given:

```java
int[][] numbers = {
    {10, 20},
    {30, 40, 50},
    {60}
};
```

 */