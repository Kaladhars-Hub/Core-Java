package basics.Strings.Exaamples;

public class StringsEx21 {

    public static void main(String[] args) {

        String name = "Java Programming Language";

        String[] words = name.split(" ");

        String longest = words[0];

        for(String word : words) {
            if(word.length() > longest.length()) {
                longest = word;

            }
        }
        System.out.println(longest);
    }
}


/*
===========================================================
STRING split() + STRING ARRAY + FOR-EACH + Longest Word
===========================================================

1. What does split() do?

Example:

String name = "Java Programming Language";

String[] words = name.split(" ");

The split(" ") method separates the original String wherever
it finds a space.

The result is stored in a String array:

words
    index 0 -> "Java"
    index 1 -> "Programming"
    index 2 -> "Language"


2. Why is each word given an index?

After split(), the separated words become elements of a
String array.

This works exactly like the arrays we learned earlier.

Example:

int[] numbers = {10, 20, 30};

numbers
    index 0 -> 10
    index 1 -> 20
    index 2 -> 30

Similarly:

String[] words = {"Java", "Programming", "Language"};

words
    index 0 -> "Java"
    index 1 -> "Programming"
    index 2 -> "Language"

So:

words[0] -> "Java"
words[1] -> "Programming"
words[2] -> "Language"


3. Difference between a String and a String array

A normal String contains characters:

String name = "Java";

Characters have indexes:

J   a   v   a
0   1   2   3

name.charAt(2) -> 'v'


After split():

String[] words = name.split(" ");

The result is a String array.

The elements of that array can be complete words:

words[0] -> "Java"
words[1] -> "Programming"

So:

String:
    index -> individual character

String[]:
    index -> String/word


4. Why does split() use a String array?

Because one String can be divided into multiple parts.

Example:

"Java Programming Language"

becomes:

"Java"
"Programming"
"Language"

Since there are multiple Strings, they can be stored
inside a String array:

String[] words


5. Does each word always have an index?

The important concept is not that "words always get indexes."
The important concept is:

An ARRAY stores multiple values, and each array element
has an index.

split() is simply one way to create a String array from
a String.

For example, this also creates a String array:

String[] words = {"Java", "Programming"};

Here:

words[0] -> "Java"
words[1] -> "Programming"

No split() is required.


6. Using for-each with the String array

Example:

for(String word : words) {
    System.out.println(word);
}

This means:

"Take each element from the words array, one at a time,
and put it into the variable called word."

The loop works like this:

First iteration:
word -> "Java"

Second iteration:
word -> "Programming"

Third iteration:
word -> "Language"


7. Why did we use only one for-each loop?

Earlier, with a 2D array, we used:

for(int[] row : numbers) {
    for(int value : row) {
        ...
    }
}

That required two loops because the array contained
multiple arrays (rows).

Example:

numbers
    row 0 -> {10, 20, 30}
    row 1 -> {40, 50, 60}

First loop gets each row.
Second loop gets each value inside that row.

But our String array is only one-dimensional:

words
    -> "Java"
    -> "Programming"
    -> "Language"

There are no rows containing more arrays.

Therefore, only one loop is needed:

for(String word : words)


8. Why did we use "word" instead of "row"?

The variable name inside a for-each loop is chosen by us.

This:

for(String row : words)

would work, but "row" is confusing because we are
not dealing with rows.

This is clearer:

for(String word : words)

Read it as:

"For each word in words."


9. Normal for loop vs for-each

Both can be used.

For-each:

for(String word : words) {
    ...
}

Normal for:

for(int i = 0; i < words.length; i++) {
    words[i];
}

Use for-each when we only need each value.

Use normal for when we need the index.

Example:

If we need to know which position the word is at:

words[i]

then normal for is useful.

If we only need the word itself:

word

then for-each is simpler.


10. Finding the longest word

Given:

String name = "Java Programming Language";

After split():

words[0] -> "Java"
words[1] -> "Programming"
words[2] -> "Language"

We want:

Programming


11. Why do we need a variable called longest?

We need to remember the longest word found so far.

So:

String longest = words[0];

Initially:

longest -> "Java"

We then check the other words one by one.

The idea is similar to finding the largest number
in an integer array.

Earlier:

int largest = numbers[0];

Here:

String longest = words[0];


12. Why is longest a String and not an int?

Because we want to store a WORD.

So:

String longest

is correct.

We are not storing the number of characters in longest.

We are storing the actual word:

longest -> "Java"


13. What does word represent?

Inside:

for(String word : words)

word represents the CURRENT word being checked.

The loop goes:

word -> "Java"
word -> "Programming"
word -> "Language"

At each iteration, we compare the current word with
the word currently stored in longest.


14. Why can't we write:

if(word > longest)
?

Because word and longest are Strings.

Example:

word = "Programming"
longest = "Java"

The > operator compares numeric values.

Example:

10 > 5

Java can compare these because they are numbers.

But:

"Programming" > "Java"

does not tell Java what we mean by "greater."

Do we mean:

- more characters?
- alphabetically later?
- something else?

Java does not use > directly for comparing String
lengths.


15. How do we tell Java that "longer" means more characters?

We use the String length() method.

word.length()

means:

"How many characters are in the current word?"

longest.length()

means:

"How many characters are in the word currently stored
in longest?"

So:

if(word.length() > longest.length())

means:

"If the number of characters in the current word is
greater than the number of characters in the current
longest word..."


16. Example of the comparison

Suppose:

word = "Programming"
longest = "Java"

Then:

word.length() -> 11

longest.length() -> 4

So Java effectively compares:

11 > 4

This is true.

Therefore:

longest = word;

Now:

longest -> "Programming"


17. What happens during the complete loop?

Initial:

longest -> "Java"


First iteration:

word -> "Java"

Compare:

Java.length() > Java.length()

4 > 4 -> false

So longest stays:

longest -> "Java"


Second iteration:

word -> "Programming"

Compare:

Programming.length() > Java.length()

11 > 4 -> true

So:

longest = word;

Now:

longest -> "Programming"


Third iteration:

word -> "Language"

Compare:

Language.length() > Programming.length()

8 > 11 -> false

So longest stays:

longest -> "Programming"

Final result:

Programming


18. Complete code

String name = "Java Programming Language";

String[] words = name.split(" ");

String longest = words[0];

for(String word : words) {

    if(word.length() > longest.length()) {
        longest = word;
    }
}

System.out.println(longest);

Output:

Programming


19. Important connection with previous array problem

Earlier, when finding the largest number:

int largest = numbers[0];

for(int value : numbers) {

    if(value > largest) {
        largest = value;
    }
}

The logic was:

- take one value
- compare it with the current largest
- replace largest if the new value is bigger


Now with Strings:

String longest = words[0];

for(String word : words) {

    if(word.length() > longest.length()) {
        longest = word;
    }
}

The logic is almost the same:

- take one word
- compare its LENGTH with the current longest word's LENGTH
- replace longest if the new word is longer


20. Very important distinction

We are NOT comparing:

word > longest

We ARE comparing:

word.length() > longest.length()

Because:

word.length()
and
longest.length()

return numbers (int values).

Then > can compare those numbers.


21. Main concepts learned from this problem

- split(" ") can divide a String into parts.
- split() can produce a String array.
- Each array element has an index.
- words[0] accesses the first word.
- words.length gives the number of words/elements.
- for-each can process each String in the String array.
- The variable inside for-each represents the current element.
- A String variable can store a complete word.
- String length() gives the number of characters.
- > compares numeric values, not String lengths directly.
- We compare word.length() and longest.length().
- Assignment longest = word stores the new longest word.
- This is similar to finding the largest number in an array.
===========================================================
*/