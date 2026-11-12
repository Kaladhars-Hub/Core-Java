package basics.Strings.Exaamples;

public class StringEx27 {

    public static void main(String[] args) {

        String value = "Java Programming";

        System.out.println(value.replace(" ", ""));
    }
}

/*

To remove a character using replace(), we need to replace it with an empty String — meaning a String containing zero characters.

For example, conceptually:

space → nothing

In Java, an empty String is:

""

Notice the difference:

" "  → one space character
""   → zero characters

So the operation means:

Replace every space with an empty String.

 */

/*
Yes. ✅ This is exactly correct.

```java
String value = "Java Programming";

System.out.println(value.replace(" ", ""));
```

Output:

```text
JavaProgramming
```

### 🟢 STRING-28 — Independent

I'm marking this **Independent** because I taught you the new idea first:

* `" "` → a String containing **one space**
* `""` → an **empty String**, containing zero characters
* `replace(" ", "")` → replace every space with nothing

Then **you formed the actual Java statement yourself**.

### One important thing to notice

You used:

```java
replace(" ", "")
```

Both are Strings:

```text
" " → one space
""  → empty String
```

That's different from your previous problem:

```java
replace('a', 'o')
```

where both were individual `char` values.

So now you have seen both forms of `replace()` in actual practice:

```text
replace(char, char)
replace(String, String)
```

 */