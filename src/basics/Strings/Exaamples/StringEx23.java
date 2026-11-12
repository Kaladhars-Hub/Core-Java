package basics.Strings.Exaamples;

public class StringEx23 {

    public static void main(String[] args) {

        String name = "Java    Programming";

        name = name.replaceAll(" +", " ");

        System.out.println(name);
    }
}

/*
### New concept: `replaceAll()`

`replaceAll()` can replace **all occurrences** of something that matches a pattern.

For this problem, we want to turn multiple spaces into **one space**.

Example:

```java
String name = "Java    Programming";

name = name.replaceAll(" +", " ");

System.out.println(name);
```

Output:

```text
Java Programming
```

### What does `" +"` mean?

For now, just remember this:

```text
" +" → one or more spaces
```

So:

```java
name.replaceAll(" +", " ")
```

means:

> Find one or more consecutive spaces and replace them with one space.

And notice we used:

```java
name = name.replaceAll(...)
```

because we want to **store the changed String back into `name`**, just like you learned with `trim()` and `replace()`.


 */

/*
One useful distinction to remember:

trim() → removes spaces at the beginning and end
replace() → replaces a specific String/character
replaceAll() → replaces all matching occurrences/patterns

 */