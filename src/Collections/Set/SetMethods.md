/*
=====================================================================
A) COMMON METHODS (available in ALL Sets: HashSet, LinkedHashSet, TreeSet)
=====================================================================
| Method                  | What it does                                   | Returns   |
|-------------------------|------------------------------------------------|-----------|
| add(e)                  | Adds element if not already present            | boolean   |
| addAll(collection)      | Adds all elements (UNION of two sets)          | boolean   |
| remove(e)               | Removes the given element                      | boolean   |
| removeAll(collection)   | Removes all elements found in the collection   | boolean   |
|                         | (DIFFERENCE of two sets)                       |           |
| retainAll(collection)   | Keeps only common elements                     | boolean   |
|                         | (INTERSECTION of two sets)                     |           |
| contains(e)             | Checks if the element exists                   | boolean   |
| containsAll(collection) | Checks if ALL elements exist                   | boolean   |
|                         | (SUBSET check)                                 |           |
| size()                  | Number of elements                             | int       |
| isEmpty()               | Checks if the set is empty                     | boolean   |
| clear()                 | Removes all elements                           | void      |
| iterator()              | Gives an Iterator to loop and safely remove    | Iterator  |
| toArray()               | Converts the set to an array                   | Object[]  |
| removeIf(condition)     | Removes elements matching a condition          | boolean   |
| forEach(action)         | Loops using lambda                             | void      |
| stream()                | Gives a stream for filtering, mapping, etc.    | Stream    |

=====================================================================
B) TreeSet-ONLY METHODS (navigation and range methods)
=====================================================================
| Method           | What it does                                       |
|------------------|----------------------------------------------------|
| first()          | Smallest element                                   |
| last()           | Largest element                                    |
| pollFirst()      | Removes and returns the smallest                   |
| pollLast()       | Removes and returns the largest                    |
| lower(e)         | Greatest element STRICTLY LESS than e              |
| floor(e)         | Greatest element LESS THAN OR EQUAL to e           |
| ceiling(e)       | Smallest element GREATER THAN OR EQUAL to e        |
| higher(e)        | Smallest element STRICTLY GREATER than e           |
| headSet(e)       | View of elements BEFORE e                          |
| tailSet(e)       | View of elements FROM e onwards                    |
| subSet(a, b)     | View from a (inclusive) to b (exclusive)           |
| descendingSet()  | Reverse-order view                                 |
| descendingIterator() | Iterator in reverse order                      |
| comparator()     | Returns the Comparator used (null if natural order)|

=====================================================================
C) EXTRA THINGS WORTH KNOWING
=====================================================================
| Feature                    | What it means                                  |
|----------------------------|------------------------------------------------|
| Set.of(1, 2, 3)            | Creates an IMMUTABLE set (cannot add/remove,   |
|                            | no nulls, no duplicates allowed)               |
| Set.copyOf(collection)     | Immutable copy of another collection           |
| new HashSet<>(list)        | Quick way to REMOVE DUPLICATES from a list     |
| new HashSet<>(set1)        | Creates a copy of another set                  |
| new HashSet<>(100)         | Sets a custom initial capacity                 |
| Collections.unmodifiableSet| Read-only wrapper over a set                   |
| Collections.synchronizedSet| Thread-safe wrapper (Sets are NOT thread-safe  |
|                            | by default)                                    |
| ConcurrentSkipListSet      | Thread-safe sorted set                         |

=====================================================================
D) JAVA 21+ (LinkedHashSet and TreeSet)
=====================================================================
| getFirst() / getLast()       | Read first / last element                  |
| addFirst() / addLast()       | Add at the start / end (LinkedHashSet)     |
| removeFirst() / removeLast() | Remove first / last element                |
| reversed()                   | Reverse-order view                         |
*/