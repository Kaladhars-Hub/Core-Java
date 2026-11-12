package basics.Arrays.Examples;

public class SingleDimEx28 {

    public static void main(String[] args) {

        String[] array1 = {"chai", "coffee"};
        String[] array2 = {"milk", "water", "coke"};

        String[] merged = new String[array1.length + array2.length];

        int index = 0;

        for (int i = 0; i < array1.length; i++) {
            merged[index] = array1[i];
            index++;
        }

        for (int i = 0; i < array2.length; i++) {
            merged[index] = array2[i];
            index++;
        }
        for(String value : merged) {
            System.out.print(value + " ");
        }
    }
}


/*
ARRAY-26 — Merge Two Arrays

Given:

String[] array1 = {"chai", "coffee"};
String[] array2 = {"milk", "water", "coke"};

Expected merged array:

["chai", "coffee", "milk", "water", "coke"]


==================================================
WHAT THIS PROGRAM DOES
==================================================

The program takes TWO separate arrays:

array1:
["chai", "coffee"]

array2:
["milk", "water", "coke"]

and combines their values into ONE new array:

merged:
["chai", "coffee", "milk", "water", "coke"]


We are NOT using any shortcut or built-in merge method.

We are doing the merging manually using:

- arrays
- for loops
- indexes
- assignment
- index++


==================================================
STEP 1 — FIRST ARRAY
==================================================

String[] array1 = {"chai", "coffee"};

This creates a String array called:

array1


It contains 2 values:

array1[0] = "chai"
array1[1] = "coffee"


So:

array1.length = 2


==================================================
STEP 2 — SECOND ARRAY
==================================================

String[] array2 = {"milk", "water", "coke"};

This creates another String array called:

array2


It contains 3 values:

array2[0] = "milk"
array2[1] = "water"
array2[2] = "coke"


So:

array2.length = 3


==================================================
STEP 3 — CREATE THE NEW MERGED ARRAY
==================================================

String[] merged =
        new String[array1.length + array2.length];


We need enough space to store:

all values from array1

PLUS

all values from array2.


array1.length = 2

array2.length = 3


So:

2 + 3 = 5


That means Java creates:

String[] merged = new String[5];


The valid indexes are:

merged[0]
merged[1]
merged[2]
merged[3]
merged[4]


At the beginning, because this is a String array,
the values are:

merged[0] = null
merged[1] = null
merged[2] = null
merged[3] = null
merged[4] = null


So initially we can imagine:

[null, null, null, null, null]


==================================================
STEP 4 — CREATE index VARIABLE
==================================================

int index = 0;


The job of index is:

"Tell Java where the next value should be stored
inside the merged array."


At first:

index = 0


So the first value will be stored in:

merged[0]


After storing something, we do:

index++


That moves us to the next empty position.


==================================================
IMPORTANT DIFFERENCE BETWEEN i AND index
==================================================

We use TWO index variables for different jobs.


i:

reads a value from the original array.


index:

decides where that value should be stored
inside the merged array.


Simple memory:

i     → READ

index → STORE


==================================================
STEP 5 — FIRST FOR LOOP
==================================================

for(int i = 0; i < array1.length; i++) {


This loop goes through:

array1


array1 has 2 values.

So:

i = 0
i = 1


The loop stops when:

i = 2


because:

2 < 2

is false.


==================================================
FIRST ITERATION OF ARRAY 1
==================================================

At the beginning:

i = 0
index = 0


array1[i]

means:

array1[0]


which contains:

"chai"


Now this line runs:

merged[index] = array1[i];


Since:

index = 0
i = 0


the line becomes:

merged[0] = array1[0];


And because:

array1[0] = "chai"


Java stores:

merged[0] = "chai";


Now merged looks like:

["chai", null, null, null, null]


Then:

index++;


changes:

index = 0

into:

index = 1


==================================================
SECOND ITERATION OF ARRAY 1
==================================================

Now:

i = 1
index = 1


array1[i]

means:

array1[1]


which contains:

"coffee"


This:

merged[index] = array1[i];


becomes:

merged[1] = array1[1];


So Java stores:

merged[1] = "coffee";


Now:

merged =
["chai", "coffee", null, null, null]


Then:

index++;


changes:

index = 1

into:

index = 2


==================================================
AFTER THE FIRST LOOP
==================================================

The first array is completely copied.


merged now contains:

["chai", "coffee", null, null, null]


Most importantly:

index = 2


That means:

merged[2]

is the NEXT EMPTY POSITION.


We do NOT reset index to 0.

Why?

Because we do not want to overwrite:

"chai"
and
"coffee"


We want the second array to continue from:

merged[2]


==================================================
STEP 6 — SECOND FOR LOOP
==================================================

for(int i = 0; i < array2.length; i++) {


Now i starts from 0 again.

That is completely fine.


This i belongs to this second loop.

Its job is to read:

array2[0]
array2[1]
array2[2]


But our separate variable:

index

is still:

2


So we can continue storing into the merged array.


==================================================
FIRST ITERATION OF ARRAY 2
==================================================

i = 0
index = 2


array2[i]

means:

array2[0]


which contains:

"milk"


This:

merged[index] = array2[i];


becomes:

merged[2] = array2[0];


So:

merged[2] = "milk";


Now:

merged =
["chai", "coffee", "milk", null, null]


Then:

index++


So:

index = 3


==================================================
SECOND ITERATION OF ARRAY 2
==================================================

i = 1
index = 3


array2[1] = "water"


So:

merged[3] = array2[1];


becomes:

merged[3] = "water";


Now:

merged =
["chai", "coffee", "milk", "water", null]


Then:

index++


index becomes:

4


==================================================
THIRD ITERATION OF ARRAY 2
==================================================

i = 2
index = 4


array2[2] = "coke"


So:

merged[4] = array2[2];


Java stores:

merged[4] = "coke";


Now:

merged =
["chai", "coffee", "milk", "water", "coke"]


Then:

index++


index becomes:

5


The merging work is now complete.


==================================================
COMPLETE MOVEMENT
==================================================

FIRST ARRAY:

array1[0] = "chai"
        ↓
merged[0] = "chai"


array1[1] = "coffee"
        ↓
merged[1] = "coffee"


At this point:

index = 2


SECOND ARRAY:

array2[0] = "milk"
        ↓
merged[2] = "milk"


array2[1] = "water"
        ↓
merged[3] = "water"


array2[2] = "coke"
        ↓
merged[4] = "coke"


==================================================
FINAL MERGED ARRAY
==================================================

merged[0] = "chai"
merged[1] = "coffee"
merged[2] = "milk"
merged[3] = "water"
merged[4] = "coke"


So:

merged =
["chai", "coffee", "milk", "water", "coke"]


==================================================
STEP 7 — PRINT THE MERGED ARRAY
==================================================

for(String value : merged) {

    System.out.println(value);
}


This is a for-each loop.


We don't need the indexes anymore.

We only want to print every value.


So Java does:

value = "chai"

prints:

chai


Then:

value = "coffee"

prints:

coffee


Then:

milk

water

coke


==================================================
OUTPUT
==================================================

chai
coffee
milk
water
coke


==================================================
WHY DO WE NEED index++?
==================================================

index++ means:

index = index + 1;


Its job is to move to the next empty position
inside merged.


Example:

index = 0
store "chai"

index++
↓
index = 1


store "coffee"

index++
↓
index = 2


Now the next value:

"milk"

can be stored in:

merged[2]


Without index++, Java would keep storing everything
in the same position.


For example, if index stayed 0:

merged[0] = "chai"

then:

merged[0] = "coffee"

would replace "chai".


Then:

merged[0] = "milk"

would replace "coffee".


So index++ is what allows us to move forward
through the new array.


==================================================
WHY DON'T WE RESET index BEFORE ARRAY 2?
==================================================

After copying array1:

index = 2


That is exactly where array2 should begin.


If we did:

index = 0;

again before the second loop,

then:

"milk"

would be stored at:

merged[0]


and it would replace:

"chai"


So index must KEEP its value after the first loop.


==================================================
WHY DO WE USE TWO LOOPS?
==================================================

Because we have two separate source arrays.


First loop:

copy everything from array1.


Second loop:

copy everything from array2.


Both of them store their values into the SAME:

merged array.


==================================================
MOST IMPORTANT LINE
==================================================

merged[index] = array1[i];


and later:

merged[index] = array2[i];


Read them as:

"Take the current value from the old array
and store it at the next available position
inside the merged array."


==================================================
MOST IMPORTANT THINGS TO REMEMBER
==================================================

1. New array size:

array1.length + array2.length


2. i:

reads values from the current source array.


3. index:

controls where we store values in merged.


4. index++:

moves to the next empty position.


5. Do NOT reset index before copying array2.


6. First loop copies array1.


7. Second loop copies array2.


8. for-each prints the final merged array.


==================================================
SIMPLE MEMORY VERSION
==================================================

Create array1
↓
Create array2
↓
Create merged array big enough for both

index = 0

First loop
↓
read array1[i]
↓
store in merged[index]
↓
index++

Second loop
↓
read array2[i]
↓
store in merged[index]
↓
index++

Finally
↓
print merged


==================================================
ONE-LINE MEMORY
==================================================

i reads from the old array,
index writes into the new array.
*/


