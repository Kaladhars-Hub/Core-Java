// Step 1: Create the Array

package basics.Arrays;

public class Twodimensional {

    public static void main(String[] args) {

        int[] [] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

              //  Step 2: Traverse Using Normal for Loop

        System.out.println("2D Array using Normal for Loop");
                for(int row = 0; row < grid.length; row++) {
                    for (int col = 0; col < grid[row].length; col++) {
                        System.out.print(grid[row][col] + " ");
                    }
                    System.out.println();

                    //Step 3: Traverse Using for-each Loop
                    System.out.println("2D Array using For-Each Loop");

                    for (int[] currentrow : grid) {

                        for (int value : currentrow) {

                            System.out.print(value + " ");
                        }
                        System.out.println();
                    }
                }
        }
    }
