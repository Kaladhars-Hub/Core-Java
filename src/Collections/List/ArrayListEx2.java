package Collections.List;

import java.util.*;

public class ArrayListEx2 {

    public static void main(String[] args) {

        // Step 1: Create the original ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(9);
        numbers.add(8);
        numbers.add(5);
        numbers.add(0);
        numbers.add(10);

        // Step 2: Create two empty ArrayLists
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        // Step 3: Go through the original ArrayList

        for(int i = 0; i < numbers.size(); i++) {

            if(i < 3) {
                a1.add(numbers.get(i));
            }else {
                a2.add(numbers.get(i));
            }
        }
        // Step 4: Print both ArrayLists
        System.out.println(a1);
        System.out.println(a2);

    }

}

/*
=======================================================================
           P49 - LIST-01: SPLIT ONE ARRAYLIST INTO TWO
=======================================================================

1. WHAT IS THE PROBLEM?
-----------------------------------------------------------------------

We are given one ArrayList containing 6 numbers:

Original List = [4, 9, 8, 5, 0, 10]

Our task is to divide this original List into two separate Lists.

Expected output:

First List  = [4, 9, 8]
Second List = [5, 0, 10]

IMPORTANT:
We should take the elements from the original List.

We should NOT manually type the values into the two new Lists.


2. WHY WAS MY FIRST APPROACH NOT THE EXPECTED SOLUTION?
-----------------------------------------------------------------------

My original approach was:

ArrayList<Integer> a1 = new ArrayList<>();
a1.add(4);
a1.add(9);
a1.add(8);

ArrayList<Integer> a2 = new ArrayList<>();
a2.add(5);
a2.add(0);
a2.add(10);

This code is CORRECT Java.

It also produces the expected output.

But it does not actually split an existing List.

Instead, I am manually creating two separate Lists.

For example:

If the original List contains 100 elements,
I cannot keep manually typing all those elements.

Therefore, the purpose of this assignment is to learn:

1. How to read elements from an existing ArrayList.
2. How to use a loop with an ArrayList.
3. How to add retrieved elements into another ArrayList.
4. How to divide elements based on their index.


3. UNDERSTANDING THE INDEXES
-----------------------------------------------------------------------

Original List:

Index:     0   1   2   3   4   5
           |   |   |   |   |   |
Values:    4   9   8   5   0   10

Total elements = 6

First half  = indexes 0, 1, 2
Second half = indexes 3, 4, 5

So:

Indexes 0 to 2 --> First List
Indexes 3 to 5 --> Second List


4. WHY DO WE NEED THREE ARRAYLISTS?
-----------------------------------------------------------------------

ArrayList<Integer> numbers = new ArrayList<>();

This is the ORIGINAL List.

It contains all 6 numbers.

ArrayList<Integer> a1 = new ArrayList<>();

This is the FIRST empty List.

It will receive the first 3 numbers.

ArrayList<Integer> a2 = new ArrayList<>();

This is the SECOND empty List.

It will receive the remaining 3 numbers.

Initially:

numbers = [4, 9, 8, 5, 0, 10]
a1      = []
a2      = []


5. WHY DO WE USE A FOR LOOP?
-----------------------------------------------------------------------

We need to read every element from the original List.

Instead of writing:

numbers.get(0);
numbers.get(1);
numbers.get(2);
numbers.get(3);
numbers.get(4);
numbers.get(5);

We can use a for loop.

for (int i = 0; i < numbers.size(); i++)

Explanation:

int i = 0
    Start from index 0.

i < numbers.size()
    Continue while i is less than the total number of elements.

    numbers.size() returns 6.

    Therefore, the loop runs from index 0 to index 5.

i++
    Move to the next index after every repetition.


6. MOST IMPORTANT LINE IN THIS PROBLEM
-----------------------------------------------------------------------

a1.add(numbers.get(i));

Understand this from the inside.

FIRST:

numbers.get(i)

This retrieves an element from the original List.

For example:

When i = 0:

numbers.get(0) returns 4.

SECOND:

a1.add(4);

This adds the retrieved number into the first List.

Therefore:

a1.add(numbers.get(i));

means:

"Get the element at index i from the original List
 and add that element into the first List."

IMPORTANT DIFFERENCE:

get() --> READ an existing element.
add() --> INSERT an element into a List.

We use numbers.get(i) because numbers contains the original data.

We should NOT use a1.get(i) because a1 is initially empty.

Trying to read index 0 from an empty List causes an
IndexOutOfBoundsException.


7. WHY DO WE USE IF AND ELSE?
-----------------------------------------------------------------------

We need to decide which List should receive each number.

if (i < numbers.size() / 2)

The original List contains 6 elements.

numbers.size() / 2

= 6 / 2
= 3

Therefore, the condition becomes:

if (i < 3)

When i = 0, 1, or 2:
    Add the number to a1.

When i = 3, 4, or 5:
    Add the number to a2.

The if/else condition decides the destination List.


8. STEP-BY-STEP LOOP EXECUTION
-----------------------------------------------------------------------

Initially:

numbers = [4, 9, 8, 5, 0, 10]
a1      = []
a2      = []

-------------------------------------------------------
Iteration 1:

i = 0

Is 0 < 3? YES.

numbers.get(0) returns 4.

Add 4 to a1.

a1 = [4]
a2 = []

-------------------------------------------------------
Iteration 2:

i = 1

Is 1 < 3? YES.

numbers.get(1) returns 9.

Add 9 to a1.

a1 = [4, 9]
a2 = []

-------------------------------------------------------
Iteration 3:

i = 2

Is 2 < 3? YES.

numbers.get(2) returns 8.

Add 8 to a1.

a1 = [4, 9, 8]
a2 = []

-------------------------------------------------------
Iteration 4:

i = 3

Is 3 < 3? NO.

The else block executes.

numbers.get(3) returns 5.

Add 5 to a2.

a1 = [4, 9, 8]
a2 = [5]

-------------------------------------------------------
Iteration 5:

i = 4

Is 4 < 3? NO.

numbers.get(4) returns 0.

Add 0 to a2.

a1 = [4, 9, 8]
a2 = [5, 0]

-------------------------------------------------------
Iteration 6:

i = 5

Is 5 < 3? NO.

numbers.get(5) returns 10.

Add 10 to a2.

a1 = [4, 9, 8]
a2 = [5, 0, 10]

-------------------------------------------------------

The loop stops when i becomes 6 because:

6 < 6 is FALSE.


9. FINAL OUTPUT
-----------------------------------------------------------------------

[4, 9, 8]
[5, 0, 10]


10. WHAT IF THE ORIGINAL LIST HAS 10 ELEMENTS?
-----------------------------------------------------------------------

Suppose:

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

numbers.size() = 10

numbers.size() / 2 = 5

The condition becomes:

if (i < 5)

First List receives indexes 0 to 4.

Second List receives indexes 5 to 9.

Output:

a1 = [1, 2, 3, 4, 5]
a2 = [6, 7, 8, 9, 10]

This is why using numbers.size() / 2 is better than
hardcoding the number 3.

If the List has an odd number of elements, integer division
places the extra element in the second List.


11. IMPORTANT CONCEPTS LEARNED
-----------------------------------------------------------------------

1. ArrayList stores elements using indexes starting from 0.

2. size() returns the total number of elements.

3. get(index) retrieves an existing element.

4. add(value) inserts an element into a List.

5. A for loop can read List elements one by one.

6. if/else can decide which List receives an element.

7. We can transfer an element from one List to another:

       a1.add(numbers.get(i));

8. The original List remains unchanged.

9. Manually creating two Lists is different from splitting
   one existing List.

10. We should understand the logic instead of memorizing
    the complete program.


12. FINAL QUICK REVISION
-----------------------------------------------------------------------

ORIGINAL LIST
     |
     | Read each element using get(i)
     |
     v
   FOR LOOP
     |
     v
Check whether index is in the first half
     |
     |---------------------------|
     |                           |
    YES                          NO
     |                           |
     v                           v
  a1.add()                    a2.add()
     |                           |
     v                           v
[4, 9, 8]                  [5, 0, 10]


KEY LINE:

a1.add(numbers.get(i));

Meaning:

"Read a number from the original List and add it
 to another List."

*/