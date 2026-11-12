package basics.Strings.Exaamples;

public class StringsEx35 {

    public static void main(String[] args) {

        String name = "java is super keka easy and awesome";

        String[] words = name.split(" ");

        String[] evenWords = new String[3];

        int index = 0;

        for(int i = 0; i < words.length; i++) {

            if (i % 2 != 0) {
                evenWords[index] = words[i];
                index++;
            }
        }
            for (String word : evenWords) {
                System.out.print(word + " ");
            }
    }
}

/*

STRING-35 — Store Words from Even Positions into a New Array


Given:
String name = "java is super keka easy and awesome";

Expected selected words:
"is", "keka", "and"

--------------------------------------------------
WHAT THIS PROGRAM DOES
--------------------------------------------------

The program:

1. Splits the complete sentence into separate words.
2. Checks the index of every word.
3. Selects words that are at:

   index 1
   index 3
   index 5

4. Stores those selected words inside a NEW String array.
5. Prints the new array using a for-each loop.


==================================================
STEP 1 — CREATE THE STRING
==================================================

String name = "java is super keka easy and awesome";

The complete sentence is stored inside:

name


At this point it is one complete String.

We want to work with each WORD separately.

So we use:

split(" ")


==================================================
STEP 2 — SPLIT THE STRING
==================================================

String[] words = name.split(" ");

split(" ") means:

"Whenever you find a space, separate the String there."


After splitting, Java creates a String array like this:

words[0] = "java"
words[1] = "is"
words[2] = "super"
words[3] = "keka"
words[4] = "easy"
words[5] = "and"
words[6] = "awesome"


There are 7 words.

So:

words.length = 7


==================================================
WORD POSITION VS ARRAY INDEX
==================================================

This is very important.

Word position starts naturally from 1:

Position 1 → java
Position 2 → is
Position 3 → super
Position 4 → keka
Position 5 → easy
Position 6 → and
Position 7 → awesome


But array indexes start from 0:

Index 0 → java
Index 1 → is
Index 2 → super
Index 3 → keka
Index 4 → easy
Index 5 → and
Index 6 → awesome


The question asks for words at EVEN POSITIONS:

Position 2
Position 4
Position 6


These are stored at ODD ARRAY INDEXES:

Index 1
Index 3
Index 5


So we need:

"is"
"keka"
"and"


==================================================
STEP 3 — CREATE A NEW ARRAY
==================================================

String[] evenWords = new String[3];

This creates another String array.

It has 3 spaces because we know we need to store 3 words:

"is"
"keka"
"and"


The new array has these indexes:

evenWords[0]
evenWords[1]
evenWords[2]


Initially, those places are empty.


==================================================
STEP 4 — CREATE A SEPARATE INDEX VARIABLE
==================================================

int index = 0;

This variable controls where the selected words should be stored
inside the NEW array.


Remember:

i     → reads from the original words array

index → writes into the new evenWords array


At first:

index = 0

because the first selected word should go into:

evenWords[0]


==================================================
STEP 5 — GO THROUGH THE ORIGINAL ARRAY
==================================================

for (int i = 0; i < words.length; i++) {

This loop goes through all the words one by one.


i will become:

0
1
2
3
4
5
6


So Java checks:

words[0]
words[1]
words[2]
...
words[6]


==================================================
STEP 6 — SELECT ONLY INDEXES 1, 3, 5
==================================================

if (i % 2 != 0) {

This condition checks whether i is an ODD number.


Examples:

0 % 2 → remainder 0 → even

1 % 2 → remainder 1 → odd

2 % 2 → remainder 0 → even

3 % 2 → remainder 1 → odd


So:

i % 2 != 0

means:

"If the index is NOT evenly divisible by 2,
then it is an odd index."


That selects:

1
3
5


Those indexes contain:

words[1] = "is"
words[3] = "keka"
words[5] = "and"


==================================================
WHY DON'T WE NEED ELSE?
==================================================

We only care about indexes:

1, 3, 5


If the condition is true:

store the word.


If the condition is false:

do nothing.


For example:

i = 0

condition false

Java simply skips the if block.


i = 1

condition true

Java stores "is".


So there is nothing useful for an else block to do.

That is why we don't need:

else


==================================================
STEP 7 — STORE THE SELECTED WORD
==================================================

evenWords[index] = words[i];

Read this in simple language as:

"Take the selected word from the original array
and store it in the next available place in the new array."


Breaking it down:

words[i]

means:

the current word from the ORIGINAL array.


evenWords[index]

means:

the place where we want to store that word
inside the NEW array.


The = means:

store the value from the right side
into the place on the left side.


==================================================
EXAMPLE — FIRST SELECTED WORD
==================================================

When:

i = 1

we have:

words[1] = "is"


At this moment:

index = 0


So:

evenWords[index] = words[i];

becomes:

evenWords[0] = words[1];


And because:

words[1] = "is"

Java effectively stores:

evenWords[0] = "is";


==================================================
STEP 8 — WHAT DOES index++ DO?
==================================================

index++;

means:

increase index by 1.


It is the same idea as:

index = index + 1;


After storing:

"is"

at:

evenWords[0]


we do:

index++


So:

index becomes 1.


Now the next selected word can be stored in:

evenWords[1]


==================================================
COMPLETE STORAGE FLOW
==================================================

At the beginning:

index = 0


----------------------------------

i = 0

words[0] = "java"

0 is even.

Skip.


----------------------------------

i = 1

words[1] = "is"

1 is odd.

Store:

evenWords[0] = "is"

Then:

index++

index becomes:

1


----------------------------------

i = 2

words[2] = "super"

2 is even.

Skip.


----------------------------------

i = 3

words[3] = "keka"

3 is odd.

Store:

evenWords[1] = "keka"

Then:

index++

index becomes:

2


----------------------------------

i = 4

words[4] = "easy"

4 is even.

Skip.


----------------------------------

i = 5

words[5] = "and"

5 is odd.

Store:

evenWords[2] = "and"

Then:

index++

index becomes:

3


----------------------------------

i = 6

words[6] = "awesome"

6 is even.

Skip.


==================================================
FINAL NEW ARRAY
==================================================

After the loop finishes:

evenWords[0] = "is"
evenWords[1] = "keka"
evenWords[2] = "and"


So the new array contains only the required words.


==================================================
WHY CAN'T WE USE THIS?
==================================================

evenWords[i] = words[i];


Because i is moving through:

0, 1, 2, 3, 4, 5, 6


But evenWords has only:

0, 1, 2


So when:

i = 3

Java would try:

evenWords[3]


But that index does NOT exist.

The last valid index is:

2


That is why we use a separate variable:

index


So the mapping becomes:

words[1] → evenWords[0]

words[3] → evenWords[1]

words[5] → evenWords[2]


==================================================
STEP 9 — PRINT THE NEW ARRAY
==================================================

for (String word : evenWords) {

    System.out.println(word);
}


This is a for-each loop.

Its job is:

Go through every String stored inside evenWords
one by one.


First:

word = "is"

Print:

is


Next:

word = "keka"

Print:

keka


Next:

word = "and"

Print:

and


==================================================
WHY USE FOR-EACH FOR PRINTING?
==================================================

When printing the new array, we don't need its indexes.

We only need the values.

So for-each is simple and useful here.


Instead of manually writing:

System.out.println(evenWords[0]);
System.out.println(evenWords[1]);
System.out.println(evenWords[2]);


we let Java do the repetitive work:

for (String word : evenWords) {
    System.out.println(word);
}


==================================================
FINAL OUTPUT
==================================================

is
keka
and


==================================================
MOST IMPORTANT THINGS TO REMEMBER
==================================================

1. split(" ")
   → breaks the sentence into words.

2. words
   → original array.

3. i
   → moves through the original array.

4. i % 2 != 0
   → selects indexes 1, 3, 5.

5. evenWords
   → new array that stores selected words.

6. index
   → controls where the next selected word is stored.

7. evenWords[index] = words[i]
   → take a word from the old array and store it in the new array.

8. index++
   → move to the next empty place in the new array.

9. No else is needed because unwanted words are simply skipped.

10. for-each
    → prints every value from the new array automatically.


==================================================
SIMPLE MEMORY VERSION
==================================================

Sentence
↓
split into words
↓
original array

Use i
↓
go through every original word
↓
check odd array indexes 1, 3, 5

If selected:
↓
words[i]
↓
store into
↓
evenWords[index]
↓
index++

After storing everything:
↓
for-each
↓
print the new array


==================================================
MAIN IDEA OF THIS PROBLEM
==================================================

i tells Java:

"Which word am I reading from the original array?"


index tells Java:

"Where should I store that selected word
inside the new array?"


For revision, the single most important line from this problem is:

evenWords[index] = words[i];

Think: read using i, store using index, then index++ moves to the next empty place.

 */
