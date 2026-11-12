package basics.Strings.Exaamples;

public class StringEx22 {

    public static void main(String[] args) {

        String name = "Java is easy and Java is powerful";

        String[] words = name.split(" ");

        int count = 0;

        for(String word : words) {
            if(word.equals("Java")) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}





/*
### STRING-22 — Count a specific word

Let's use `split()` again, but with a different purpose.

Given:

```java
String name = "Java is easy and Java is powerful";
```

Your task is to count how many times the word **`"Java"`** appears.

Expected output:

```text
2
```

### Think about it

After `split(" ")`, the array will contain:

```text
Java
is
easy
and
Java
is
powerful
```

You need to:

1. Go through each word.
2. Check whether the current word is `"Java"`.
3. If it is, increase the count.
4. Print the final count.

You already know all the concepts needed: `split()`, `String[]`, `for-each`, `equals()`, and a counter.

 */