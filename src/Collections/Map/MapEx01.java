package Collections.Map;

import java.util.*;

public class MapEx01 {

    public static void main(String[] args) {

        Map<Integer, String> m = new HashMap<>();

        m.put(101, "Ravi");
        m.put(102, "Priya");
        System.out.println(m.get(102));

        m.put(103, "Arun");

        m.put(103, "Kiran");

        m.remove(101);

        System.out.println(m.size());
    }
}


/*

Employee Directory:

Create a Map that stores employee IDs and names.

1. Add three employees: 101 → Ravi, 102 → Priya, 103 → Arun.
2. Display the name belonging to employee ID 102.
3. Change employee 103's name to "Kiran".
4. Remove employee 101.
5. Display the total number of employees remaining.

Use Map<Integer, String> with Hashtable

 */