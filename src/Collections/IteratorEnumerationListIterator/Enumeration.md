Java Enumeration

Definition: An Enumeration is a Java interface used to access elements of a collection one at a time. It was introduced in Java 1.0 and is mainly associated with legacy collection classes such as Vector, Stack, Hashtable, Dictionary, and Properties.

Unlike an Iterator, an Enumeration supports only forward traversal and does not provide a method to remove elements during traversal.

1. Why Do We Need an Enumeration?

Consider a Vector of fruit names:

java
Vector<String> fruits = new Vector<>();

fruits.add("Banana");
fruits.add("Cherry");
fruits.add("Mango");
fruits.add("Apple");


We can traverse this collection using loops, but an Enumeration provides a standard way to access its elements one by one.

Key advantages:

Access elements one at a time without managing an index.
Traverse legacy collection classes such as Vector and Stack.
Check whether more elements are available before accessing them.
Track traversal progress internally.
Use a simple interface for forward-only traversal.
2. Important Enumeration Methods
   Method	Description
   hasMoreElements()	Checks whether another element is available. Returns true or false.
   nextElement()	Returns the next element and advances the enumeration.

Important: Enumeration does not provide methods such as remove() or hasPrevious().

3. How to Use an Enumeration
   Example Program
   java
   import java.util.*;

public class Main {
public static void main(String[] args) {

        // Create a Vector to store fruit names
        Vector<String> fruits = new Vector<>();

        // Add elements to the Vector
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Apple");

        // Create an Enumeration to traverse the Vector
        Enumeration<String> e = fruits.elements();

        // Check whether more elements are available
        while (e.hasMoreElements()) {

            // Retrieve and print the next element
            System.out.println(e.nextElement());
        }
    }
}

Output
text
Banana
Cherry
Mango
Apple

How Does It Work?

Step 1: Create the enumeration

java
Enumeration<String> e = fruits.elements();


Creates an Enumeration for the Vector. Initially, it is positioned before the first element.

Step 2: Check for the next element

java
e.hasMoreElements();


Returns true if another element is available; otherwise, returns false.

Step 3: Retrieve the next element

java
e.nextElement();


Returns the next element and advances the enumeration to the next position.

Step 4: Repeat

The loop continues until hasMoreElements() returns false.

4. Enumeration with Hashtable

A Hashtable stores data in key-value pairs. We can use an Enumeration to traverse its values or keys.

Example Program
java
import java.util.*;

public class Main {
public static void main(String[] args) {

        // Create a Hashtable with String keys and Integer values
        Hashtable<String, Integer> ages = new Hashtable<>();

        // Add key-value pairs
        ages.put("India", 500);
        ages.put("Sri Lanka", 600);
        ages.put("London", 100);

        // Create an Enumeration of the values
        Enumeration<Integer> e = ages.elements();

        // Traverse and print the values
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}

Output
text
100
500
600


Note: The output order may vary because Hashtable does not guarantee iteration order.

Important methods:

java
ages.elements();  // Returns an Enumeration of values
ages.keys();      // Returns an Enumeration of keys

5. Enumeration with Properties

Properties is a legacy class commonly used to store configuration information as key-value pairs, usually represented as strings.

Example Program
java
import java.util.*;

public class Main {
public static void main(String[] args) {

        // Create a Properties object
        Properties prop = new Properties();

        // Add configuration properties
        prop.setProperty("url", "localhost");
        prop.setProperty("username", "admin");

        // Create an Enumeration of the property values
        Enumeration<Object> e = prop.elements();

        // Traverse and print the values
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}

Output
text
localhost
admin


Important methods:

java
prop.elements();  // Returns an Enumeration of values
prop.keys();      // Returns an Enumeration of keys


The output order is not guaranteed.

6. Important Rules of Enumeration
   Call hasMoreElements() to check whether another element is available.
   Call nextElement() to retrieve the next element.
   Calling nextElement() when no elements remain throws a NoSuchElementException.
   Enumeration supports only forward traversal.
   Enumeration does not provide a remove() method.
   It is commonly used with legacy collection classes such as Vector, Stack, Hashtable, and Properties.
   elements() returns an enumeration of values for Vector, Hashtable, and Properties.
   Use the appropriate generic type, such as Enumeration<String> or Enumeration<Integer>, to represent the elements being traversed.
7. Difference Between Iterator and Enumeration
   Feature	Iterator	Enumeration
   Introduced	Java 1.2	Java 1.0
   Main methods	hasNext(), next()	hasMoreElements(), nextElement()
   Traversal	Forward	Forward
   Removing elements	Supports remove() when permitted	Does not support removal
   Common usage	Modern collections	Legacy collections
8. Final Summary
   elements() creates an enumeration for traversing elements in supported legacy collections.
   hasMoreElements() checks whether another element is available.
   nextElement() retrieves the next element and advances the enumeration.
   Enumeration is mainly associated with legacy collection classes.
   It provides forward-only traversal and does not support removing elements.

Remember: hasMoreElements() checks, and nextElement() fetches. Enumeration is an older traversal mechanism, while Iterator is generally preferred for modern Java collections.