package basics.Strings.Exaamples;

public class StringEx24 {

    public static void main(String[] args) {

        String value = "12a45";

        boolean onlyDigits = true;

        for(int i = 0; i < value.length(); i++) {

                if(!Character.isDigit(value.charAt(i))) {
                    onlyDigits = false;
                }
            }
        System.out.println(onlyDigits);
    }
}



/*
STRING-24 — Check Whether a String Contains Only Digits

Goal:
-----
Check whether every character in a String is a digit (0–9).

Example:
String value = "12a45";

Characters:
1 → digit
2 → digit
a → NOT a digit
4 → digit
5 → digit

Because 'a' is not a digit, the final answer is false.


CODE:
-----

public static void main(String[] args) {

    String value = "12a45";

    boolean onlyDigits = true;

    for(int i = 0; i < value.length(); i++) {

        if(!Character.isDigit(value.charAt(i))) {
            onlyDigits = false;
        }
    }

    System.out.println(onlyDigits);
}


LINE-BY-LINE EXPLANATION:
-------------------------

1. String value = "12a45";

   We create a String variable called 'value'.

   The String contains:
   1 2 a 4 5

   Each character has an index:

   Character:   1   2   a   4   5
   Index:       0   1   2   3   4

   So:
   value.charAt(0) → '1'
   value.charAt(1) → '2'
   value.charAt(2) → 'a'
   value.charAt(3) → '4'
   value.charAt(4) → '5'


2. boolean onlyDigits = true;

   We create a boolean variable called 'onlyDigits'.

   A boolean can store only:
   true
   false

   We initially set it to true.

   Why?

   At the beginning, we assume that the String contains only
   digits.

   Then, while checking each character, if we find even one
   character that is NOT a digit, we change onlyDigits to false.

   So the starting idea is:

   "Assume true → check every character → change to false
    if a non-digit is found."


3. for(int i = 0; i < value.length(); i++)

   This loop goes through each character of the String one by one.

   i starts at 0 because String indexes start at 0.

   value.length() gives the number of characters.

   "12a45" has 5 characters, so:

   value.length() → 5

   The loop runs while:

   i < 5

   Therefore i gets these values:

   i = 0
   i = 1
   i = 2
   i = 3
   i = 4

   When i becomes 5:

   5 < 5 → false

   So the loop stops.


4. value.charAt(i)

   charAt(i) gets the character at the current index.

   During each loop iteration:

   i = 0 → value.charAt(0) → '1'
   i = 1 → value.charAt(1) → '2'
   i = 2 → value.charAt(2) → 'a'
   i = 3 → value.charAt(3) → '4'
   i = 4 → value.charAt(4) → '5'

   This is similar to using numbers[i] with an array.

   Array:
   numbers[i] → gets the value at index i

   String:
   value.charAt(i) → gets the character at index i


5. Character.isDigit(value.charAt(i))

   Character.isDigit() checks whether the given character
   is a digit from 0 to 9.

   Examples:

   Character.isDigit('1') → true
   Character.isDigit('5') → true
   Character.isDigit('a') → false
   Character.isDigit(' ') → false

   In our program, we give it the current character:

   Character.isDigit(value.charAt(i))


6. !Character.isDigit(value.charAt(i))

   The ! operator means NOT.

   So we are asking:

   "Is the current character NOT a digit?"

   Examples:

   Character.isDigit('1') → true
   !true → false

   Character.isDigit('a') → false
   !false → true

   Therefore:

   '1' → condition is false
   '2' → condition is false
   'a' → condition is true
   '4' → condition is false
   '5' → condition is false


7. onlyDigits = false;

   This line changes the existing variable.

   It does NOT create a new variable because there is no
   'boolean' before onlyDigits.

   We already created:

   boolean onlyDigits = true;

   Now we are changing its stored value:

   onlyDigits = false;

   This happens when we find a character that is not a digit.


HOW THE PROGRAM EXECUTES:
-------------------------

Starting value:

onlyDigits = true


First iteration:
----------------
i = 0

value.charAt(0) → '1'

'1' is a digit.

Character.isDigit('1') → true

!true → false

The if condition is false.

So:

onlyDigits remains true


Second iteration:
-----------------
i = 1

value.charAt(1) → '2'

'2' is a digit.

Character.isDigit('2') → true

!true → false

The if condition is false.

So:

onlyDigits remains true


Third iteration:
----------------
i = 2

value.charAt(2) → 'a'

'a' is NOT a digit.

Character.isDigit('a') → false

!false → true

The if condition is true.

So this line executes:

onlyDigits = false;


Now:

onlyDigits = false


Fourth iteration:
-----------------
i = 3

value.charAt(3) → '4'

'4' is a digit.

Character.isDigit('4') → true

!true → false

The if condition is false.

Nothing changes.

onlyDigits remains false


Fifth iteration:
----------------
i = 4

value.charAt(4) → '5'

'5' is a digit.

Character.isDigit('5') → true

!true → false

The if condition is false.

Nothing changes.

onlyDigits remains false


After the loop:
---------------

The final value is:

onlyDigits = false


8. System.out.println(onlyDigits);

   Finally, we print the value stored in onlyDigits.

   Since the String "12a45" contains 'a', which is not a digit:

   Output:

   false


IMPORTANT LOGIC:
----------------

We are checking whether ALL characters are digits.

We start with:

onlyDigits = true

Then:

If we find a character that is NOT a digit:
    onlyDigits = false


The important point is that one non-digit is enough to make
the final answer false.

For example:

"12345" → true
"12a45" → false
"123 45" → false
"abc" → false
"123" → true


CONNECTION TO ARRAYS:
---------------------

The loop pattern is very similar to what we already learned
with arrays.

Array:

for(int number : numbers) {
    // process number
}


String:

for(int i = 0; i < value.length(); i++) {
    // process value.charAt(i)
}


With an array:

numbers[i] → current array value


With a String:

value.charAt(i) → current String character


The main difference is what we get from the current position.

Array:
numbers[i]

String:
value.charAt(i)


KEY POINTS TO REMEMBER:
-----------------------

1. String indexes start from 0.

2. value.length() gives the number of characters in a String.

3. value.charAt(i) gets the character at index i.

4. Character.isDigit(character) checks whether a character
   is a digit.

5. ! means NOT.

6. boolean stores true or false.

7. We start onlyDigits as true because we assume the String
   is valid until we find a character that proves it is not.

8. onlyDigits = false changes the existing boolean variable.

9. The loop checks every character one by one.

10. One non-digit character is enough to make the final result
    false.
*/