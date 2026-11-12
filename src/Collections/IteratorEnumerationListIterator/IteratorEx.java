package Collections.IteratorEnumerationListIterator;

import java.util.*;

public class IteratorEx {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Rahul");
        al.add("Priya");
        al.add("Amit");

        Iterator<String> itr = al.iterator();

        while(itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);

            itr.remove();
            System.out.println(al);

        }

    }
}

/*

->How does remove() work?

     itr.hasNext() checks whether another element exists.

     itr.next() retrieves the next element.

     itr.remove() removes the element most recently returned by next().

            For example:

            String name = itr.next();  // Gets "Rahul"
            itr.remove();              // Removes "Rahul" from ArrayList

The remove() method does not return the removed element.
That's why you must get the element using next() first.

*/

/*
If you want to remove a specific element while iterating:

while (itr.hasNext()) {
    String name = itr.next();

    if (name.equals("Priya")) {
        itr.remove();
    }
}

System.out.println(al);

Important:

Always call itr.next() before itr.remove().
Calling remove() without a preceding next(),
or calling it twice for the same element,
throws an IllegalStateException.

 */