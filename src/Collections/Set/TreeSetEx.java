package Collections.Set;

import java.util.*;

public class TreeSetEx {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(2);
        ts.add(85);
        ts.add(65);
        ts.add(10);   // ignored
        ts.add(5);
        ts.add(85);   // ignored

        ts.first();       // smallest element
        ts.last();        // largest element
        ts.pollFirst();   // removes and returns the smallest
        ts.pollLast();    // removes and returns the largest
        ts.subSet(5, 65); // range view: from 5 (inclusive) to 65 (exclusive)

        ts.remove(85);
        System.out.println(ts.contains(85));

        for (Integer element : ts)
            System.out.println(element);

        System.out.println(ts);   // always sorted

    }
}
