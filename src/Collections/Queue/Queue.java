package Collections.Queue;

import java.util.*;

public class Queue {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(8);
        pq.offer(5);
        pq.offer(1);
        pq.offer(3);

        System.out.println(pq.isEmpty());
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);


    }
}


/*
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(8);
        pq.offer(5);
        pq.offer(1);
        pq.offer(3);

        System.out.println(pq);

        while (!pq.isEmpty()) {
    System.out.println(pq.poll());

    Now the largest number = highest priority

    A Comparator allows us to define a custom ordering for elements.

By default, a PriorityQueue<Integer> gives the smallest number the highest priority.
If we want the largest number to have the highest priority, we can use a reverse-order comparator.




 */
