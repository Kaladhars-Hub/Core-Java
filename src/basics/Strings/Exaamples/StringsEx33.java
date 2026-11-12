package basics.Strings.Exaamples;

public class StringsEx33 {

    public static void main(String[] args) {

        int uppercase = 0;
        int lowercase = 0;
        int digits = 0;
        int special = 0;

        String name = "JavA5is&Su6p%eR";

        for(int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isUpperCase(ch)) {
                uppercase++;
            } else if (Character.isLowerCase(ch)) {
                lowercase++;
            } else {
                special++;

            }
        }
        System.out.println(digits);
        System.out.println(uppercase);
        System.out.println(lowercase);
        System.out.println(special);
    }
}


/*

STRING-33 — Count Uppercase, Lowercase, Digits, and Special Characters

Given:
String name = "JavA5is&Su6p%eR";

What the program does:
- Goes through the String one character at a time using a for loop.
- Stores the current character in:
  char ch = name.charAt(i);

Then checks:
- Character.isDigit(ch)     → digits++
- Character.isUpperCase(ch) → uppercase++
- Character.isLowerCase(ch) → lowercase++
- else                      → special++

Why does else count special characters?
Because if the character is not a digit, uppercase letter, or lowercase letter,
whatever is left comes under the final else block.

Important:
- ++ increases the counter by 1.
- Counting happens inside the loop.
- Final counter values should be printed after the loop.

Example:
'J' → uppercase
'a' → lowercase
'5' → digit
'&' → special

*/