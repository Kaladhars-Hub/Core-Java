package basics.Strings.Exaamples;

public class StringEx36 {

    public static void main(String[] args) {

        String name1 = "New York";
        String name2 = "NWYR";

        String lowerName1 = name1.toLowerCase();
        String lowerName2 = name2.toLowerCase();

        for (int i = 0; i < name1.length(); i++) {

            char ch = lowerName1.charAt(i);

            if (lowerName2.indexOf(ch) != -1) {
                System.out.print(name1.charAt(i));
            }else {
                System.out.print("+");
            }
        }
    }
}


/*
STRING-27 — Compare Two Strings and Print + for Missing Characters

Given:
String name1 = "New York";
String name2 = "NWYR";

What the program does:
- It takes two strings.
- It prints each character of name1.
- If the character exists in name2 (case-insensitive), it prints the original character.
- If the character does **not** exist in name2, it prints a "+" instead.

The final output will be:
N+e+y+o+r+k

Step-by-step explanation (simple and clear language):

1. Creating and lower-casing the strings
   String name1 = "New York";
   String name2 = "NWYR";

   String lowerName1 = name1.toLowerCase();   // "new york"
   String lowerName2 = name2.toLowerCase();   // "nwyr"

   Why did we convert both to lowercase?
   - We want to compare letters without caring about case (N vs n, Y vs y).
   - toLowerCase() makes sure both strings are in the same case.

2. The main loop
   for (int i = 0; i < name1.length(); i++) {

   - This loop goes through every character of name1 one by one.
   - i = 0, 1, 2, 3, 4, 5, 6 (name1 has 7 characters).
   - name1.length() gives the total number of characters.
   - Why did we use a normal for loop with index? Because we need the position i to read each character one by one.

3. Getting the current character
   char ch = lowerName1.charAt(i);

   - charAt(i) returns the character at position i.
   - i = 0 → ch = 'n'
   - i = 1 → ch = 'e'
   - i = 2 → ch = 'w'
   - ... and so on.

4. Checking if the character exists in name2
   if (lowerName2.indexOf(ch) != -1) {
       System.out.print(name1.charAt(i));
   } else {
       System.out.print("+");
   }

   - indexOf(ch) checks if the character exists in lowerName2.
   - If the character is found, indexOf returns the position (0, 1, 2, 3, 4, 5, or 6) which is **not -1**.
   - If the character is NOT found, indexOf returns -1.

   Why did we use lowerName2.indexOf(ch)?
   - We want to compare the character with name2.
   - We use lowercase version of name2 because we already lower-cased name1.

   Why did we check != -1 ?
   - -1 means "character not found".
   - Any other number means "character found".
   - This is the standard way in Java to check if something exists in a string.

5. What happens in each iteration (visual)

Iteration 1: i=0, ch='n'
   lowerName2.indexOf('n') = 0 (found) → print 'N'

Iteration 2: i=1, ch='e'
   lowerName2.indexOf('e') = -1 (NOT found) → print '+'

Iteration 3: i=2, ch='w'
   lowerName2.indexOf('w') = 1 (found) → print 'w'

Iteration 4: i=3, ch=' '
   lowerName2.indexOf(' ') = -1 (NOT found) → print '+'

Iteration 5: i=4, ch='y'
   lowerName2.indexOf('y') = 2 (found) → print 'Y'

Iteration 6: i=5, ch='o'
   lowerName2.indexOf('o') = -1 (NOT found) → print '+'

Iteration 7: i=6, ch='r'
   lowerName2.indexOf('r') = 3 (found) → print 'R'

Iteration 8: i=7, ch='k'
   lowerName2.indexOf('k') = 4 (NOT found) → print '+'

Final output:
N+w+Y+r+

6. Why did we use toLowerCase() on both strings?
   - Because name2 has uppercase letters (N, Y) and name1 has lowercase.
   - toLowerCase() makes both strings consistent so comparison works correctly.

7. Why did we print name1.charAt(i) and not lowerName1.charAt(i)?
   - We want to print the original case of name1 (capital letters).
   - lowerName1 was only used for easy comparison.

8. Important points to remember:
   - indexOf(ch) returns -1 if character not found.
   - indexOf(ch) returns position (0,1,2...) if character found.
   - We always use lowercase version when comparing because we lower-cased both strings.
   - This is the standard way to check if a character exists in a string in Java.

End of explanation
*/