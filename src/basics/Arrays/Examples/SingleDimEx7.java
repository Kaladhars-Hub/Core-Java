package basics.Arrays.Examples;

public class SingleDimEx7 {

    public static void main(String[] args) {

        int[] numbers = {12, 45, 23, 67, 34};

        int largest = numbers[0];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
                index = i;
            }
        }
        System.out.println(largest);
        System.out.println(index);
    }
}



/*
ARRAY-07 — Find the Largest Element and Its Index

Given:
int[] numbers = {12, 45, 23, 67, 34};

Expected Output:
Largest value = 67
Index = 3

--------------------------------------------------
WHAT THIS PROGRAM DOES
--------------------------------------------------

The program:

1. Assumes the first array element is the largest value.
2. Stores the index of that value as 0.
3. Goes through the remaining array elements.
4. Compares each value with the current largest value.
5. If a bigger value is found:
   - update largest
   - update index
6. Finally prints both the largest value and its index.


--------------------------------------------------
IMPORTANT VARIABLES
--------------------------------------------------

int largest = numbers[0];

This stores the current largest VALUE.

Initially:

numbers[0] = 12

So:

largest = 12


int index = 0;

This stores the POSITION of the current largest value.

Since the initial largest value is numbers[0],
its index is:

0


Remember:

largest → stores VALUE

index → stores POSITION


--------------------------------------------------
THE FOR LOOP
--------------------------------------------------

for (int i = 1; i < numbers.length; i++) {

The loop starts from index 1.

Why?

Because we already used numbers[0] as the initial largest value.

So there is no need to compare:

numbers[0]

with itself again.


The loop checks:

numbers[1] = 45
numbers[2] = 23
numbers[3] = 67
numbers[4] = 34


--------------------------------------------------
THE IF CONDITION
--------------------------------------------------

if (numbers[i] > largest) {

Read this as:

"If the current array value is greater than
the largest value we have found so far."


If this condition is true:

largest = numbers[i];

updates the largest value.


And:

index = i;

stores the index where that new largest value was found.


--------------------------------------------------
STEP-BY-STEP
--------------------------------------------------

Initial:

largest = 12
index = 0


i = 1

numbers[1] = 45

45 > 12 → true

largest = 45
index = 1


i = 2

numbers[2] = 23

23 > 45 → false

No change.


i = 3

numbers[3] = 67

67 > 45 → true

largest = 67
index = 3


i = 4

numbers[4] = 34

34 > 67 → false

No change.


--------------------------------------------------
FINAL VALUES
--------------------------------------------------

largest = 67

index = 3


So:

67 is the largest value.

It is stored at:

index 3


--------------------------------------------------
MAIN IDEA TO REMEMBER
--------------------------------------------------

largest keeps track of:

"What is the biggest value I have found?"


index keeps track of:

"Where did I find that biggest value?"


Whenever a new bigger value is found:

largest = numbers[i];
index = i;

*/
