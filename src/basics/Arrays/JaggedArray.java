// Step 1: Create the Jagged Array

package basics.Arrays;

public class JaggedArray {
    public static void main(String[] args) {

        int[][] jagged = {
                {10, 20},
                {30, 40, 50},
                {60},
                {70, 80, 90, 100}

        };

        //Step 2: Traverse Using Normal for Loop
        System.out.println("Jagged Array using Normal for Loop");

        for (int row = 0; row < jagged.length; row++) {
            for(int col = 0; col < jagged[row].length; col++) {
                System.out.print(jagged[row][col] + " ");
            }
            System.out.println();

            // Step 3: Traverse Using for-each Loop

            System.out.println("Jagged Array using For-Each Loop");

            for (int[] currentrow : jagged) {
                for (int value : currentrow) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
    }
}
