package basics.Strings.Exaamples;

public class StringsEx5 {

    public static void main(String[] args) {

        String name = "Java Programming";

        int count = 0;

        for(int i = 0; i < name.length(); i++) {

            if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}

/*
### STRING-05 — Count vowels

Given:

```java
String name = "Java Programming";
```

Write a program to count how many vowels are present in the String.

For this problem, consider only:

`a, e, i, o, u`

You need to check the String character by character.

 */

/*

|| means OR.

So Java reads your condition as:

Is the current character a OR e OR i OR o OR u?

 */