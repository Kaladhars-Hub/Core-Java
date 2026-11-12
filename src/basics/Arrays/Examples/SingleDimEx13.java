package basics.Arrays.Examples;

public class SingleDimEx13 {

    public static void main(String[] args) {

        int count = 0;

        int[] numbers = {12, 25, 7, 42, 18, 30, 55};

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 20) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}





/*

### ARRAY-13 — Count Numbers Greater Than 20

Given:

Java

```
int[] numbers = {12, 25, 7, 42, 18, 30, 55};
```

### Goal

Count how many elements are greater than 20.

Expected output:

```
4
```

The numbers greater than 20 are:

```
25, 42, 30, 55
```

 */

/*
 * This program counts how many numbers in the array
 * are greater than 20.
 *
 * Step 1:
 * We create a variable called 'count' and set it to 0.
 * We start with 0 because we haven't found any numbers
 * greater than 20 yet.
 *
 * Step 2:
 * We create an array containing these numbers:
 * 12, 25, 7, 42, 18, 30, 55
 *
 * Step 3:
 * We use a for loop to go through every number in the array.
 * The variable 'i' represents the current index.
 *
 * Step 4:
 * For each number, we check:
 *
 *     numbers[i] > 20
 *
 * If the current number is greater than 20,
 * we increase the count by 1.
 *
 * count = count + 1;
 *
 * This can also be written as:
 *
 * count++;
 *
 * Step 5:
 * After checking all the numbers, we print the final count.
 *
 * The numbers greater than 20 are:
 *
 * 25, 42, 30, 55
 *
 * There are 4 numbers greater than 20.
 *
 * Therefore, the output is:
 *
 * 4
 */