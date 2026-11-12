package basics.Strings.Exaamples;

public class StringsEx4 {

    public static void main(String[] args) {

        String name = "Java";

        boolean found = false;

        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) == 'v') {
                found = true;

                if (found) {
                    System.out.println("Found");
                } else {
                    System.out.println("Not Found");
                }
            }
        }
    }
}


/*
### STRING-04 — Find a specific character

This problem similar to singleDimensional Array - 11

Given:

```java
String name = "Java";
```

Write a program to check whether the character **`v`** is present in the String.

If it is present, print:

```text
Found
```

If it is not present, print:

```text
Not Found
```

 */

/*

Important points:

found = false → initially assume v is not present.
name.charAt(i) == 'v' → checks each character.
found = true → when v is found.
break → stops searching because we already found it.
The final if(found) is outside the loop, so "Found" or "Not Found" is printed only once.

 */