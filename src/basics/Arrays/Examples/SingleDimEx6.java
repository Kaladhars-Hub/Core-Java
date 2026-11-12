package basics.Arrays.Examples;

public class SingleDimEx6 {

    public static void main(String[] args) {

        int sum = 0;

        int[] numbers = {10, 20, 30, 40, 50};
        for(int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}




/*

ARRAY-06 — Find the Sum of All Array Elements

Array:
{10, 20, 30, 40, 50}

Logic:
1. Create an integer variable named sum.
2. Start sum with 0 because no values have been added yet.
3. Use a for loop to visit every array element.
4. Start i at 0 because array indexes start from 0.
5. Continue while i is smaller than numbers.length.
6. numbers[i] gives the current array element.
7. Add the current array element to sum.
8. Print sum after the loop finishes.

Calculation:
sum = 0

0 + 10 = 10
10 + 20 = 30
30 + 30 = 60
60 + 40 = 100
100 + 50 = 150

Output:
150

Important lines
int sum = 0;

Creates the total variable and starts it at 0.

sum = sum + numbers[i];

Means:

Take the existing total and add the current array value to it.

System.out.println(sum);

Prints the final total after all array elements have been added.

GitHub note

This problem combines:

> Array.

> Array index.

> numbers.length

> Regular for loop.

> Accumulator variable.

> Addition of array elements.

*/


