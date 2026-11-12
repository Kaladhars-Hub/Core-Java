package basics.Strings.Exaamples;

public class StringsEx34 {

    public static void main(String[] args) {

        String name = "java is easy";

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);
            int count = 0;

            for (int j = 0; j < name.length(); j++) {
                if (ch == name.charAt(j)) {
                    count++;
                }
            }
            if (ch != ' ' && count > 1) {
                System.out.println("First repeated character is =" + ch);
                break;
            }
        }

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);
            int count = 0;

            for (int j = 0; j < name.length(); j++) {
                if (ch == name.charAt(j)) {
                    count++;
                }
            }

            if (ch != ' ' && count == 1) {
                System.out.println("First non-repeated character is = " + ch);
                break;
            }
        }
    }
}


/*

STRING-34 — First Repeated and First Non-Repeated Character


Given:
String name = "java is easy";

Expected Output:
First repeated character is = a
First non-repeated character is = j


--------------------------------------------------
WHAT THIS PROGRAM DOES
--------------------------------------------------

The program checks every character in the String and finds:

1. The FIRST character that appears more than once.
2. The FIRST character that appears only once.

For:

"java is easy"

The first repeated character is:

a

because 'a' appears more than one time.

The first non-repeated character is:

j

because 'j' appears only one time.


==================================================
STEP 1 — CREATE THE STRING
==================================================

String name = "java is easy";

The complete String is stored inside the variable:

name


We are NOT splitting the String into words in this problem.

Why?

Because we are checking individual characters such as:

j
a
v
a
i
s
e
a
s
y

So we directly use:

name.charAt(i)

to work with characters one by one.


==================================================
STEP 2 — FIRST OUTER LOOP
==================================================

for (int i = 0; i < name.length(); i++) {

The job of this loop is:

Select one character at a time.

For example:

i = 0 → 'j'
i = 1 → 'a'
i = 2 → 'v'
i = 3 → 'a'
...

This is called the OUTER LOOP because another loop is written inside it.


==================================================
STEP 3 — STORE THE CURRENT CHARACTER
==================================================

char ch = name.charAt(i);

This stores the character selected by the outer loop.

Example:

If:

i = 0

then:

name.charAt(0)

is:

'j'

So:

ch = 'j'


If:

i = 1

then:

ch = 'a'


This variable:

ch

means:

"The character we are currently investigating."


==================================================
STEP 4 — START COUNT FROM 0
==================================================

int count = 0;

For every new character, we start counting again from 0.

Why?

Because each character needs its own separate count.

Example:

For 'j':

count starts at 0.

After checking the whole String:

count becomes 1.


Then the outer loop moves to 'a'.

For 'a', we again need:

count = 0

and then count how many times 'a' appears.


If we did NOT reset count to 0, the previous character's count would get added to the next character's count.

That would give us wrong results.


==================================================
STEP 5 — INNER LOOP
==================================================

for (int j = 0; j < name.length(); j++) {

This loop checks the ENTIRE String.

The outer loop has already selected one character.

The inner loop now compares that selected character with every character in the String.


Simple memory:

i → chooses the character we are investigating

j → checks the whole String against that character


==================================================
EXAMPLE: OUTER LOOP SELECTS 'a'
==================================================

Suppose:

ch = 'a'

Now the inner loop checks:

'a' against 'j'
'a' against 'a'
'a' against 'v'
'a' against 'a'
'a' against ' '
'a' against 'i'
...

and continues until the whole String is checked.


==================================================
STEP 6 — COMPARE THE CHARACTERS
==================================================

if (ch == name.charAt(j)) {

This means:

"If the selected character is equal to the character currently being checked..."

Then:

count++;

increases the count by 1.


Example:

ch = 'a'


Check:

'a' == 'j'

false

count stays:

0


Next:

'a' == 'a'

true

count becomes:

1


Later another 'a' is found.

count becomes:

2


Then another 'a' is found.

count becomes:

3


So after the inner loop finishes:

count = 3


That tells us:

'a' appears 3 times.


==================================================
STEP 7 — WHY DO WE CHECK COUNT AFTER THE INNER LOOP?
==================================================

This is very important.

We do NOT check whether a character is repeated before the inner loop finishes.

Why?

Because Java needs to check the COMPLETE String first.

Example:

Suppose Java is checking 'a'.

After finding the first 'a':

count = 1

But this does NOT mean 'a' is non-repeated yet.

There may be another 'a' later in the String.

So Java must finish checking the entire String first.

Only after the inner loop finishes do we know the final count.


==================================================
STEP 8 — FIND FIRST REPEATED CHARACTER
==================================================

if (ch != ' ' && count > 1) {

You can read this in simple English as:

"If the current character is NOT a space
AND
it appears more than one time."


Breaking it down:

ch != ' '

means:

The current character should not be a space.


&&

means:

AND


count > 1

means:

The character appeared more than once.


So:

if (ch != ' ' && count > 1)

means:

"If this is an actual character and it is repeated."


==================================================
EXAMPLE FOR 'j'
==================================================

ch = 'j'

After checking the whole String:

count = 1

Condition:

count > 1

is false.

So Java does NOT print 'j' as repeated.


==================================================
EXAMPLE FOR 'a'
==================================================

ch = 'a'

After checking the whole String:

count = 3

Condition:

count > 1

is true.

So Java prints:

First repeated character is = a


==================================================
STEP 9 — WHY DO WE USE break?
==================================================

break;

means:

"Stop this loop now."


The question asks for:

FIRST repeated character.

Once Java finds the first repeated character:

a

we do not need to continue searching.

So:

break;

stops that outer loop.


Without break, Java could continue and find other repeated characters too.

But we only want the first one.


==================================================
STEP 10 — SECOND SEARCH
==================================================

After the first loop finishes, Java moves to another separate outer loop.

This second search is used to find:

the first NON-REPEATED character.


The structure is almost the same:

for (int i = 0; i < name.length(); i++) {

    char ch = name.charAt(i);
    int count = 0;

    for (int j = 0; j < name.length(); j++) {

        if (ch == name.charAt(j)) {
            count++;
        }
    }

    if (ch != ' ' && count == 1) {

        System.out.println(
            "First non-repeated character is = " + ch
        );

        break;
    }
}


==================================================
STEP 11 — FIND NON-REPEATED CHARACTER
==================================================

The main difference is:

count == 1

Instead of:

count > 1


count == 1

means:

"The character appeared exactly one time."


So:

if (ch != ' ' && count == 1)

means:

"If the current character is not a space
and
it appears exactly once."


That makes it a non-repeated character.


==================================================
EXAMPLE FOR 'j'
==================================================

The second search starts again from index 0.

So first:

ch = 'j'

The inner loop checks the complete String.

It finds 'j' only one time.

So:

count = 1


Condition:

ch != ' '

is true.

And:

count == 1

is also true.


So Java prints:

First non-repeated character is = j


Then:

break;

stops the second search.


==================================================
WHY DO WE USE TWO SEPARATE SEARCHES?
==================================================

Because we want two different answers:

1. First repeated character
2. First non-repeated character


The first loop searches only for the first repeated character.

Once it finds one:

break;

stops that loop.


Then Java moves to the second loop.

The second loop starts from the beginning again and searches for the first non-repeated character.


So the flow is:

FIRST SEARCH
↓
Find first repeated character
↓
Print it
↓
break


THEN


SECOND SEARCH
↓
Find first non-repeated character
↓
Print it
↓
break


==================================================
IMPORTANT — break DOES NOT STOP THE WHOLE PROGRAM
==================================================

The first break:

break;

only stops the first outer loop.


After that, Java continues with the next code.

So the second outer loop still runs.


That is why we can get both:

First repeated character is = a

and:

First non-repeated character is = j


==================================================
COMPLETE FLOW FOR FIRST REPEATED
==================================================

Start with:

"java is easy"


Outer loop selects:

'j'

Inner loop counts 'j'.

count = 1

Not repeated.

Continue.


Outer loop selects:

'a'

Inner loop checks the whole String.

count = 3

Repeated.

Print:

First repeated character is = a

break.


==================================================
COMPLETE FLOW FOR FIRST NON-REPEATED
==================================================

Second search starts from the beginning.


Outer loop selects:

'j'

Inner loop checks the complete String.

count = 1

Non-repeated.

Print:

First non-repeated character is = j

break.


==================================================
FINAL OUTPUT
==================================================

First repeated character is = a
First non-repeated character is = j


==================================================
IMPORTANT THINGS TO REMEMBER
==================================================

1. Outer loop chooses one character.

2. Inner loop checks the complete String.

3. ch stores the character we are currently checking.

4. count starts from 0 for every new character.

5. If the same character is found:

   count++;

6. count > 1 means:

   repeated character.

7. count == 1 means:

   non-repeated character.

8. ch != ' ' means:

   ignore spaces.

9. break means:

   stop after finding the first matching character.

10. The final count check must happen AFTER the inner loop finishes.


==================================================
SIMPLE MEMORY VERSION
==================================================

Outer loop
↓
Choose one character

Inner loop
↓
Check whole String
↓
Count how many times that character appears

Then:

count > 1
↓
Repeated

count == 1
↓
Non-repeated

Ignore spaces

Use break
↓
because we only need the FIRST one


==================================================
MOST IMPORTANT IDEA
==================================================

i → Which character am I checking?

j → Check that character against the whole String.

count → How many times did I find it?

break → I found the first answer, so stop searching.
*/
