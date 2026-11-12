package Collections.IteratorEnumerationListIterator;

import java.util.*;

public class EnumerationEx {

    public static void main(String[] args) {
        // =====================================================
        // 1. ENUMERATION WITH VECTOR
        // =====================================================

        // Vector is a legacy collection class introduced in Java 1.0.
        // It stores elements and allows us to access them sequentially.
        Vector<String> v = new Vector<>();

        // Adding elements to the Vector
        v.add("Banana");
        v.add("Cherry");
        v.add("Mango");
        v.add("Apple");

        // elements() returns an Enumeration to iterate through the Vector.
        Enumeration<String> e = v.elements();

        // hasMoreElements() checks whether another element is available.
        // nextElement() retrieves the next element.
        System.out.println("Elements in Vector:");

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }


        // =====================================================
        // 2. ENUMERATION WITH HASHTABLE
        // =====================================================

        // Hashtable stores data in key-value pairs.
        // Here, String is the key type and Integer is the value type.
        Hashtable<String, Integer> ages = new Hashtable<>();

        // Adding key-value pairs to the Hashtable
        ages.put("India", 500);
        ages.put("Sri Lanka", 600);
        ages.put("London", 100);

        // elements() returns an Enumeration of VALUES, not keys.
        Enumeration<Integer> e2 = ages.elements();

        System.out.println("\nValues in Hashtable:");

        // Iterate through the values stored in the Hashtable.
        while (e2.hasMoreElements()) {
            System.out.println(e2.nextElement());
        }


        // =====================================================
        // 3. ENUMERATION WITH PROPERTIES
        // =====================================================

        // Properties is a legacy class used to store configuration
        // information as key-value pairs, typically as Strings.
        Properties prop = new Properties();

        // Adding properties using setProperty()
        prop.setProperty("url", "localhost");
        prop.setProperty("username", "admin");

        // elements() returns an Enumeration of property VALUES.
        Enumeration<Object> e3 = prop.elements();

        System.out.println("\nValues in Properties:");

        // Iterate through the property values.
        while (e3.hasMoreElements()) {
            System.out.println(e3.nextElement());

        }
    }
}