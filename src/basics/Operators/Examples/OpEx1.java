/*
System.out.println(10 + 20 + "Java");
```

Your answer:

        > `30 Java` ✅

Correct.

Java evaluates from **left to right**:

        ```text
10 + 20
        ↓
        30

        30 + "Java"
        ↓
        "30Java"
        ```

So technically the output is:

        ```text
30Java
```

There is **no space** unless you put one in the string.

So your understanding was right, just missing the exact spacing.

---

        ### B

```java
System.out.println("Java" + 10 + 20);
```

You answered:

        > `Java 30` ❌

This is the important one.

Java starts with:

        ```text
"Java"
        ```

That's already a `String`.

So:

        ```text
"Java" + 10
        ↓
        "Java10"
        ```

Then:

        ```text
"Java10" + 20
        ↓
        "Java1020"
        ```

Therefore:

        ```text
        Java1020
```

        **Not `Java30`.**

        ---

        ### C

```java
System.out.println("Total: " + (10 + 20));
        ```

Your answer:

        > `Total : 30` ✅

Correct.

The parentheses force Java to calculate:

        ```text
10 + 20
        ↓
        30
        ```

before joining it with the String:

        ```text
"Total: " + 30
        ↓
        "Total: 30"
        ```

        ---

        # 🔑 Write this in your notebook

This is worth remembering:

        > **`+` performs addition when both sides are numbers.**

        > **Once Java encounters a String, `+` performs String concatenation from that point onward.**

And:

        > **Parentheses can force the numerical calculation to happen first.**

For example:

        ```java
"Total: " + (10 + 20)
        ```

        → `Total: 30`

        while:

        ```java
"Total: " + 10 + 20
        ```

        → `Total: 1020`

        ---
*/