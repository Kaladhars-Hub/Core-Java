package basics.Strings.Exaamples;

public class StringEx9 {

    public static void main(String[] args) {

        String name = "JavaProgramming";

        System.out.println(name.substring(0,4));
    }
}

/*

### STRING-09 — Extract a specific part

Given:

```java
String name = "JavaProgramming";
```

Your task:

**Print only `Java`.**

Use `substring(startIndex, endIndex)`.

You already know `J` is at index `0`. You now need to determine the **end index** based on the rule we just learned, then write the code yourself.

 */

/*

name.substring(startIndex, endIndex)

It extracts characters from startIndex up to, but NOT including, endIndex.

So the 4 means: stop before index 4.
 */