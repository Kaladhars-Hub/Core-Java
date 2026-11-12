package basics.Arrays.Examples;

public class SingleDimEx16 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
            System.out.print("Reversed array: ");
        for(int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}



/*

### ARRAY-16 — Reverse an Array

Given:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

### Goal

Create the reversed order:

```text
50 40 30 20 10
```


 */
    /*
     * ============================================================
     * 1. CREATING THE ARRAY
     * ============================================================
     *
     * int[] means:
     * "I am creating an array that stores integer values."
     *
     * numbers is the name of our array.
     *
     * The values inside { } are stored in the array.
     *
     * int[] numbers = {10, 20, 30, 40, 50};
     *
     * The array looks like this:
     *
     *       10   20   30   40   50
     *        ↑    ↑    ↑    ↑    ↑
     * index: 0    1    2    3    4
     *
     * IMPORTANT:
     * Array indexing always starts from 0.
     *
     * Therefore:
     * numbers[0] = 10
     * numbers[1] = 20
     * numbers[2] = 30
     * numbers[3] = 40
     * numbers[4] = 50
     */

   // int[] numbers = {10, 20, 30, 40, 50};


    /*
     * ============================================================
     * 2. WHY DO WE WRITE System.out.print()?
     * ============================================================
     *
     * System.out.print() is used to DISPLAY something on the
     * console/output screen.
     *
     * If we don't write System.out.print(), the program may perform
     * the loop, but we won't see the numbers being displayed.
     *
     * Here we are displaying the message:
     *
     *     Reversed array:
     *
     * We use print() instead of println() because we want the
     * numbers to appear on the SAME LINE after this message.
     *
     * print()     -> stays on the same line
     * println()   -> moves to the next line after printing
     */

   // System.out.print("Reversed array: ");


    /*
     * ============================================================
     * 3. THE FOR LOOP
     * ============================================================
     *
     * for(int i = numbers.length - 1; i >= 0; i--)
     *
     * A for loop has 3 main parts:
     *
     *     START       CONDITION       CHANGE
     *       ↓             ↓             ↓
     *     int i = 4     i >= 0         i--
     *
     *
     * ============================================================
     * PART 1: int i = numbers.length - 1
     * ============================================================
     *
     * We know:
     *
     *     numbers.length
     *
     * means the TOTAL NUMBER OF ELEMENTS in the array.
     *
     * Our array has:
     *
     *     10, 20, 30, 40, 50
     *
     * So:
     *
     *     numbers.length = 5
     *
     * BUT array indexes start from 0:
     *
     *     index:  0   1   2   3   4
     *             ↑           ↑
     *           first       last
     *
     * Therefore, the last index is:
     *
     *     numbers.length - 1
     *
     *     5 - 1
     *     = 4
     *
     * So:
     *
     *     int i = numbers.length - 1
     *
     * means:
     *
     *     int i = 4;
     *
     *
     * EASY WAY TO REMEMBER:
     *
     *     numbers.length - 1
     *
     * = "Give me the LAST INDEX."
     *
     * This is because:
     *
     *     length = number of elements
     *     length - 1 = last index
     */


    /*
     * ============================================================
     * PART 2: i >= 0
     * ============================================================
     *
     * This means:
     *
     * "Keep running the loop while i is greater than or equal to 0."
     *
     * Why 0?
     *
     * Because 0 is the FIRST index of an array.
     *
     * Our indexes are:
     *
     *     0   1   2   3   4
     *
     * We want to go backward:
     *
     *     4 → 3 → 2 → 1 → 0
     *
     * Once i becomes -1, we stop.
     *
     * We cannot use:
     *
     *     numbers[-1]
     *
     * because -1 is not a valid array index.
     */


    /*
     * ============================================================
     * PART 3: i--
     * ============================================================
     *
     * i-- means:
     *
     *     decrease i by 1.
     *
     * So i changes like this:
     *
     *     4 → 3 → 2 → 1 → 0
     *
     * This is what allows us to move BACKWARD through the array.
     *
     * You can think:
     *
     *     i++  = move forward
     *     i--  = move backward
     */


    //for(int i = numbers.length - 1; i >= 0; i--) {


        /*
         * ========================================================
         * 4. numbers[i]
         * ========================================================
         *
         * numbers[i] means:
         *
         * "Give me the value stored at index i."
         *
         * First time:
         *
         *     i = 4
         *     numbers[4] = 50
         *
         * Second time:
         *
         *     i = 3
         *     numbers[3] = 40
         *
         * Third time:
         *
         *     i = 2
         *     numbers[2] = 30
         *
         * Fourth time:
         *
         *     i = 1
         *     numbers[1] = 20
         *
         * Fifth time:
         *
         *     i = 0
         *     numbers[0] = 10
         *
         *
         * Therefore the values are accessed in this order:
         *
         *     50 → 40 → 30 → 20 → 10
         *
         *
         * ========================================================
         * 5. WHY System.out.print(numbers[i] + " ")?
         * ========================================================
         *
         * We need System.out.print() because we want to SHOW
         * each value on the console.
         *
         * numbers[i]
         *     ↓
         * gets the current value.
         *
         * + " "
         *     ↓
         * adds a space after the number.
         *
         * So:
         *
         *     System.out.print(numbers[i] + " ");
         *
         * prints:
         *
         *     50 40 30 20 10
         *
         * If we didn't use System.out.print(), the values would
         * not be displayed to us.
         */

      //  System.out.print(numbers[i] + " ");