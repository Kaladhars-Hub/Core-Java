package basics.Arrays.Examples;

public class TwoDimEx19 {

    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60}
        };
        System.out.println(numbers[1][1]);
    }
}


/*
### ARRAY-19 — Access a specific 2D array value

Given:

Java

```
int[][] numbers = {
        {10, 20, 30},
        {40, 50, 60}
};
```

Print only:

```
50
```

### Think first

1. Which row contains `50`?

2. Which column contains `50`?

3. Use the format:

Java

```
numbers[row][column]
```

 */