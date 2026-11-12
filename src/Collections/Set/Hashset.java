package Collections.Set;

import java.util.*;

public class Hashset {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(2);
        hs.add(85);
        hs.add(65);
        hs.add(10);   // duplicate, ignored
        hs.add(5);
        hs.add(85);   // duplicate, ignored

        hs.remove(85);                        // pass data, not index

        System.out.println(hs.contains(85));  // false

        for (Integer element : hs)
            System.out.println(element);

        System.out.println(hs);
    }
// Default initial capacity = 16 (load factor 0.75)
}
