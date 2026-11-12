package basics.Arrays.Examples;

public class TwoDimEx32 {

    public static void main(String[] args) {

        int[][] numbers = {
                {1, 8, 4},
                {9, 7, 2},
                {7, 6, 4}
        };

        int[] [] result = new int[3][3];

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {

                result[i][j] = numbers[j][i];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}


/*
ARRAY-32 — Transpose a 2D Array

Given:

int[][] numbers = {
        {1, 8, 4},
        {9, 7, 2},
        {7, 6, 4}
};

Original array:

1  8  4
9  7  2
7  6  4


Expected transpose:

1  9  7
8  7  6
4  2  4


==================================================
WHAT DOES TRANSPOSE MEAN?
==================================================

Transpose means:

The ROWS of the original array become COLUMNS.

And:

The COLUMNS of the original array become ROWS.


For example:

Original first row:

1  8  4

After transpose, it becomes the first column:

1
8
4


Original first column:

1
9
7

After transpose, it becomes the first row:

1  9  7


So the simple rule is:

[row][column]

becomes:

[column][row]


Example:

numbers[0][1] = 8

After transpose:

8 should appear at:

result[1][0]


==================================================
STEP 1 — ORIGINAL 2D ARRAY
==================================================

int[][] numbers = {
        {1, 8, 4},
        {9, 7, 2},
        {7, 6, 4}
};

This creates a 2D integer array.

Think of it as:

             COLUMN
             0  1  2

ROW 0        1  8  4
ROW 1        9  7  2
ROW 2        7  6  4


So:

numbers[0][0] = 1
numbers[0][1] = 8
numbers[0][2] = 4

numbers[1][0] = 9
numbers[1][1] = 7
numbers[1][2] = 2

numbers[2][0] = 7
numbers[2][1] = 6
numbers[2][2] = 4


Remember:

numbers[row][column]


==================================================
STEP 2 — CREATE RESULT ARRAY
==================================================

int[][] result = new int[3][3];

This creates another 2D array.

It has:

3 rows
3 columns


Initially, because it is an int array,
all positions contain the default value:

0


So initially result looks like:

0  0  0
0  0  0
0  0  0


We will fill this array with the transposed values.


==================================================
STEP 3 — OUTER FOR LOOP
==================================================

for(int i = 0; i < numbers.length; i++) {

Here:

i controls the ROW of the result array.


numbers.length is:

3

because the original array has 3 rows.


So i becomes:

i = 0
i = 1
i = 2


Simple memory:

i → current row


==================================================
STEP 4 — INNER FOR LOOP
==================================================

for(int j = 0; j < numbers[i].length; j++) {

Here:

j controls the COLUMN.


For every row selected by i,
the inner loop goes through every column.


Since every row has 3 columns:

j becomes:

j = 0
j = 1
j = 2


Simple memory:

i → row
j → column


So the loops generate positions like:

[0][0]
[0][1]
[0][2]

then:

[1][0]
[1][1]
[1][2]

then:

[2][0]
[2][1]
[2][2]


==================================================
THE MOST IMPORTANT LINE
==================================================

result[i][j] = numbers[j][i];


This is where the transpose actually happens.


Notice:

LEFT SIDE:

result[i][j]


RIGHT SIDE:

numbers[j][i]


The indexes are reversed on the right side.


Normal order:

[i][j]


Swapped order:

[j][i]


So Java is basically doing:

"Store into result at row i and column j,
but get the value from numbers at row j and column i."


==================================================
WHY DOES SWAPPING i AND j TRANSPOSE?
==================================================

Because:

i normally represents the row

and:

j normally represents the column


But when we read:

numbers[j][i]

we are saying:

Use j as the ROW

and:

Use i as the COLUMN


So the original row and column are exchanged.


That is transpose.


==================================================
FIRST OUTER LOOP
==================================================

At first:

i = 0


Now the inner loop starts.


--------------------------------------------------
j = 0
--------------------------------------------------

result[i][j] = numbers[j][i];

becomes:

result[0][0] = numbers[0][0];


numbers[0][0] = 1


So:

result[0][0] = 1


Result currently:

1  0  0
0  0  0
0  0  0


Then Java prints:

1


--------------------------------------------------
j = 1
--------------------------------------------------

Now:

i = 0
j = 1


This:

result[i][j] = numbers[j][i];


becomes:

result[0][1] = numbers[1][0];


numbers[1][0] = 9


So:

result[0][1] = 9


Result becomes:

1  9  0
0  0  0
0  0  0


Java prints:

9


--------------------------------------------------
j = 2
--------------------------------------------------

Now:

i = 0
j = 2


This becomes:

result[0][2] = numbers[2][0];


numbers[2][0] = 7


So:

result[0][2] = 7


Result becomes:

1  9  7
0  0  0
0  0  0


So the first printed row becomes:

1 9 7


Notice what happened:

Java took the FIRST COLUMN of numbers:

1
9
7

and stored it as the FIRST ROW of result:

1 9 7


That is transpose.


==================================================
SECOND OUTER LOOP
==================================================

Now:

i = 1


The inner loop starts again from:

j = 0


--------------------------------------------------
j = 0
--------------------------------------------------

result[1][0] = numbers[0][1];


numbers[0][1] = 8


So:

result[1][0] = 8


--------------------------------------------------
j = 1
--------------------------------------------------

result[1][1] = numbers[1][1];


numbers[1][1] = 7


So:

result[1][1] = 7


--------------------------------------------------
j = 2
--------------------------------------------------

result[1][2] = numbers[2][1];


numbers[2][1] = 6


So:

result[1][2] = 6


The second row of result becomes:

8 7 6


Again notice:

Java took the SECOND COLUMN of the original array:

8
7
6

and made it the SECOND ROW of result:

8 7 6


==================================================
THIRD OUTER LOOP
==================================================

Now:

i = 2


--------------------------------------------------
j = 0
--------------------------------------------------

result[2][0] = numbers[0][2];

numbers[0][2] = 4

So:

result[2][0] = 4


--------------------------------------------------
j = 1
--------------------------------------------------

result[2][1] = numbers[1][2];

numbers[1][2] = 2

So:

result[2][1] = 2


--------------------------------------------------
j = 2
--------------------------------------------------

result[2][2] = numbers[2][2];

numbers[2][2] = 4

So:

result[2][2] = 4


The third row becomes:

4 2 4


==================================================
FINAL RESULT ARRAY
==================================================

After all loops finish:

result becomes:

1  9  7
8  7  6
4  2  4


This is the transpose of:

1  8  4
9  7  2
7  6  4


==================================================
HOW DOES result STORE THE VALUES?
==================================================

This line:

result[i][j] = numbers[j][i];

does TWO things.


RIGHT SIDE:

numbers[j][i]

means:

"Go to the original array and GET a value."


LEFT SIDE:

result[i][j]

means:

"STORE that value at this position in the new array."


Example:

result[0][1] = numbers[1][0];


Right side:

numbers[1][0] = 9


Then Java stores that 9 into:

result[0][1]


So after that:

result[0][1] = 9


Simple memory:

RIGHT SIDE → READ

LEFT SIDE → STORE


So:

numbers[j][i] → READ from original array

result[i][j] → STORE into new array


==================================================
HOW DO THE FOR LOOPS WORK TOGETHER?
==================================================

Think of it like this:

Outer loop chooses:

Which row of result am I currently filling?


Inner loop chooses:

Which column inside that result row am I filling?


Then this line:

result[i][j] = numbers[j][i];

says:

"To fill this result position,
go to the original array with the indexes reversed."


==================================================
FIRST RESULT ROW
==================================================

When:

i = 0


j changes:

0 → 1 → 2


Java reads:

numbers[0][0]
numbers[1][0]
numbers[2][0]


Notice:

The COLUMN stays 0.

The ROW changes.


So Java gets:

1
9
7


and stores:

result[0][0]
result[0][1]
result[0][2]


Result first row:

1 9 7


==================================================
SECOND RESULT ROW
==================================================

When:

i = 1


Java reads:

numbers[0][1]
numbers[1][1]
numbers[2][1]


Values:

8
7
6


and stores them into:

result[1][0]
result[1][1]
result[1][2]


Result second row:

8 7 6


==================================================
THIRD RESULT ROW
==================================================

When:

i = 2


Java reads:

numbers[0][2]
numbers[1][2]
numbers[2][2]


Values:

4
2
4


and stores them into:

result[2][0]
result[2][1]
result[2][2]


Result third row:

4 2 4


==================================================
PRINTING
==================================================

System.out.print(result[i][j] + " ");

This prints each newly stored value.


The inner loop prints all the values in one row.


Then:

System.out.println();

moves to the next line.


So:

First inner loop prints:

1 9 7


println() moves down.


Second inner loop prints:

8 7 6


println() moves down.


Third inner loop prints:

4 2 4


==================================================
FINAL OUTPUT
==================================================

1 9 7
8 7 6
4 2 4


==================================================
IMPORTANT DIFFERENCE TO REMEMBER
==================================================

Normal copy:

result[i][j] = numbers[i][j];


This keeps the same arrangement.


Transpose:

result[i][j] = numbers[j][i];


This swaps which row and column we READ from.


So:

Original:
numbers[row][column]


Transpose:
numbers[column][row]


==================================================
ANOTHER VALID TRANSPOSE STYLE
==================================================

You may also see:

result[j][i] = numbers[i][j];


This is also transpose.


Your version:

result[i][j] = numbers[j][i];


means:

"Store normally, but read with swapped indexes."


The other version:

result[j][i] = numbers[i][j];


means:

"Read normally, but store with swapped indexes."


For this square 3 × 3 array,
both approaches create the same transposed result.


For now, remember YOUR version:

result[i][j] = numbers[j][i];


==================================================
SIMPLE MEMORY VERSION
==================================================

i → result row

j → result column


Read:

numbers[j][i]


Store:

result[i][j]


So:

READ with indexes swapped

↓

STORE in normal result position

↓

columns of original become rows of result


==================================================
MAIN IDEA
==================================================

Original:

1  8  4
9  7  2
7  6  4


Take column 0:

1
9
7

→ becomes result row 0:

1 9 7


Take column 1:

8
7
6

→ becomes result row 1:

8 7 6


Take column 2:

4
2
4

→ becomes result row 2:

4 2 4


That is what transpose means.
*/
