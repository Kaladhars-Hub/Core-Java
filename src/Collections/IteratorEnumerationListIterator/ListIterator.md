
/*
================================================================================
                              JAVA LISTITERATOR
================================================================================

1. WHAT IS A LISTITERATOR?
--------------------------

ListIterator is a Java interface used to access elements of a List one by one.

It allows us to:
1. Move forward through the list.
2. Move backward through the list.
3. Add new elements during traversal.
4. Remove elements during traversal.
5. Replace existing elements during traversal.
6. Access the indexes of the next and previous elements.

ListIterator can be used with List implementations such as ArrayList
and LinkedList.

Example:

    ArrayList<Integer> al = new ArrayList<>();

    al.add(5);
    al.add(85);
    al.add(78);

    ListIterator<Integer> li = al.listIterator();


2. WHY DO WE NEED A LISTITERATOR?
---------------------------------

Consider the list:

    [5, 85, 78]

Suppose we want to:
- Read all elements from left to right.
- Read all elements from right to left.
- Replace 85 with 100.
- Add a new element during traversal.
- Remove an element during traversal.

A ListIterator provides methods to perform these operations conveniently.

Unlike a normal Iterator, ListIterator supports both forward and
backward traversal and also provides add() and set() methods.


3. IMPORTANT LISTITERATOR METHODS
---------------------------------

METHOD: hasNext()
-----------------
Checks whether another element is available in the forward direction.

Returns true if another element exists.
Returns false if no next element exists.

Example:

    if (li.hasNext()) {
        System.out.println(li.next());
    }


METHOD: next()
--------------
Returns the next element and moves the iterator forward.

Example:

    System.out.println(li.next());

If the list is [5, 85, 78], repeated calls return:

    5
    85
    78

Calling next() when no next element exists throws
NoSuchElementException.


METHOD: hasPrevious()
---------------------
Checks whether an element is available in the backward direction.

Returns true if a previous element exists.
Returns false if no previous element exists.

Example:

    if (li.hasPrevious()) {
        System.out.println(li.previous());
    }


METHOD: previous()
------------------
Returns the previous element and moves the iterator backward.

Important:
If the iterator is at the end of [5, 85, 78],
previous() returns 78 first, then 85, then 5.


METHOD: add(element)
--------------------
Inserts a new element at the iterator's current position.

Example:

    li.add(45);

If the iterator is at the end of the list:

    Before: [5, 85, 78]
    After:  [5, 85, 78, 45]

Important:
add() does not replace the last returned element.
It inserts a new element at the current iterator position.


METHOD: remove()
----------------
Removes the last element returned by next() or previous().

Example:

    int n = li.next();
    li.remove();

If next() returned 5, remove() removes 5.

Important rules:
- Call next() or previous() successfully before remove().
- You cannot call remove() twice in succession without another
successful next() or previous() call.
- The list must support removal.


METHOD: set(element)
--------------------
Replaces the last element returned by next() or previous().

Example:

    int n = li.next();

    if (n == 85) {
        li.set(100);
    }

Before: [5, 85, 78]
After:  [5, 100, 78]

Important:
Call next() or previous() successfully before set().
The element returned by that call is the one that gets replaced.


METHOD: nextIndex()
-------------------
Returns the index of the element that would be returned by next().

Example:

    System.out.println(li.nextIndex());

If the iterator is at the beginning of the list,
nextIndex() returns 0.


METHOD: previousIndex()
-----------------------
Returns the index of the element that would be returned by previous().

Example:

    System.out.println(li.previousIndex());

At the beginning of a list, previousIndex() returns -1
because no previous element exists.


4. HOW DOES LISTITERATOR MOVE?
------------------------------

Consider this list:

    [5, 85, 78]

Initially, the iterator is before the first element:

    Iterator position:
          |
    List: [5, 85, 78]

After calling next(), it returns 5 and moves past 5:

    List: [5, |, 85, 78]

After calling next() again, it returns 85:

    List: [5, 85, |, 78]

After calling next() again, it returns 78:

    List: [5, 85, 78, |]

The iterator has now reached the end.

If we call previous(), it returns 78 and moves backward:

    List: [5, 85, |, 78]

Remember:
next()     = Move forward
previous() = Move backward

The iterator position is between elements, not directly on an element.


5. EXAMPLE: FORWARD TRAVERSAL
-----------------------------

    ArrayList<Integer> al =
        new ArrayList<>(Arrays.asList(5, 85, 78));

    ListIterator<Integer> li = al.listIterator();

    while (li.hasNext()) {
        System.out.println(li.next());
    }

Output:

    5
    85
    78

Explanation:
1. hasNext() checks whether another element exists.
2. next() returns the element and moves forward.
3. The loop ends when hasNext() returns false.


6. EXAMPLE: BACKWARD TRAVERSAL
------------------------------

    ArrayList<Integer> al =
        new ArrayList<>(Arrays.asList(5, 85, 78));

    ListIterator<Integer> li = al.listIterator();

    // First move to the end of the list.
    while (li.hasNext()) {
        li.next();
    }

    // Now move backward.
    while (li.hasPrevious()) {
        System.out.println(li.previous());
    }

Output:

    78
    85
    5

Explanation:
The iterator starts at the beginning.
The first loop moves it to the end.
The second loop moves it backward.

Important:
Calling previous() immediately after listIterator() returns
no element because the iterator initially starts at the beginning.


7. EXAMPLE: ADD AN ELEMENT
--------------------------

    ArrayList<Integer> al =
        new ArrayList<>(Arrays.asList(5, 85, 78));

    ListIterator<Integer> li = al.listIterator();

    while (li.hasNext()) {
        li.next();
    }

    li.add(45);

    System.out.println(al);

Output:

    [5, 85, 78, 45]

Explanation:
The first loop moves the iterator to the end.
add(45) inserts 45 at that position.


8. EXAMPLE: REMOVE AN ELEMENT
-----------------------------

    ArrayList<Integer> al =
        new ArrayList<>(Arrays.asList(5, 85, 78));

    ListIterator<Integer> li = al.listIterator();

    while (li.hasNext()) {
        int n = li.next();

        if (n == 85) {
            li.remove();
        }
    }

    System.out.println(al);

Output:

    [5, 78]

Explanation:
next() returns each element.
When the returned element is 85, remove() removes it.
The remaining elements are traversed normally.

Important:
Use the iterator's remove() method instead of directly modifying
a typical ArrayList inside the traversal loop.


9. EXAMPLE: REPLACE AN ELEMENT
------------------------------

    ArrayList<Integer> al =
        new ArrayList<>(Arrays.asList(5, 85, 78));

    ListIterator<Integer> li = al.listIterator();

    while (li.hasNext()) {
        int n = li.next();

        if (n == 85) {
            li.set(100);
        }
    }

    System.out.println(al);

Output:

    [5, 100, 78]

Explanation:
When next() returns 85, set(100) replaces it with 100.
The list is updated without inserting an extra element.


10. WHY NOT USE A NORMAL FOR LOOP?
----------------------------------

Example:

    ArrayList<Integer> al =
        new ArrayList<>(Arrays.asList(5, 85, 78));

    for (int i = 0; i < al.size(); i++) {
        System.out.println(al.get(i));
    }

Output:

    5
    85
    78

Advantages of a normal for loop:
- Easy to access elements using indexes.
- Useful when the index is important.
- Useful when we need to move through indexes manually.

Limitations compared with ListIterator:
- There is no built-in previous() method.
- We must manage indexes ourselves to move backward.
- Adding or removing elements may require careful index
adjustment to avoid skipping elements or accessing the wrong
position.
- It does not provide ListIterator's set() and add() operations.

Important:
A normal for loop CAN add, remove, or replace elements.
However, we must handle the indexes and list modifications
ourselves. ListIterator provides dedicated methods for these tasks.


11. WHY NOT USE A FOR-EACH LOOP?
--------------------------------

Example:

    ArrayList<Integer> al =
        new ArrayList<>(Arrays.asList(5, 85, 78));

    for (int n : al) {
        System.out.println(n);
    }

Output:

    5
    85
    78

Advantages:
- Very simple to read.
- Useful when we only want to visit each element.
- No index variable is required.

Limitations compared with ListIterator:
- Cannot directly move backward.
- Does not directly expose the iterator's add() or set() methods.
- Cannot safely remove elements by calling al.remove() during
ordinary ArrayList for-each traversal.

Example of an unsafe approach:

    for (int n : al) {
        if (n < 10) {
            al.remove(Integer.valueOf(n));
        }
    }

This can throw ConcurrentModificationException because the list
is modified directly during traversal.

A safer approach for iterator-based removal is:

    Iterator<Integer> it = al.iterator();

    while (it.hasNext()) {
        int n = it.next();

        if (n < 10) {
            it.remove();
        }
    }

Notice:
Even a normal Iterator can safely remove elements through its
own remove() method, if removal is supported.

    ListIterator is special because it additionally supports
    backward traversal, add(), set(), and index-related methods.


12. COMPARISON: FOR LOOP VS FOR-EACH VS LISTITERATOR
----------------------------------------------------

NORMAL FOR LOOP:
Best when we need indexes or want to access elements by position.

FOR-EACH LOOP:
Best when we only need to read each element simply.

ITERATOR:
Best for forward traversal of a collection and iterator-based
removal, if supported.

LISTITERATOR:
Best when working with a List and needing forward traversal,
backward traversal, insertion, replacement, removal, or indexes.


13. IMPORTANT RULES TO REMEMBER
-------------------------------

    1. ListIterator works with List implementations, such as
       ArrayList and LinkedList.

    2. listIterator() starts before the first element by default.

    3. next() moves forward; previous() moves backward.

    4. remove() removes the last element returned by next() or
       previous(), if removal is supported.

    5. set() replaces the last element returned by next() or
       previous(), if replacement is supported.

    6. add() inserts an element at the current iterator position,
       if insertion is supported.

    7. After add() or remove(), set() cannot be called until
       another successful next() or previous() call.

    8. Avoid directly modifying a list during traversal when using
       its iterator. Use the iterator's own modification methods
       where appropriate.

    9. A ListIterator does not support every possible operation
       on every List implementation. Unsupported operations can
       throw UnsupportedOperationException.

    10. nextIndex() and previousIndex() report positions; they do
        not move the iterator.


14. FINAL SUMMARY
-----------------

    hasNext()       = Check for the next element.
    next()          = Get the next element and move forward.
    hasPrevious()   = Check for the previous element.
    previous()      = Get the previous element and move backward.
    add(element)    = Insert an element at the current position.
    remove()        = Remove the last returned element.
    set(element)    = Replace the last returned element.
    nextIndex()     = Get the next element's index.
    previousIndex() = Get the previous element's index.

FINAL REMEMBERING TRICK:

    FOR LOOP     = Index-based traversal
    FOR-EACH     = Simple element reading
    ITERATOR     = Forward traversal + optional removal
    LISTITERATOR = Forward + Backward + Add + Replace + Remove

The biggest advantage of ListIterator is that it gives us more
control over traversing and modifying a List through one iterator.

================================================================================
*/
