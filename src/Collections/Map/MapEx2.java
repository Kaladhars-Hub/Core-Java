package Collections.Map;

import java.util.*;

public class MapEx2 {

    public static void main(String[] args) {

        Map<Integer, String> m = new HashMap<>();

        m.put(101, "Ravi");
        m.put(102, "Priya");
        m.put(103, "Arun");

        Set<Map.Entry<Integer, String>> entries = m.entrySet();

        for(Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " >>>>> " + entry.getValue());

        }
    }
}



/*

A. Retrieve all keys — keySet() :-

Your notes contained m.keys(), but the correct Map interface method is keySet().

Set<Integer> keys = m.keySet();

for (Integer key : keys) {
    System.out.println(key);
}


keySet() returns a Set containing all the keys.

What is Set? A Set is a collection that doesn't allow duplicate elements. It is not the same as a List. You'll learn more about Set in its own lesson.

B. Retrieve all values — values()

Collection<String> values = m.values();

for (String value : values) {
    System.out.println(value);
}


Why Collection<String> instead of Set<String>?

Because different keys can have the same value.

For example:
m.put(101, "Delhi");
m.put(102, "Delhi");


This is valid. Only the keys must be unique.

C. Retrieve all keys with their values :-

You asked how to get every value using its key.

Set<Integer> keys = m.keySet();

for (Integer key : keys) {
    System.out.println(key + " >>> " + m.get(key));
}


Understand this line:

m.get(key)


On each repetition, key holds a different key from the Map. m.get(key) retrieves the value belonging to that key.

 */

/*
+---------------------------+------------------------------------------+
| Method                    | Purpose                                  |
+---------------------------+------------------------------------------+
| put(key, value)            | Add or update an entry                   |
| get(key)                   | Retrieve a value using its key           |
| remove(key)                | Delete an entry                          |
| containsKey(key)           | Check whether a key exists               |
| containsValue(value)       | Check whether a value exists             |
| keySet()                   | Get all keys                             |
| values()                   | Get all values                           |
| entrySet()                 | Get all key-value entries                |
| putIfAbsent(key, value)    | Insert if key has no associated value    |
| replace(key, value)        | Update an existing entry                 |
| size()                     | Count the entries                        |
| clear()                    | Remove all entries                       |
+---------------------------+------------------------------------------+
*/