package basics.Strings.Exaamples;

import java.util.Scanner;

public class StringEx39 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word: ");
        String word = sc.nextLine();

        String reversed = "";

        for(int i = word.length() -1; i >= 0; i--) {

            reversed = reversed + word.charAt(i);
        }
            if(word.equals(reversed)) {
                System.out.println("Palindrome");
            }else{
                System.out.println("Not Palindrome");
            }
    }
}



/*
STRING-39 — Check Whether a String Is a Palindrome

A palindrome is a word that reads the same
from left to right and right to left.

Examples:

madam → Palindrome
level → Palindrome
java  → Not Palindrome

--------------------------------------------------
STEP 1 — TAKE THE WORD FROM THE USER
--------------------------------------------------

Scanner sc = new Scanner(System.in);

System.out.println("Enter the word: ");
String word = sc.nextLine();

The word entered by the user is stored inside:

word


Example:

word = "java"


--------------------------------------------------
STEP 2 — CREATE AN EMPTY STRING
--------------------------------------------------

String reversed = "";

This creates an empty String called:

reversed

Its job is to store the reversed word.

At the beginning:

reversed = ""

There is nothing inside it yet.


--------------------------------------------------
STEP 3 — START FROM THE LAST CHARACTER
--------------------------------------------------

for(int i = word.length() - 1; i >= 0; i--) {

The loop starts from the last character of the word
and moves backward.

If:

word = "java"

then:

word.length() = 4

But the indexes are:

j → 0
a → 1
v → 2
a → 3

So the last index is:

length - 1

4 - 1 = 3


That is why we start with:

i = word.length() - 1


The loop then moves like this:

i = 3
i = 2
i = 1
i = 0


--------------------------------------------------
STEP 4 — BUILD THE REVERSED WORD
--------------------------------------------------

reversed = reversed + word.charAt(i);

This is the most important line in this program.

Read it as:

"Take whatever is already stored in reversed,
add the current character from the original word,
and store the new result back into reversed."


Example:

word = "java"


At the beginning:

reversed = ""


When:

i = 3

word.charAt(3) = 'a'

So:

reversed = "" + 'a'

Now:

reversed = "a"


Next:

i = 2

word.charAt(2) = 'v'

So:

reversed = "a" + 'v'

Now:

reversed = "av"


Next:

i = 1

word.charAt(1) = 'a'

So:

reversed = "av" + 'a'

Now:

reversed = "ava"


Next:

i = 0

word.charAt(0) = 'j'

So:

reversed = "ava" + 'j'

Now:

reversed = "avaj"


Final result:

Original:
java

Reversed:
avaj


--------------------------------------------------
WHY DO WE NEED THIS LINE?
--------------------------------------------------

word.charAt(i)

gives only ONE character at a time.

For example:

'a'
'v'
'a'
'j'


But we need the complete reversed word:

"avaj"


So we keep adding every character into:

reversed


That is why we write:

reversed = reversed + word.charAt(i);


Simple memory:

old reversed value
+
current character
=
new reversed value


--------------------------------------------------
WHY IS reversed CREATED BEFORE THE LOOP?
--------------------------------------------------

String reversed = "";

must be outside the loop because we want it to
remember the characters added during previous iterations.

Example:

First loop:
reversed = "a"

Second loop:
reversed = "av"

Third loop:
reversed = "ava"

Fourth loop:
reversed = "avaj"


If we created:

String reversed = "";

inside the loop, it would become empty again
during every iteration.

Then Java could not build the complete reversed word.


--------------------------------------------------
STEP 5 — COMPARE ORIGINAL AND REVERSED STRINGS
--------------------------------------------------

if(word.equals(reversed)) {

We use:

equals()

because we want to compare the actual contents
of the two Strings.


Example:

word = "madam"

reversed = "madam"

They are equal.

So Java prints:

Palindrome


But if:

word = "java"

reversed = "avaj"

They are different.

So Java goes into the else block and prints:

Not Palindrome


--------------------------------------------------
WHY DO WE USE equals()?
--------------------------------------------------

For Strings, equals() compares their contents.

Example:

"madam".equals("madam")

→ true


"java".equals("avaj")

→ false


So:

if(word.equals(reversed))

means:

"If the original word and the reversed word
contain exactly the same characters in the same order."


--------------------------------------------------
COMPLETE FLOW
--------------------------------------------------

Input:

madam

↓
Store in word

word = "madam"

↓
Create:

reversed = ""

↓
Loop backward through the word

m
a
d
a
m

↓
Build reversed

reversed = "madam"

↓
Compare:

word.equals(reversed)

↓
true

↓
Print:

Palindrome


--------------------------------------------------
IMPORTANT THINGS TO REMEMBER
--------------------------------------------------

1. reversed = ""
   → creates an empty String to store the reversed result.

2. word.length() - 1
   → gives the last valid character index.

3. i--
   → moves backward through the String.

4. word.charAt(i)
   → gets one character from the String.

5. reversed = reversed + word.charAt(i)
   → adds the current character to the reversed String.

6. equals()
   → compares the contents of two Strings.

7. Same original and reversed String
   → Palindrome.

8. Different original and reversed String
   → Not Palindrome.


--------------------------------------------------
SIMPLE MEMORY VERSION
--------------------------------------------------

Take word
↓
Create empty reversed String
↓
Start from last character
↓
Add each character into reversed
↓
Compare original with reversed
↓
Same → Palindrome
Different → Not Palindrome


--------------------------------------------------
MOST IMPORTANT LINE
--------------------------------------------------

reversed = reversed + word.charAt(i);

Meaning:

"Keep the old reversed value,
add the current character,
and save the updated value back into reversed."

*/