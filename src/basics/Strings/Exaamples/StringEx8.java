package basics.Strings.Exaamples;

public class StringEx8 {

    public static void main(String[] args) {

        String name = "HelloWorld";

        System.out.println(name.substring(5));
    }
}





/*

### Next: STRING-08 — Extract part of a String

This introduces an important String method: **`substring()`**.

Given:

```java
String name = "HelloWorld";
```

We want to print only:

```text
World
```

**Question:** From the String `"HelloWorld"`, what is the **index of the first `W`**?


 */

//Because index 5 is W, and there is no ending index specified, Java takes everything from W to the end.