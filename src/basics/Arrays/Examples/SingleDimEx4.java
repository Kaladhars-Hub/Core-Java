package basics.Arrays.Examples;

public class SingleDimEx4 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        for(int number : numbers) {
            System.out.println(number);
        }

    }
}


/*

### ARRAY-04 — Print all array elements

Now let's combine the two things you've learned:

* array indexes
* `for` loop

Given:

```text
10, 20, 30, 40, 50
```

Print every element:

```text
10
20
30
40
50
```

**Don't use five separate `System.out.println()` statements.**

### Explanation:

Yes — your code is **correct**, and the output is exactly what we wanted:

```text
10
20
30
40
50

That's actually useful information for us: you have now encountered **`for-each` in a real array problem**, which is why your instructor included `for-each` in the syllabus.

Your code:

```java
for(int number : numbers) {
    System.out.println(number);
}
```

means:

> Take each value from the `numbers` array, one at a time, put that value into `number`, and print it.

So it goes:

```text
number = 10 → print 10
number = 20 → print 20
number = 30 → print 30
number = 40 → print 40
number = 50 → print 50
```
for → gives you the index
for-each → gives you the value directly

 */
