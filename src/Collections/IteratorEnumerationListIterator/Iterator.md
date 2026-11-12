Java Iterator

Definition: An Iterator is a Java interface used to access elements of a collection one at a time. 
It also provides a standard way to remove the current element during traversal, if removal is supported.

1. Why Do We Need an Iterator?

Consider a list of student names:


ArrayList<String> students = new ArrayList<>();

students.add("Rahul");
students.add("Priya");
students.add("Amit");
students.add("Sneha");
students.add("Kiran");


We can traverse this list using loops, but an Iterator is especially useful when we need explicit control over traversal, particularly when removing elements while iterating.

Key advantages:

Access elements one by one without managing an index.
Remove the current element during traversal using remove(), when supported.
Traverse different types of collections using a common interface.
Track traversal progress internally.

2. Important Iterator Methods:
 
    Method	               Description

   hasNext()	         Checks whether another element is available. Returns true or false.
   next()	             Returns the next element and advances the iterator.
   remove()	             Removes the last element returned by next(), if supported and permitted.

3. How to Use an Iterator
   Example Program
   java
   import java.util.*;

public class Main {
public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Priya");
        names.add("Amit");

        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);
        }
    }
}

Output
text
Rahul
Priya
Amit

How Does It Work?

Step 1: Create the iterator

Iterator<String> itr = names.iterator();


Creates an iterator for the collection. Initially, it is positioned before the first element.

Step 2: Check for the next element

itr.hasNext()

Returns true if another element is available.

Step 3: Retrieve the next element


String name = itr.next();


Returns the next element and advances the iterator.

Step 4: Repeat

The loop continues until hasNext() returns false.

4. Removing Elements Using an Iterator

One of the most important uses of an iterator is removing elements from a collection during traversal.

❌ Incorrect Approach

for (Integer n : numbers) {
if (n < 10) {
numbers.remove(n);
}
}


Problem: 
Modifying many standard collections directly during a for-each loop can cause a ConcurrentModificationException,
because the collection is modified outside the iterator.

✅ Correct Approach

Iterator<Integer> itr = numbers.iterator();

while (itr.hasNext()) {
Integer n = itr.next();

    if (n < 10) {
        itr.remove();
    }
}


How it works:

hasNext() checks whether another element exists.
next() retrieves the next element.
The condition checks whether the number is less than 10.
remove() removes the element returned by the most recent next() call.
Traversal continues with the remaining elements.

Important: remove() removes the last element returned by next(), not an arbitrary element.

5. Important Rules of Iterator:

   Call next() before calling remove().
   You cannot call remove() twice in succession without another successful next() call.
   The collection must support removal; otherwise, UnsupportedOperationException may occur.
   Avoid modifying the collection independently while iterating, as this may cause ConcurrentModificationException.
   An iterator is generally used for forward traversal.
   Once hasNext() returns false, there are no more elements available in that traversal.

6. Final Summary:

   iterator() creates an iterator for a collection.
   hasNext() checks whether another element is available.
   next() retrieves the next element and advances the iterator.
   remove() removes the last element returned by next(), if supported.
   Remember: The key advantage of an Iterator is that it provides a common way to traverse collections and safely remove the current element through the iterator itself.