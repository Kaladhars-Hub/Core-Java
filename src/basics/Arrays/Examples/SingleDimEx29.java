package basics.Arrays.Examples;

public class SingleDimEx29 {

    public static void main(String[] args) {

        String[] words = {"coffee", "water", "chai", "diet coke"};

        String shortest = words[0];
        int index = 0;

        for(int i = 1; i < words.length; i++) {

            if(words[i].length() < shortest.length()) {
                shortest = words[i];
                index = i;
            }
        }
        System.out.println(shortest);
        System.out.println(index);
    }
}


/*

ARRAY-29 — Find the Shortest Word and Its Index

Given:
String[] words = {"coffee", "water", "chai", "diet coke"};

Expected Output:
Shortest word = chai
Index = 2


--------------------------------------------------
WHAT THIS PROGRAM DOES
--------------------------------------------------

The program:

1. Takes a String array containing different words.
2. Assumes the first word is the shortest word initially.
3. Goes through the remaining words one by one.
4. Compares the length of each word with the length
   of the current shortest word.
5. If a smaller word is found:
   - update the shortest word
   - update its index
6. Finally print:
   - the shortest word
   - the index where that word is stored


==================================================
COMPLETE CODE
==================================================

public static void main(String[] args) {

    String[] words = {"coffee", "water", "chai", "diet coke"};

    String shortest = words[0];
    int index = 0;

    for(int i = 1; i < words.length; i++) {

        if(words[i].length() < shortest.length()) {
            shortest = words[i];
            index = i;
        }
    }

    System.out.println(shortest);
    System.out.println(index);
}


==================================================
STEP 1 — CREATE THE STRING ARRAY
==================================================

String[] words = {"coffee", "water", "chai", "diet coke"};

This creates a String array called:

words


The array contains:

words[0] = "coffee"
words[1] = "water"
words[2] = "chai"
words[3] = "diet coke"


So:

words.length = 4


Remember:

words.length

tells us how many elements are inside the array.


==================================================
STEP 2 — ASSUME THE FIRST WORD IS SHORTEST
==================================================

String shortest = words[0];

The first word is:

"coffee"


So initially:

shortest = "coffee"


We are basically saying:

"Until I find a smaller word,
I will assume coffee is the shortest."


The length of:

"coffee"

is:

6


==================================================
STEP 3 — STORE ITS INDEX
==================================================

int index = 0;

Since:

shortest = words[0]

the current shortest word is stored at:

index 0


So initially:

shortest = "coffee"
index = 0


Remember:

shortest → stores the WORD

index → stores the POSITION of that word


==================================================
STEP 4 — START THE FOR LOOP
==================================================

for(int i = 1; i < words.length; i++) {

The loop starts from:

i = 1


Why not i = 0?

Because we already used:

words[0]

as our initial shortest word.


There is no need to compare:

"coffee"

with itself.


So Java checks:

words[1]
words[2]
words[3]


one by one.


==================================================
STEP 5 — COMPARE WORD LENGTHS
==================================================

if(words[i].length() < shortest.length()) {

Read this in plain English as:

"If the current word has fewer characters
than the shortest word I have found so far..."


Breaking it down:

words[i]

means:

the current word


words[i].length()

means:

how many characters are in the current word


shortest.length()

means:

how many characters are in the current shortest word


<

means:

less than


So:

words[i].length() < shortest.length()

means:

"Is the current word shorter than
the shortest word I already have?"


==================================================
STEP 6 — IF A SHORTER WORD IS FOUND
==================================================

shortest = words[i];

This updates the shortest word.


And:

index = i;

stores where that new shortest word was found.


These two lines must work together.


For example:

If:

words[i] = "water"

then:

shortest = "water"

and:

index = 1


So we remember both:

the value

and

its position.


==================================================
STEP-BY-STEP EXECUTION
==================================================

Initial values:

shortest = "coffee"
index = 0


"coffee" length = 6


--------------------------------------------------
FIRST LOOP
--------------------------------------------------

i = 1

words[1] = "water"

"water".length() = 5

Current shortest:

"coffee".length() = 6


Condition:

5 < 6

true


So Java executes:

shortest = words[1];

Now:

shortest = "water"


And:

index = 1


Current result:

shortest = "water"
index = 1


--------------------------------------------------
SECOND LOOP
--------------------------------------------------

i = 2

words[2] = "chai"

"chai".length() = 4

Current shortest:

"water".length() = 5


Condition:

4 < 5

true


So:

shortest = words[2];

Now:

shortest = "chai"


And:

index = 2


Current result:

shortest = "chai"
index = 2


--------------------------------------------------
THIRD LOOP
--------------------------------------------------

i = 3

words[3] = "diet coke"

"diet coke".length() = 9

Important:

The space also counts as a character.


Current shortest:

"chai".length() = 4


Condition:

9 < 4

false


So Java does NOT enter the if block.

Nothing changes.


shortest remains:

"chai"


index remains:

2


==================================================
AFTER THE LOOP FINISHES
==================================================

Final values are:

shortest = "chai"

index = 2


So:

System.out.println(shortest);

prints:

chai


And:

System.out.println(index);

prints:

2


==================================================
FINAL OUTPUT
==================================================

chai
2


==================================================
IMPORTANT DIFFERENCE
==================================================

shortest stores:

the actual String value


Example:

"chai"


index stores:

where that value is located inside the array


Example:

2


So remember:

shortest → VALUE

index → POSITION


==================================================
WHY DO WE USE length() HERE?
==================================================

We are not comparing the words alphabetically.

We are comparing:

how many characters each word contains.


Example:

"coffee" → 6 characters
"water"  → 5 characters
"chai"   → 4 characters


So:

"chai"

is the shortest.


That is why we compare:

words[i].length()

with:

shortest.length()


==================================================
WHY DON'T WE NEED ELSE?
==================================================

If the current word is shorter:

update shortest and index.


If it is NOT shorter:

do nothing.


So there is no useful work for an else block.


Example:

"diet coke" length 9

is not shorter than:

"chai" length 4


So Java simply skips the if block.


==================================================
MAIN IDEA TO REMEMBER
==================================================

Start by assuming:

first word = shortest


Then:

go through every remaining word

↓


compare lengths

↓


if current word is shorter

↓


update:

shortest = words[i]

and:

index = i


At the end:

shortest tells us the WORD

index tells us WHERE it was found.


==================================================
SIMPLE MEMORY VERSION
==================================================

shortest = words[0]
index = 0

↓

Go through remaining words

↓

Compare:

current word length
with
shortest word length

↓

If current is smaller:

shortest = current word
index = current index

↓

Print both

*/
