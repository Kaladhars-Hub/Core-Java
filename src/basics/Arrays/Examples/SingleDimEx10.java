package basics.Arrays.Examples;

public class SingleDimEx10 {

    public static void main(String[] args) {

        int[] numbers = {15, 8, 23, 42, 11, 30, 17};

        int largest = numbers[0];

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0 && numbers[i] > largest ) {
                largest = numbers[i];
            }
        }
        System.out.println(largest);
    }
}





/*

### ARRAY-10 — Find the Largest Even Number in an Array


Given an integer array, find the largest even number in the array.

Example
int[] numbers = {15, 8, 23, 42, 11, 30, 17};


The even numbers are:

8, 42, 30


Among these, 42 is the largest.

Output:

42

Approach

We need to satisfy two conditions:

The number must be even.
The number must be greater than the current largest even number.
Checking if a number is even

A number is even when its remainder after dividing by 2 is 0.

numbers[i] % 2 == 0

Checking if it is the largest

We compare the current number with the largest number found so far:

numbers[i] > largest


Since both conditions must be true, we use the && (AND) operator:

if (numbers[i] % 2 == 0 && numbers[i] > largest)


If both conditions are true, we update largest.


Dry Run
Number	Even?	Greater than largest?	largest
15	❌	—	Integer.MIN_VALUE
8	✅	✅	8
23	❌	—	8
42	✅	✅	42
11	❌	—	42
30	✅	❌	42
17	❌	—	42

Final result:

42

Key Learning

When solving problems, break the English question into conditions.

"Largest Even Number"

Even → number % 2 == 0
Largest → number > largest
Both must be true → &&

So the main condition becomes:

number % 2 == 0 && number > largest

 */