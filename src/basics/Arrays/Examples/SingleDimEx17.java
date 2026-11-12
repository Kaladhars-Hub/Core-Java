package basics.Arrays.Examples;

public class SingleDimEx17 {

    public static void main(String[] args) {

        int sum = 0;

        int[] numbers = {10, 20, 30, 40, 50};

        for(int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        double average = (double) sum / numbers.length;
            System.out.println("Average: " + average);
    }
}





/*
ARRAY-17 — Calculate the Average of Array Elements

Problem: Calculate the average of all array elements.

Array:
{10, 20, 30, 40, 50}

Logic:
1. Create sum and start it at 0.
2. Use a for loop to visit every array element.
3. Add each element to sum.
4. Use numbers.length to get the number of elements.
5. Divide the total sum by the number of elements.
6. Store the average in a double variable.
7. Print the average.

Calculation:
Sum = 150
Number of elements = 5
Average = 150 / 5 = 30.0

Output:
Average: 30.0

Explanation:

Important parts
int sum = 0;

Creates the running total.

for(int i = 0; i < numbers.length; i++) {
    sum = sum + numbers[i];
}

Adds every array element:

0 + 10 = 10
10 + 20 = 30
30 + 30 = 60
60 + 40 = 100
100 + 50 = 150

So the final sum is 150.

The new line
double average = (double) sum / numbers.length;

This calculates:

150 / 5 = 30.0

sum is 150.

numbers.length is 5.

double allows the answer to contain decimal values.

(double) sum temporarily treats sum as a decimal number.

Why use double?

Suppose the sum is 10 and the array has 3 elements.

The average is:

10 / 3 = 3.333...

So double is useful because an average may not be a whole number.

*/