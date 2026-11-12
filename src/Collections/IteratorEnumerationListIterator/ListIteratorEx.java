package Collections.IteratorEnumerationListIterator;

import java.util.*;

public class ListIteratorEx {

    public static void main(String[] args) {

        // STEP 1: Create an ArrayList and add 3 numbers
        ArrayList<Integer> al = new ArrayList<>();

        al.add(5);
        al.add(85);
        al.add(78);

        // Current list: [5, 85, 78]
        System.out.println("Original List: " + al);


        // STEP 2: Create a ListIterator
        // Initially, the iterator is before the first element.
        //
        // Iterator position:
        //          |
        // List:   [5, 85, 78]
        //
        ListIterator<Integer> li = al.listIterator();


        // STEP 3: FORWARD TRAVERSAL
        // hasNext() checks whether a next element exists.
        // next() returns that element and moves forward.

        System.out.println("\nForward Traversal:");

        while (li.hasNext()) {
            System.out.println(li.next());
        }

        // Output: 5, 85, 78
        //
        // Now the iterator has reached the end of the list.
        // There are no more elements in the forward direction.


        // STEP 4: ADD A NEW ELEMENT
        // add(45) inserts 45 at the current iterator position.
        // Since the iterator is at the end, 45 is added at the end.

        li.add(45);

        // List becomes: [5, 85, 78, 45]
        System.out.println("\nAfter adding 45: " + al);


        // STEP 5: BACKWARD TRAVERSAL
        // hasPrevious() checks whether an element exists behind
        // the current iterator position.
        // previous() returns that element and moves backward.

        System.out.println("\nBackward Traversal:");

        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

        // Output: 45, 78, 85, 5
        //
        // Now the iterator has moved back to the beginning.
        // The last element returned by previous() was 5.


        // STEP 6: REMOVE AN ELEMENT
        // next() moves forward and returns 5.
        // remove() removes that returned element from the list.

        li.next();   // Returns 5 and moves past it
        li.remove(); // Removes 5 from the list

        // List becomes: [85, 78, 45]
        System.out.println("\nAfter removing 5: " + al);


        // STEP 7: REPLACE AN ELEMENT USING set()
        // Create a fresh iterator at the beginning of the list.
        // Search for 85 and replace it with 100.

        li = al.listIterator();

        while (li.hasNext()) {

            int n = li.next(); // Get the next element

            if (n == 85) {
                li.set(100);   // Replace 85 with 100
            }
        }

        // List becomes: [100, 78, 45]
        System.out.println("\nAfter replacing 85 with 100: " + al);


        // STEP 8: CHECK INDEX POSITIONS
        // Create a fresh iterator at the beginning.
        // Index positions start from 0.

        li = al.listIterator();

        // Index of the next element that next() would return
        System.out.println("\nNext Index: " + li.nextIndex());
        // Output: 0

        li.next(); // Returns 100; iterator moves past index 0

        // The next element is now at index 1
        System.out.println("Next Index: " + li.nextIndex());
        // Output: 1

        // The previous element is at index 0
        System.out.println("Previous Index: " + li.previousIndex());
        // Output: 0


        // STEP 9: CHECK WHETHER ELEMENTS EXIST
        // hasNext() checks for an element ahead.
        System.out.println("\nhasNext(): " + li.hasNext());
        // Output: true, because more elements exist.

        // hasPrevious() checks for an element behind.
        System.out.println("hasPrevious(): " + li.hasPrevious());
        // Output: true, because 100 is behind the iterator.


        // STEP 10: PRINT THE FINAL LIST
        System.out.println("\nFinal List: " + al);

        // Final output: [100, 78, 45]
    }
}
