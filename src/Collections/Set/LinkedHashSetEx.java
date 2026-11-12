package Collections.Set;

import java.util.*;

public class LinkedHashSetEx {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(10);
        lhs.add(2);
        lhs.add(85);
        lhs.add(65);
        lhs.add(10);   // Duplicate ignored
        lhs.add(5);
        lhs.add(85);   // Duplicate ignored

        lhs.remove(85);

        System.out.println(lhs.contains(85)); // false

        for (Integer element : lhs) {
            System.out.println(element);
        }

        System.out.println(lhs); // [10, 2, 65, 5]
    }
}