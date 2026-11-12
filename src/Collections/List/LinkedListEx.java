package Collections.List;

import java.util.*;


public class LinkedListEx {

        public static void main(String[] args) {

            // 1. Create an empty LinkedList
            LinkedList<String> courses = new LinkedList<>();

            // 2. Add elements at the end
            courses.add("Java");
            courses.add("SQL");
            courses.add("HTML");

            System.out.println("Initial List: " + courses);

            // 3. Insert an element at a specific index
            // Existing elements keep their order.
            // Internally, LinkedList updates node connections.
            courses.add(1, "Python");

            System.out.println("After Inserting Python: " + courses);

            // 4. Access an element using its index
            System.out.println("Element at Index 2: " + courses.get(2));

            // 5. Replace an existing element
            // set() changes the value without increasing the size.
            courses.set(3, "Spring Boot");

            System.out.println("After Replacing HTML: " + courses);

            // 6. Check whether an element exists
            System.out.println("Contains SQL: " + courses.contains("SQL"));

            // 7. Find the number of elements
            System.out.println("Size: " + courses.size());

            // 8. Remove an element by its value
            courses.remove("Python");

            System.out.println("After Removing Python: " + courses);

            // 9. Remove an element by its index
            courses.remove(0);

            System.out.println("After Removing Index 0: " + courses);

            // 10. Create an ArrayList with existing data
            ArrayList<String> extraCourses = new ArrayList<>();

            extraCourses.add("Git");
            extraCourses.add("Docker");

            // 11. Add all elements from the ArrayList
            courses.addAll(extraCourses);

            System.out.println("After addAll: " + courses);

            // 12. Add a collection at a specific index
            courses.addAll(1, extraCourses);

            System.out.println("After addAll at Index 1: " + courses);

            // 13. Remove all occurrences of values
            // that are present in extraCourses
            courses.removeAll(extraCourses);

            System.out.println("After removeAll: " + courses);

            // 14. Print elements one by one using for-each
            System.out.println("Courses:");

            for (String course : courses) {
                System.out.println(course);
            }

            // 15. Check whether the LinkedList is empty
            System.out.println("Is Empty: " + courses.isEmpty());

            // 16. Remove all elements
            courses.clear();

            System.out.println("After Clear: " + courses);
            System.out.println("Final Size: " + courses.size());

            // 17. Create a LinkedList using an existing collection
            LinkedList<String> copiedCourses =
                    new LinkedList<>(extraCourses);

            System.out.println("Copied LinkedList: " + copiedCourses);
        }
    }

/*
=======================================================================
              ARRAYLIST vs LINKEDLIST - CORE JAVA (P48)
=======================================================================

1. INTERNAL STRUCTURE
-----------------------------------------------------------------------
ArrayList:
- Uses a resizable array internally.
- Elements are stored in array positions.
- Has an internal capacity that grows when needed.

LinkedList:
- Uses a doubly linked list internally.
- Does not use a backing array.
- Each element is stored inside a separate Node object.
- Each node contains:
      previous | item | next
- Previous points to the previous node.
- Item stores the actual element.
- Next points to the next node.


2. LINKEDLIST NODE STRUCTURE
-----------------------------------------------------------------------
Example:

    null <- [Java] <-> [SQL] <-> [Spring] -> null

- The first node's previous reference is null.
- The last node's next reference is null.
- Middle nodes connect to both previous and next nodes.

An empty LinkedList has:

    size  = 0
    first = null
    last  = null

When adding the first element:
- A new node is created.
- Both first and last point to that node.
- Size becomes 1.

When adding more elements at the end:
- A new node is created.
- The previous last node connects to the new node.
- The last reference changes.
- Size increases by 1.


3. IMPORTANT LINKEDLIST PROPERTIES
-----------------------------------------------------------------------
1. Internal structure     : Doubly linked list
2. Initial size           : 0
3. Initial capacity       : Not applicable
4. Custom initial capacity: Not supported
5. Duplicate elements     : Allowed
6. Null elements          : Allowed
7. Insertion order        : Maintained for normal add()
8. Sorting                : Not automatic
9. Index-based access     : Supported, but slower for distant indexes
10. Synchronization       : Not synchronized by default
11. Dynamic size          : Yes
12. Implements            : List and Deque
13. Traversal             : Forward and backward
14. Node creation         : Nodes are created when elements are added


4. ARRAYLIST vs LINKEDLIST
-----------------------------------------------------------------------
FEATURE                 ARRAYLIST              LINKEDLIST
-----------------------------------------------------------------------
Internal storage        Resizable array        Doubly linked nodes

Default size            0                      0

Initial capacity        No allocated backing   No backing array
                        array until needed
                        (Java 17 default)

Custom capacity         Supported              Not supported

Duplicates              Allowed                Allowed

Null values             Allowed                Allowed

Insertion order         Maintained             Maintained

Automatic sorting       No                     No

Index access            Fast                    Slower for distant
                                               indexes

Add at end              Generally efficient    Efficient

Insert in middle        May shift elements     Finds position and
                                               updates node links

Remove from middle      May shift elements     Finds position and
                                               updates node links

Memory usage            Backing array          Extra node references

Synchronized            No                     No

Implements List         Yes                    Yes

Implements Deque        No                     Yes


5. HOW LINKEDLIST INSERTION WORKS
-----------------------------------------------------------------------
Before:

    A <-> C

Insert B at index 1:

    A <-> B <-> C

Internally:
1. A new node is created for B.
2. B.previous points to A.
3. B.next points to C.
4. A.next is updated to B.
5. C.previous is updated to B.
6. Size increases by 1.

Unlike ArrayList, LinkedList does not shift array elements.


6. HOW LINKEDLIST REMOVAL WORKS
-----------------------------------------------------------------------
Before:

    A <-> B <-> C

Remove B:

    A <-> C

Internally:
1. A.next changes from B to C.
2. C.previous changes from B to A.
3. B is disconnected from the LinkedList.
4. Size decreases by 1.

Important:
- Updating node connections is efficient.
- But finding a node by index or value may take time.
- Therefore, LinkedList is NOT always faster than ArrayList.


7. HOW get(index) WORKS
-----------------------------------------------------------------------
ArrayList:
- Can directly access an element using its index.

LinkedList:
- Starts from the first or last node, whichever is closer.
- Moves through node connections until the index is reached.

Example: size = 10 (indexes 0 to 9)

get(2) -> Starts from first node and moves forward.
get(8) -> Starts from last node and moves backward.

LinkedList supports get(index), but does not provide the same
fast random access as ArrayList.


8. LINKEDLIST CONSTRUCTORS
-----------------------------------------------------------------------
1. Empty LinkedList:

   LinkedList<String> ll = new LinkedList<>();

2. LinkedList with existing collection elements:

   LinkedList<String> ll = new LinkedList<>(al);

   Here, al can be an existing ArrayList<String>.

INVALID:

   LinkedList<String> ll = new LinkedList<>(10);

LinkedList does not support a custom initial capacity.


9. LINKEDLIST REFERENCE TYPES
-----------------------------------------------------------------------
All the following are valid:

LinkedList<String> a = new LinkedList<>();
List<String> b       = new LinkedList<>();
Queue<String> c      = new LinkedList<>();
Deque<String> d      = new LinkedList<>();
Collection<String> e = new LinkedList<>();
Iterable<String> f   = new LinkedList<>();

Important:
- The reference type on the LEFT determines which methods
  can be accessed through that variable.
- List reference -> List methods.
- Queue reference -> Queue methods.
- Deque reference -> Deque methods.
- LinkedList reference -> Public LinkedList methods.

Queue and Deque methods will be learned later.


10. COMMON METHODS
-----------------------------------------------------------------------
LinkedList supports familiar List methods:

add()
add(index, value)
addAll()
get()
set()
remove()
removeAll()
contains()
size()
isEmpty()
clear()

These methods were already practiced with ArrayList and Vector.


11. WHEN SHOULD WE USE EACH?
-----------------------------------------------------------------------
Prefer ArrayList:
- When we frequently access elements using indexes.
- For ordinary List operations.
- When we want a general-purpose List implementation.

Consider LinkedList:
- When frequently adding/removing elements at the beginning
  or end of the list.
- When Queue/Deque behavior is useful.
- When we already have a node position through an iterator
  and need to insert/remove there.

Do not assume LinkedList is faster for every insertion
or deletion. Finding the position can take time.


12. IMPORTANT FRESHER INTERVIEW POINTS
-----------------------------------------------------------------------
Q1. What is the main difference?
    ArrayList uses a resizable array.
    LinkedList uses doubly linked nodes.

Q2. Which is faster for get(index)?
    Generally ArrayList.

Q3. Does LinkedList support duplicates and null?
    Yes, both.

Q4. Is LinkedList synchronized?
    No, not by default.

Q5. Does LinkedList have a capacity?
    No backing-array capacity.

Q6. What is a doubly linked list?
    A list where nodes contain references to both
    previous and next nodes.

Q7. Is LinkedList always faster for insertion/deletion?
    No. Locating the node may take additional time.

Q8. What interfaces does LinkedList implement?
    List and Deque (and their parent interfaces).

=======================================================================
QUICK REVISION

ArrayList  = Resizable array + Fast index access.
LinkedList = Doubly linked nodes + Forward/backward connections.

Both allow duplicates, null values, and indexed operations.
Neither is synchronized by default.

For most ordinary List use cases, prefer ArrayList.
=======================================================================
*/