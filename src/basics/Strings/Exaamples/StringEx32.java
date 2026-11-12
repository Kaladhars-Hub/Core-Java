package basics.Strings.Exaamples;

public class StringEx32 {

    public static void main(String[] args) {

        String name = "This is a test String!!";

        String[] words = name.split(" ");

        for(int i = 0; i < words.length; i++) {

            if(i % 2 == 0) {
                System.out.print(words[i].toUpperCase());
            } else {
                for(int j = words[i].length() -1; j >= 0; j--) {
                    System.out.print(words[i].charAt(j));
                }
                }
            System.out.print(" ");
        }
    }

}


/*
STRING-32 — Uppercase Even Index Words and Reverse Odd Index Words

Given:
String name = "This is a test String!!";

Expected Output:
THIS si A tset STRING!!

--------------------------------------------------
WHAT THIS PROGRAM DOES
--------------------------------------------------

The program takes this sentence:

"This is a test String!!"

and works with each word separately.

The rule is:

- Words at EVEN indexes → convert to UPPERCASE
- Words at ODD indexes  → reverse the word

Remember:

Index numbers start from 0.

So:

Index 0 → "This"      → EVEN → "THIS"
Index 1 → "is"        → ODD  → "si"
Index 2 → "a"         → EVEN → "A"
Index 3 → "test"      → ODD  → "tset"
Index 4 → "String!!"  → EVEN → "STRING!!"

Final Output:

THIS si A tset STRING!!


==================================================
STEP 1 — CREATE THE STRING
==================================================

String name = "This is a test String!!";

We create a String variable called:

name

The complete sentence is stored inside it:

"This is a test String!!"

At this point, Java sees it as one complete String.

We do NOT want to work with the complete sentence at once.

We want to work with:

"This"
"is"
"a"
"test"
"String!!"

separately.

That is why we use split().

==================================================
STEP 2 — SPLIT THE SENTENCE INTO WORDS
==================================================

String[] words = name.split(" ");

split(" ") means:

"Whenever you find a space, separate the String there."

The sentence:

"This is a test String!!"

becomes:

words[0] = "This"
words[1] = "is"
words[2] = "a"
words[3] = "test"
words[4] = "String!!"

Important:

"String!!" stays as ONE word.

The !! characters are attached to String.

split(" ") only separates using spaces.

There is no space between:

String
and
!!

So Java stores:

"String!!"

as one String.

--------------------------------------------------
WHAT IS String[]?
--------------------------------------------------

String[] means:

an array that stores Strings.

So:

String[] words

means:

"Create an array called words that can store multiple Strings."

After split():

words.length = 5

because there are 5 words.

==================================================
STEP 3 — OUTER FOR LOOP
==================================================

for(int i = 0; i < words.length; i++) {

The job of this loop is:

GO THROUGH EACH WORD ONE BY ONE.

This is the OUTER LOOP.

Here:

i = index of the current word.

The loop works like this:

First:
i = 0
words[i] = "This"

Next:
i = 1
words[i] = "is"

Next:
i = 2
words[i] = "a"

Next:
i = 3
words[i] = "test"

Next:
i = 4
words[i] = "String!!"

Then i becomes 5.

The condition is:

i < words.length

words.length is 5.

So:

5 < 5

is false.

The loop stops.

--------------------------------------------------
WHY DO WE START WITH i = 0?
--------------------------------------------------

Because array indexes start from 0.

Our array is:

words[0]
words[1]
words[2]
words[3]
words[4]

So we start at:

i = 0

--------------------------------------------------
WHY DID WE USE A NORMAL FOR LOOP?
--------------------------------------------------

We could use for-each when we only need each word.

But this problem needs the INDEX.

We need to know:

Is the current index even?

or

Is the current index odd?

That is why:

for(int i = 0; ...)

is useful.

The variable i gives us:

0, 1, 2, 3, 4

and we use those numbers to decide what to do.

==================================================
STEP 4 — CHECK WHETHER THE INDEX IS EVEN OR ODD
==================================================

if(i % 2 == 0) {

This checks whether i is EVEN.

The % symbol gives the remainder.

Examples:

0 % 2 = 0
1 % 2 = 1
2 % 2 = 0
3 % 2 = 1
4 % 2 = 0

Therefore:

0 → even
1 → odd
2 → even
3 → odd
4 → even

The condition:

i % 2 == 0

means:

"After dividing i by 2, is the remainder 0?"

If YES:

the index is even.

If NO:

the index is odd.

We do not need another condition such as:

i % 2 != 0

because the else automatically handles everything that failed the if condition.

So:

if → even index

else → odd index

==================================================
STEP 5 — EVEN INDEX → UPPERCASE
==================================================

if(i % 2 == 0) {

    System.out.print(words[i].toUpperCase());

}

If the index is even, Java executes this line.

Example:

i = 0

words[i]

means:

words[0]

which contains:

"This"

Then:

words[i].toUpperCase()

becomes:

"This".toUpperCase()

Result:

"THIS"

Java prints:

THIS

--------------------------------------------------

When:

i = 2

words[2] = "a"

toUpperCase() gives:

"A"

--------------------------------------------------

When:

i = 4

words[4] = "String!!"

toUpperCase() gives:

"STRING!!"

The !! symbols remain unchanged because they are not lowercase letters.

==================================================
STEP 6 — ODD INDEX → GO INTO ELSE
==================================================

else {

If:

i % 2 == 0

is false, Java enters the else block.

This happens for:

i = 1
i = 3

These are the odd indexes.

At i = 1:

words[i] = "is"

At i = 3:

words[i] = "test"

These words need to be reversed.

A normal String does not have the same simple reverse method that we are using here.

So we reverse the characters manually using another for loop.

==================================================
STEP 7 — INNER FOR LOOP
==================================================

for(int j = words[i].length() - 1; j >= 0; j--) {

This is the INNER LOOP.

The OUTER LOOP uses:

i

to control the WORD.

The INNER LOOP uses:

j

to control the CHARACTER inside that word.

Very important memory trick:

i → which WORD?

j → which CHARACTER inside that word?

==================================================
EXAMPLE: WHEN i = 1
==================================================

When:

i = 1

the current word is:

words[1]

which is:

"is"

So:

words[i]

means:

"is"

Now Java runs:

words[i].length()

The word:

"is"

contains 2 characters.

So:

words[i].length()

is:

2

But the indexes are:

i → index 0
s → index 1

The last index is NOT 2.

The last index is:

length - 1

So:

2 - 1 = 1

That is why we write:

int j = words[i].length() - 1;

j starts at:

1

==================================================
STEP 8 — REVERSE "is"
==================================================

Current word:

"is"

Indexes:

index 0 → i
index 1 → s

The loop:

for(int j = 1; j >= 0; j--)

works like this.

First:

j = 1

words[i].charAt(j)

means:

"is".charAt(1)

Character:

s

Java prints:

s

Then:

j--

So:

j = 0

Now:

"is".charAt(0)

Character:

i

Java prints:

i

Now output becomes:

si

Then:

j--

j becomes:

-1

Condition:

j >= 0

becomes:

-1 >= 0

false.

The inner loop stops.

So:

"is"

became:

"si"

==================================================
STEP 9 — REVERSE "test"
==================================================

Later the outer loop reaches:

i = 3

words[3] = "test"

Length:

4

Indexes:

t → 0
e → 1
s → 2
t → 3

The inner loop starts at:

length - 1

4 - 1 = 3

So:

j = 3

--------------------------------------------------

j = 3

charAt(3) → t

Output:
t

--------------------------------------------------

j = 2

charAt(2) → s

Output:
ts

--------------------------------------------------

j = 1

charAt(1) → e

Output:
tse

--------------------------------------------------

j = 0

charAt(0) → t

Output:
tset

So:

"test"

becomes:

"tset"

==================================================
STEP 10 — WHAT DOES charAt(j) DO?
==================================================

words[i].charAt(j)

has two important parts.

First:

words[i]

selects the current WORD.

Second:

charAt(j)

selects a CHARACTER from that word.

Example:

i = 3

words[i]

means:

words[3]

which is:

"test"

If:

j = 2

then:

words[i].charAt(j)

becomes:

"test".charAt(2)

The character at index 2 is:

s

So Java prints:

s

==================================================
STEP 11 — WHY DO WE NEED TWO LOOPS?
==================================================

This is the most important part of this problem.

The two loops have DIFFERENT jobs.

OUTER LOOP:

for(int i = 0; i < words.length; i++)

Job:

Go through each WORD.

--------------------------------------------------

INNER LOOP:

for(int j = words[i].length() - 1; j >= 0; j--)

Job:

Go backward through the CHARACTERS of one word.

--------------------------------------------------

So:

i → moves between words

j → moves between characters inside one word

Example:

Outer loop chooses:

"test"

Then the inner loop works only inside:

"test"

and prints:

t
s
e
t

backward.

When the inner loop finishes, Java returns to the outer loop and moves to the next word.

==================================================
STEP 12 — WHY IS THE INNER LOOP INSIDE ELSE?
==================================================

We only want to reverse ODD-index words.

We do NOT want to reverse every word.

Therefore:

else {

    for(...) {
        // reverse
    }

}

The inner reverse loop runs only when the index is odd.

Example:

i = 0 → if → uppercase

No inner reverse loop.

i = 1 → else → reverse

Inner loop runs.

i = 2 → if → uppercase

No inner loop.

i = 3 → else → reverse

Inner loop runs.

i = 4 → if → uppercase

No inner loop.

==================================================
STEP 13 — ADD A SPACE AFTER EACH WORD
==================================================

System.out.print(" ");

This line is outside the if/else but still inside the outer loop.

That means:

after Java finishes processing each word,
it prints one space.

Without this:

Java could print:

THISsiAtsetSTRING!!

Everything would join together.

With:

System.out.print(" ");

we get:

THIS si A tset STRING!!

--------------------------------------------------
WHY print() AND NOT println()?
--------------------------------------------------

println() moves to the next line.

If we used println(), we could get:

THIS
si
A
tset
STRING!!

But we want one sentence.

So we use:

print()

==================================================
COMPLETE EXECUTION FLOW
==================================================

Original array:

words[0] = "This"
words[1] = "is"
words[2] = "a"
words[3] = "test"
words[4] = "String!!"

--------------------------------------------------

FIRST OUTER LOOP

i = 0

0 % 2 == 0 → true

So Java uses:

toUpperCase()

"This" → "THIS"

Output:

THIS

Then print space.

Output:

THIS

--------------------------------------------------

SECOND OUTER LOOP

i = 1

1 % 2 == 0 → false

Java enters else.

Current word:

"is"

Inner loop reverses:

"is" → "si"

Output:

THIS si

Then print space.

--------------------------------------------------

THIRD OUTER LOOP

i = 2

2 % 2 == 0 → true

"a".toUpperCase()

Result:

"A"

Output:

THIS si A

Then print space.

--------------------------------------------------

FOURTH OUTER LOOP

i = 3

3 % 2 == 0 → false

Java enters else.

Current word:

"test"

Inner loop reverses:

"test" → "tset"

Output:

THIS si A tset

Then print space.

--------------------------------------------------

FIFTH OUTER LOOP

i = 4

4 % 2 == 0 → true

"String!!".toUpperCase()

Result:

"STRING!!"

Output:

THIS si A tset STRING!!

==================================================
FINAL OUTPUT
==================================================

THIS si A tset STRING!!

==================================================
METHODS / CONCEPTS USED
==================================================

1. split(" ")

Purpose:
Break one sentence into separate words.

Result:
Creates a String array.

--------------------------------------------------

2. words.length

Purpose:
Tells us how many Strings are stored in the array.

Here:

words.length = 5

--------------------------------------------------

3. Normal for loop

for(int i = 0; i < words.length; i++)

Purpose:
Go through every word while also keeping its index.

We need the index because we must identify even and odd positions.

--------------------------------------------------

4. %

if(i % 2 == 0)

Purpose:
Check whether the index is even.

Remainder 0 → even.

--------------------------------------------------

5. toUpperCase()

words[i].toUpperCase()

Purpose:
Convert all letters in the selected word to uppercase.

--------------------------------------------------

6. length()

words[i].length()

Purpose:
Count how many characters are inside the current word.

Remember:

length = number of characters

It does NOT give the last index.

Last index:

length - 1

--------------------------------------------------

7. charAt(j)

words[i].charAt(j)

Purpose:
Get one particular character from the current word.

--------------------------------------------------

8. Inner reverse loop

for(int j = words[i].length() - 1; j >= 0; j--)

Purpose:
Start from the last character and move backward until index 0.

--------------------------------------------------

9. print(" ")

Purpose:
Add a space between the processed words.

==================================================
IMPORTANT THINGS TO REMEMBER
==================================================

1. Array indexes start from 0.

2. Even indexes are:

0, 2, 4, 6...

3. Odd indexes are:

1, 3, 5, 7...

4. i controls the WORD.

5. j controls the CHARACTER inside the current word.

6. words[i] gives the current String.

7. words[i].charAt(j) gives one character from that String.

8. length() gives the number of characters.

9. Last character index is:

length() - 1

10. The inner loop is inside else because only odd-index words need to be reversed.

==================================================
SIMPLE MEMORY VERSION
==================================================

Sentence
↓
split into words
↓
outer loop goes through each word
↓
check index

EVEN INDEX
↓
toUpperCase()

ODD INDEX
↓
inner loop
↓
start from last character
↓
print characters backward

After every word
↓
print one space

==================================================
MAIN IDEA OF THIS PROBLEM
==================================================

Do NOT try to change the complete sentence at once.

First break the sentence into individual words.

Then decide what should happen to EACH word.

Outer loop:

"Which word am I working with?"

if/else:

"What should I do with this word?"

Inner loop:

"If this word needs reversing, which character should I print next?"

That is the complete logic behind:

THIS si A tset STRING!!
*/