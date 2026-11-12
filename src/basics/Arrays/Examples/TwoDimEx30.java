package basics.Arrays.Examples;

public class TwoDimEx30 {

    public static void main(String[] args) {

        int[] [] array1 = {
                {1, 2, 1},
                {9, 7, 2},
                {7, 6, 4}
        };
        int[][] array2 = {
                {2, 6, 8},
                {0, 1, 3},
                {1, 2, 4}
        };

        int[][] result = new int[3][3];

        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array1.length; j++) {

                result[i][j] = array1[i][j] + array2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}


/*

ARRAY-30 — Add Two 2D Arrays


Given:

Array 1:
1 2 1
9 7 2
7 6 4

Array 2:
2 6 8
0 1 3
1 2 4

Expected Output:

3 8 9
9 8 5
8 8 8


--------------------------------------------------
WHAT THIS PROGRAM DOES
--------------------------------------------------

This program:

1. Creates two 2D integer arrays.
2. Creates a third 2D array called result.
3. Goes through every row and every column.
4. Takes the value from array1 and array2
   at the SAME row and SAME column.
5. Adds those two values.
6. Stores the answer in result at the same position.
7. Prints the answer immediately.

The main idea is:

array1[i][j] + array2[i][j]

and store it in:

result[i][j]


==================================================
COMPLETE CODE
==================================================

public static void main(String[] args) {

    int[][] array1 = {
            {1, 2, 1},
            {9, 7, 2},
            {7, 6, 4}
    };

    int[][] array2 = {
            {2, 6, 8},
            {0, 1, 3},
            {1, 2, 4}
    };

    int[][] result = new int[3][3];

    for(int i = 0; i < array1.length; i++) {

        for(int j = 0; j < array1[i].length; j++) {

            result[i][j] = array1[i][j] + array2[i][j];

            System.out.print(result[i][j] + " ");
        }

        System.out.println();
    }
}


==================================================
STEP 1 — CREATE THE FIRST 2D ARRAY
==================================================

int[][] array1 = {
        {1, 2, 1},
        {9, 7, 2},
        {7, 6, 4}
};

int[][] means:

"Create a two-dimensional integer array."

A 2D array has:

rows
and
columns.


We can imagine array1 like this:

             COLUMN

             0   1   2

ROW 0        1   2   1
ROW 1        9   7   2
ROW 2        7   6   4


So:

array1[0][0] = 1
array1[0][1] = 2
array1[0][2] = 1

array1[1][0] = 9
array1[1][1] = 7
array1[1][2] = 2

array1[2][0] = 7
array1[2][1] = 6
array1[2][2] = 4


Remember:

array1[row][column]


==================================================
STEP 2 — CREATE THE SECOND 2D ARRAY
==================================================

int[][] array2 = {
        {2, 6, 8},
        {0, 1, 3},
        {1, 2, 4}
};

This is another 3 × 3 array.

It looks like:

             COLUMN

             0   1   2

ROW 0        2   6   8
ROW 1        0   1   3
ROW 2        1   2   4


Both array1 and array2 have:

3 rows
and
3 columns.


That is important because we are adding values
from the SAME positions.


==================================================
STEP 3 — CREATE THE RESULT ARRAY
==================================================

int[][] result = new int[3][3];

This creates another 2D array.

It also has:

3 rows
3 columns


At the beginning, because it is an int array,
all values are automatically:

0


So initially result looks like:

0 0 0
0 0 0
0 0 0


We will replace those 0 values with the sums
from array1 and array2.


==================================================
STEP 4 — OUTER FOR LOOP
==================================================

for(int i = 0; i < array1.length; i++) {

The outer loop controls the ROWS.


Here:

array1.length

tells us how many rows are in array1.


There are 3 rows.

So:

array1.length = 3


The value of i will be:

i = 0
i = 1
i = 2


So:

i = 0 → row 0

i = 1 → row 1

i = 2 → row 2


Simple memory:

i → ROW


==================================================
STEP 5 — INNER FOR LOOP
==================================================

for(int j = 0; j < array1[i].length; j++) {

The inner loop controls the COLUMNS
inside the current row.


Simple memory:

j → COLUMN


So when:

i = 0

Java is working on row 0.


Then j becomes:

j = 0
j = 1
j = 2


That means Java accesses:

array1[0][0]
array1[0][1]
array1[0][2]


Then the inner loop finishes.


The outer loop changes:

i = 1


Then the inner loop again does:

j = 0
j = 1
j = 2


So Java accesses:

array1[1][0]
array1[1][1]
array1[1][2]


Then:

i = 2

and Java accesses:

array1[2][0]
array1[2][1]
array1[2][2]


==================================================
WHY DO WE USE array1[i].length?
==================================================

array1.length

gives the number of ROWS.


But:

array1[i].length

gives the number of COLUMNS
inside the current row.


So:

array1.length
→ row count


array1[i].length
→ column count of the current row


==================================================
STEP 6 — THE MOST IMPORTANT LINE
==================================================

result[i][j] = array1[i][j] + array2[i][j];


Read this in simple language as:

"Take the value from array1 at row i and column j,
add it to the value from array2
at the same row i and column j,
then store the answer inside result
at that same row and column."


So:

array1[i][j]

means:

value from array1


array2[i][j]

means:

value from array2


result[i][j]

means:

where the answer should be stored


==================================================
WHY DON'T WE NEED ANOTHER LOOP FOR array2?
==================================================

This is important.

The for loops do not belong only to array1.

The loops are creating the values:

i
and
j


Those values represent:

row
and
column


Inside the loop we use the SAME i and j on:

array1
array2
result


For example:

i = 1
j = 2


Then Java reads:

array1[1][2]

and:

array2[1][2]


and stores the answer in:

result[1][2]


So even though the loop condition uses:

array1.length

the same i and j values are also used
to access array2.


The loop condition is only deciding:

"How far should i and j go?"


The code inside decides:

"Which arrays should use those i and j values?"


==================================================
EXAMPLE 1
==================================================

When:

i = 0
j = 0


Java executes:

result[0][0] = array1[0][0] + array2[0][0];


We know:

array1[0][0] = 1

array2[0][0] = 2


So:

result[0][0] = 1 + 2

result[0][0] = 3


==================================================
EXAMPLE 2
==================================================

When:

i = 0
j = 1


Java executes:

result[0][1] = array1[0][1] + array2[0][1];


Values are:

array1[0][1] = 2

array2[0][1] = 6


So:

result[0][1] = 2 + 6

result[0][1] = 8


==================================================
EXAMPLE 3
==================================================

When:

i = 1
j = 2


Java executes:

result[1][2] = array1[1][2] + array2[1][2];


Values:

array1[1][2] = 2

array2[1][2] = 3


So:

result[1][2] = 2 + 3

result[1][2] = 5


==================================================
COMPLETE FIRST ROW
==================================================

For row 0:


array1:

1 2 1


array2:

2 6 8


Java adds:

1 + 2 = 3

2 + 6 = 8

1 + 8 = 9


So result row 0 becomes:

3 8 9


==================================================
COMPLETE SECOND ROW
==================================================

array1:

9 7 2


array2:

0 1 3


Java adds:

9 + 0 = 9

7 + 1 = 8

2 + 3 = 5


So result row 1 becomes:

9 8 5


==================================================
COMPLETE THIRD ROW
==================================================

array1:

7 6 4


array2:

1 2 4


Java adds:

7 + 1 = 8

6 + 2 = 8

4 + 4 = 8


So result row 2 becomes:

8 8 8


==================================================
STEP 7 — PRINT EACH RESULT VALUE
==================================================

System.out.print(result[i][j] + " ");

This prints the value that was just calculated.


We use:

print()

instead of:

println()

because we want all values in the same row
to appear on the same line.


For example:

3 8 9


instead of:

3
8
9


The:

+ " "

adds one space after each number
so the output is easier to read.


==================================================
STEP 8 — MOVE TO THE NEXT ROW
==================================================

System.out.println();

This line is written AFTER the inner loop.


That means:

Java first finishes printing all columns
of the current row.


Then:

System.out.println();

moves the cursor to the next line.


Example:

Inner loop prints:

3 8 9


Then:

println()

moves to the next line.


Next row prints:

9 8 5


Then next line:

8 8 8


==================================================
WHY IS println() OUTSIDE THE INNER LOOP?
==================================================

If we put:

System.out.println();

inside the inner loop,

Java would move to a new line after every number.


We would get:

3
8
9
9
8
5
8
8
8


But we want rows:

3 8 9
9 8 5
8 8 8


So:

print()

is inside the inner loop.


println()

is after the inner loop.


==================================================
COMPLETE FLOW
==================================================

i = 0
→ row 0


j = 0
→ add [0][0]
→ print 3


j = 1
→ add [0][1]
→ print 8


j = 2
→ add [0][2]
→ print 9


Inner loop finishes.

println()

moves to next line.


----------------------------------

i = 1
→ row 1


j = 0
→ print 9

j = 1
→ print 8

j = 2
→ print 5


Move to next line.


----------------------------------

i = 2
→ row 2


j = 0
→ print 8

j = 1
→ print 8

j = 2
→ print 8


==================================================
FINAL RESULT ARRAY
==================================================

After all calculations:

result =

3 8 9
9 8 5
8 8 8


==================================================
FINAL OUTPUT
==================================================

3 8 9
9 8 5
8 8 8


==================================================
IMPORTANT THINGS TO REMEMBER
==================================================

1. A 2D array uses two indexes:

   array[row][column]


2. i controls the row.


3. j controls the column.


4. array1.length gives the number of rows.


5. array1[i].length gives the number of columns
   in the current row.


6. The same i and j can be used on multiple arrays.


7. This:

   array1[i][j]

   means:

   value from array1 at row i and column j.


8. This:

   array2[i][j]

   means:

   value from array2 at the same position.


9. This:

   result[i][j]

   stores the answer at that same position.


10. The main calculation is:

    result[i][j]
    =
    array1[i][j]
    +
    array2[i][j]


11. print() keeps values on the same line.


12. println() after the inner loop moves to the next row.


==================================================
SIMPLE MEMORY VERSION
==================================================

i → row

j → column


array1[i][j]
+
array2[i][j]

↓

store in

result[i][j]

↓

print result[i][j]


Inner loop finishes one row

↓

println()

↓

move to next row


==================================================
MAIN IDEA OF THIS PROBLEM
==================================================

We are matching the SAME position
from both arrays.


Same row.
Same column.


For example:

array1[2][1]
+
array2[2][1]

↓

store in:

result[2][1]


So the easiest sentence to remember is:

"Same row + same column from both arrays,
add them and store the answer
at the same row and column in result."

*/
