package basics.loopingstatements.Examples;

public class loopsEx8 {

    public static void main(String[] args) {
        for(int i = 20; i >= 2; i = i-2) {
            System.out.println(i);
        }
    }
}


/*

## LOOP-08 — Countdown by 2

Print:

```text
20
18
16
14
12
10
8
6
4
2
```


Think through it yourself:

1. Starting number?
2. Ending number?
3. What happens after each repetition?
4. How many numbers are printed?
5. Which loop would you choose, and why?

And this time, **pay special attention to the condition**. Before writing code, mentally check:

> Starting value → Is the condition true?
> Next value → Is the condition still true?
> ...
> Final value → What happens after it?

 */