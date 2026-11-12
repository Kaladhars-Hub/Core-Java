package basics.Arrays.Examples;

public class TwoDimEx33 {

    public static void main(String[] args) {

        int[][] array1 = {
                {1, 2, 1},
                {9, 7, 2},
                {7, 6, 4}
        };
        int[][] array2 = {
                {1, 6, 1},
                {0, 7, 3},
                {1, 6, 4}
        };

        int[][] result = new int[3][3];

        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array1[i].length; j++) {

                if(array1[i][j] == array2[i][j]) {
                    result[i][j] = 1;
                }else {
                    result[i][j] = 0;
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*

ARRAY-33 — Compare Two 2D Arrays and Store 1 or 0

Given:
array1 and array2 are both 3 x 3 arrays.

Goal:
- Compare values at the SAME row and SAME column.
- If both values are equal → store 1 in result.
- If both values are different → store 0 in result.

--------------------------------------------------
1. CREATE THE TWO ARRAYS
--------------------------------------------------

int[][] array1 = {
        {1, 2, 1},
        {9, 7, 2},
        {7, 6, 4}
};

int[][] array2 = {
        {1, 6, 1},
        {0, 7, 3},
        {1, 6, 4}
};

Both arrays have:

3 rows
3 columns


--------------------------------------------------
2. CREATE RESULT ARRAY
--------------------------------------------------

int[][] result = new int[3][3];

This creates an empty 3 x 3 array.

We will store:

1 → if values are equal

0 → if values are different


--------------------------------------------------
3. OUTER LOOP
--------------------------------------------------

for(int i = 0; i < array1.length; i++) {

i controls the ROW.

So:

i = 0 → row 0
i = 1 → row 1
i = 2 → row 2


--------------------------------------------------
4. INNER LOOP
--------------------------------------------------

for(int j = 0; j < array1[i].length; j++) {

j controls the COLUMN inside the current row.

So for each row:

j = 0
j = 1
j = 2


Remember:

i → row
j → column


--------------------------------------------------
5. COMPARE BOTH ARRAYS
--------------------------------------------------

if(array1[i][j] == array2[i][j]) {

This means:

"If the value in array1 at [i][j]
is equal to the value in array2
at the SAME [i][j] position."


If true:

result[i][j] = 1;


If false:

result[i][j] = 0;


--------------------------------------------------
EXAMPLE 1
--------------------------------------------------

i = 0
j = 0

array1[0][0] = 1

array2[0][0] = 1

1 == 1 → true

So:

result[0][0] = 1


--------------------------------------------------
EXAMPLE 2
--------------------------------------------------

i = 0
j = 1

array1[0][1] = 2

array2[0][1] = 6

2 == 6 → false

So:

result[0][1] = 0


--------------------------------------------------
EXAMPLE 3
--------------------------------------------------

i = 1
j = 1

array1[1][1] = 7

array2[1][1] = 7

7 == 7 → true

So:

result[1][1] = 1


--------------------------------------------------
6. PRINT THE RESULT
--------------------------------------------------

System.out.print(result[i][j] + " ");

After Java stores either 1 or 0,
it immediately prints that value.


After the inner loop finishes one row:

System.out.println();

moves printing to the next line.


--------------------------------------------------
FINAL RESULT
--------------------------------------------------

1 0 1
0 1 0
0 1 1


--------------------------------------------------
MAIN IDEA TO REMEMBER
--------------------------------------------------

Use the SAME i and j on both arrays:

array1[i][j]
array2[i][j]

Compare them.

If same:
result[i][j] = 1

If different:
result[i][j] = 0


So:

i → row
j → column

Same position in both arrays
↓
compare values
↓
store 1 or 0 in result

*/