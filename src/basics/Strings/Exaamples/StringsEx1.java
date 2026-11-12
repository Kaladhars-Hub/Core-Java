package basics.Strings.Exaamples;

public class StringsEx1 {

    public static void main(String[] args) {

        String name = "Java";

        for(int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}
/*

### STRING-01 — Print each character

Given:

```java
String name = "Java";
```

Your task is to print each character on a separate line:

```text
J
a
v
a
```

You already know:

* `length()` gives the number of characters.
* `charAt(index)` gives the character at a particular index.
* `for` loops.

### Think before coding

You need to:

1. Start from the first String index.
2. Continue until you reach the end of the String.
3. Get the character at the current index.
4. Print it.

/*

Given:
String name = "Java";

We want to print every character one by one:
J
a
v
a

This is different from 2D arrays because:
- We are working with a String (which is like a 1D array of characters)
- We use .charAt(i) to get the character at a specific position
- We use a normal for loop with index (not for-each, because String is not an array in the same way)

Step-by-step explanation (super simple for beginners):

1. Creating the String
   String name = "Java";
   - "Java" is a String (sequence of characters)
   - name is the variable that holds this text
   - Strings are treated like arrays in Java (we can access each character)

2. Initializing the index
   int i = 0;
   - This is the counter variable
   - It starts at 0 (first character)
   - We need this because Strings are not directly like int[] arrays

3. First for loop (the main loop)
   for(int i = 0; i < name.length(); i++) {
   - This loop runs for every character in the string
   - i < name.length() = "stop when we reach the end of the string"
   - i++ = increase i by 1 after each character (like 0, 1, 2, 3...)
   - First time: i = 0
   - Second time: i = 1
   - Third time: i = 2
   - Fourth time: i = 3 (string ends, loop stops)

4. Inside the loop: Get character
   System.out.println(name.charAt(i));
   - charAt(i) = "get the character at position i"
   - i = 0 → first character 'J'
   - i = 1 → second character 'a'
   - i = 2 → third character 'v'
   - i = 3 → fourth character 'a'
   - This is how we access each character one by one

5. What happens (visual walkthrough)

i = 0: name.charAt(0) = 'J' → prints J
i = 1: name.charAt(1) = 'a' → prints a
i = 2: name.charAt(2) = 'v' → prints v
i = 3: name.charAt(3) = 'a' → prints a

6. Why we use this method
- Strings in Java are like arrays but we cannot use for-each directly
- We use index + charAt() to visit each character
- This is the standard way to loop through a String in Java

Output of this code:
J
a
v
a

*/