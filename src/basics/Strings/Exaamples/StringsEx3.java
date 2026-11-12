package basics.Strings.Exaamples;

public class StringsEx3 {

    public static void main(String[] args) {

        int count = 0;

        String name = "Jesus";

        for(int i = 0; i <name.length(); i++) {
            if(name.charAt(i) == 's') {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}


/*
STRING-03 - Count the Number of 's' in a String

Given:
String name = "Jesus";

We want to count how many times the letter 's' appears in the string.


Step-by-step explanation (super simple for beginners):

1. Creating the String
   String name = "Jesus";
   - "Jesus" is a text (sequence of characters)
   - name is the variable that holds this text

2. Initializing the counter
   int count = 0;
   - This is like a score that starts at zero
   - Every time we find the letter 's', count increases by 1
   - It lives outside the loop so it keeps working across the whole string

3. First for loop (the main loop)
   for(int i = 0; i < name.length(); i++) {
   - This loop runs for every character in the string
   - i = 0, 1, 2, 3, 4, 5 (because "Jesus" has 6 letters)
   - i < name.length() = "stop when we reach the end of the string"
   - i++ = increase i by 1 after each character

4. Inside the loop: Check each character
   if(name.charAt(i) == 's') {
       count = count + 1;
   }
   - charAt(i) = "get the character at position i"
   - This checks: "Is this character equal to 's'?"
   - If YES, we do count = count + 1
   - This line is what actually counts the 's'

5. What happens (visual walkthrough)

i = 0: name.charAt(0) = 'J' == 's'? No
i = 1: name.charAt(1) = 'e' == 's'? No
i = 2: name.charAt(2) = 's' == 's'? Yes → count = 0 + 1 = 1
i = 3: name.charAt(3) = 'u' == 's'? No
i = 4: name.charAt(4) = 's' == 's'? Yes → count = 1 + 1 = 2
i = 5: name.charAt(5) = 's' == 's'? Yes → count = 2 + 1 = 3

6. Final print
   System.out.println(count);
   - Prints the final count AFTER the loop finishes
   - We only print once

Output of this code:
3

Why this works:
- We use for loop with index because Strings are not directly like int[] arrays
- .charAt(i) lets us read each character one by one
- The if condition is how we detect the letter 's'
- count = count + 1 is the "score keeps increasing" trick

*/