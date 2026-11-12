//Step 1: Create and Print the Array

package basics.Arrays;

import java.util.Arrays;

public class Onedimensional {
    public static void main(String[] args) {

        // Create a 1D array
        int[] marks = {90, 85, 76, 88, 95};

        // Print the complete array
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(marks));


// Step 2: Traverse Using Normal for Loop

        System.out.println("Using Normal for Loop");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Index " + i + " = " + marks[i]);

// Step 3: Traverse Using for-each Loop

            System.out.println("Using For-Each Loop:");

           for (int Value : marks) {
               System.out.println(Value);
           }

        }
    }
}