package basics.Strings.Exaamples;

public class StringEx19 {

    public static void main(String[] args) {

        String name = "Java Programming Language";

        String[] words = name.split(" ");

        System.out.println(words.length);
    }
}

/*

### STRING-19 — Count words in a String

You connected three things correctly:

1. `split(" ")` → separates the String into words.
2. `String[] words` → stores those words in an array.
3. `words.length` → tells you how many elements are in that array.

And notice the important distinction:

```java
name.length()    // String → number of characters
words.length     // Array → number of elements
```

 */