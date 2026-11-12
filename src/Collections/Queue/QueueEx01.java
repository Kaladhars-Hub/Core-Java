package Collections.Queue;

import java.util.*;

public class QueueEx01 {

    public static void main(String[] args) {

        ArrayDeque<String> ad = new ArrayDeque<>();

        ad.offerFirst("year");
        ad.offerLast("cherry");
        ad.offerFirst("zandubalm");
        ad.offerLast("vicks");
        ad.pollFirst();
        ad.pollLast();

        System.out.println(ad);

    }
}


       /*
        ================================================================================
                                 JAVA QUEUE INTERFACE METHODS
        ================================================================================

        | S.No | Method                  | Return Type | Description
        |------|-------------------------|-------------|----------------------------------
        |  1   | add(E e)                | boolean     | Inserts an element into the queue.
        |  2   | offer(E e)              | boolean     | Inserts an element if possible.
        |  3   | remove()                | E           | Removes and returns the head.
        |  4   | poll()                  | E           | Removes and returns the head,
        |      |                         |             | or null if the queue is empty.
        |  5   | element()               | E           | Retrieves the head without
        |      |                         |             | removing it; throws exception
        |      |                         |             | if the queue is empty.
        |  6   | peek()                  | E           | Retrieves the head without
        |      |                         |             | removing it; returns null if
        |      |                         |             | the queue is empty.
        |  7   | size()                  | int         | Returns the number of elements.
        |  8   | isEmpty()               | boolean     | Checks whether the queue is empty.
        |  9   | contains(Object o)       | boolean     | Checks whether an element exists.
        | 10   | iterator()              | Iterator<E> | Returns an iterator over elements.
        | 11   | toArray()                | Object[]    | Converts the queue to an array.
        | 12   | toArray(T[] a)            | T[]         | Converts the queue to a typed array.
        | 13   | clear()                  | void        | Removes all elements.
        | 14   | remove(Object o)          | boolean     | Removes one matching element.
        | 15   | containsAll(Collection)   | boolean     | Checks whether all elements exist.
        | 16   | addAll(Collection)        | boolean     | Adds all elements from a collection.
        | 17   | removeAll(Collection)     | boolean     | Removes elements present in a collection.
        | 18   | retainAll(Collection)     | boolean     | Retains only elements in a collection.
        | 19   | spliterator()             | Spliterator<E> | Creates a spliterator.
        | 20   | stream()                  | Stream<E>   | Returns a sequential stream.
        | 21   | parallelStream()          | Stream<E>   | Returns a possibly parallel stream.
        | 22   | forEach(Consumer)         | void        | Performs an action on each element.

        ================================================================================
        IMPORTANT DIFFERENCE BETWEEN QUEUE METHODS
        ================================================================================

        | Operation | Throws Exception When Empty | Special Return Value |
        |-----------|------------------------------|----------------------|
        | add(e)    | Yes, if insertion fails      | true on success      |
        | offer(e)  | No, if insertion fails       | false                |
        | remove()  | Yes                          | N/A                  |
        | poll()    | No                           | null                 |
        | element() | Yes                          | N/A                  |
        | peek()    | No                           | null                 |

        ================================================================================
        EXAMPLE
        ================================================================================

        Queue<Integer> q = new LinkedList<>();

        q.add(10);       // Inserts 10
        q.offer(20);     // Inserts 20
        q.add(30);       // Inserts 30

        q.peek();        // Returns 10 without removing it
        q.element();     // Returns 10 without removing it
        q.poll();        // Removes and returns 10
        q.remove();      // Removes and returns 20

        q.size();        // Returns 1
        q.isEmpty();     // Returns false
        q.contains(30);  // Returns true

        ================================================================================
        NOTES
        ================================================================================

        1. Queue is an interface in java.util.
        2. Queue generally follows FIFO (First In, First Out).
        3. PriorityQueue may process elements according to priority rather
           than insertion order.
        4. add(), offer(), remove(), poll(), element(), and peek() are the
           six core Queue-specific methods.
        5. Methods such as size(), clear(), stream(), and contains() are
           inherited from Collection or its parent interfaces.
        6. null handling depends on the implementation. LinkedList permits null,
           while PriorityQueue and ArrayDeque do not.
        7. E represents the element type.

        ================================================================================
        */
