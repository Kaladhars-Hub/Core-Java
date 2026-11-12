package basics.Arrays.Examples;

public class SingleDimEx11 {

    public static void main(String[] args) {

        int[] numbers = {10, 25, 7, 42, 18, 30};

        int find = 42;
        boolean found = false;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == find){
                found = true;
            }
        }
        if (found) {
            System.out.println("Found number: " + find);
        }else {
            System.out.println("Number not found");
            }
    }
}





/*
### ARRAY-11 — Search for a Number in an Array

Given:

```java
int[] numbers = {10, 25, 7, 42, 18, 30};
```

Your task:

**Check whether the number `42` exists in the array.**

Expected output:

```text
Found
```
###Understand what is happening:

At the beginning:

boolean found = false;

You're telling Java:

"For now, assume I haven't found the number."

Then the loop checks:

if (numbers[i] == find)

When it reaches 42:

10 == 42 ❌
25 == 42 ❌
7  == 42 ❌
42 == 42 ✅

This executes:

found = true;

Now found remembers:

"Yes, I found it."

After the loop, you check:

if (found)

If found is true:

Found number: 42

If the number doesn't exist, found stays false:

Number not found

The pattern to remember
For a search problem, you can think:

boolean found = false;

for (...) {
    if (something == target) {
        found = true;
    }
}

if (found) {
    // found
} else {
    // not found
}

The important idea is that found is like a little switch:

false → haven't found it
true  → found it

And notice your original line:

System.out.println("Found number: " + find);

should not be outside by itself, because that would print "Found" even when the number doesn't exist. The if/else decides which message to print.

 */