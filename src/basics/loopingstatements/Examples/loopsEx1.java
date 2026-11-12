package basics.loopingstatements.Examples;

public class loopsEx1 {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
    }
    }
}




/*

# LOOP-01 — Print Numbers

Write a Java program that prints the numbers:

```text
1
2
3
4
5
6
7
8
9
10
```

### Your task

**1. What exactly needs to be repeated?**

**2. How many times should it happen?**

**3. What should change each time it repeats?**


Starting value: 1
After each repetition: move to the next number → 1 → 2 → 3 → ...
Ending value: 10

So your plain-English logic is:

Start from 1, repeat the action, increase the number by 1 each time, and stop when the number reaches 10.

A for loop puts the three things together:

Where do I start?
When do I stop?
How do I change the value?

That's why for is usually cleaner for this situation.

Conceptually: START → CHECK → DO WORK → UPDATE → CHECK → DO WORK → UPDATE...

 */