package basics.Arrays.Examples;

public class TwoDimEx31 {

    public static void main(String[] args) {

        int[] [] numbers = {
                {2, 4, 8},
                {6, 9, 3},
                {5, 7, 10}
        };
    int[][] result = new int[3][3];

    for(int i = 0; i < numbers.length; i++) {
        for(int j = 0; j < numbers[i].length; j++) {

            result [i][j] = numbers[i][j]*numbers[i][j];
            System.out.print(result[i][j]+ " ");
        }
        System.out.println();
    }
}
}


/*
ARRAY-08 — Matrix Squaring (Square of each element in a 2D Array)

Given:
int[][] numbers = {
    {2, 4, 8},
    {6, 9, 3},
    {5, 7, 10}
};



EXPLANATION (Detailed & Line-by-Line):

1. Creating the 2D array (numbers)
   int[][] numbers = {
       {2, 4, 8},
       {6, 9, 3},
       {5, 7, 10}
   };

   - This is a **2D array** (array of arrays).
   - It has 3 rows and 3 columns.
   - Each row is itself a 1D array.

2. Creating the result matrix
   int[][] result = new int[3][3];

   - We create a **new** 2D array of size 3x3.
   - This is like making a blank table to store the squared values.

3. Outer loop (Row loop)
   for(int i = 0; i < numbers.length; i++) {

   - i goes from 0 to 2 (0, 1, 2).
   - numbers.length gives us the number of rows (3).
   - This loop runs once for each **row**.
   - First iteration: i = 0
   - Second iteration: i = 1
   - Third iteration: i = 2

4. Inner loop (Column loop)
   for(int j = 0; j < numbers[i].length; j++) {

   - j goes from 0 to 2 (0, 1, 2).
   - numbers[i].length gives us the number of columns in the **current row** (always 3).
   - This loop runs once for each **column** in the current row.
   - So for i=0, it will process all 3 columns.

5. Squaring the element
   result[i][j] = numbers[i][j] * numbers[i][j];

   - We multiply the number by itself.
   - This squares the value (2×2=4, 4×4=16, 8×8=64, etc.).
   - We store the squared value in the new matrix "result".
   - Example:
     i=0, j=0 → result[0][0] = 2*2 = 4
     i=0, j=1 → result[0][1] = 4*4 = 16

6. Printing the result
   System.out.print(result[i][j] + " ");
   System.out.println();

   - After squaring a number, we print it with a space.
   - After printing all columns of a row, we print a new line (println()).

*/