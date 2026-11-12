package basics.loopingstatements.Examples;

public class WhileEx3 {

    public static void main(String[] args) {

        int i = 10;
        while(i >= 1) {
            System.out.println(i);
            i = i -1;
        }
    }
}

/*

### WHILE-03 — Countdown from 10 to 1

Use a **`while` loop** to print:

```text
10
9
8
7
6
5
4
3
2
1
```

1. What value should `i` start with?
2. When should the loop continue?
3. How should `i` change after each repetition?

Your `while` loop is fully correct.

* Starts at `10`
* Continues while `i` is at least `1`
* Prints the current value
* Decreases by `1`
* Stops when `i` becomes `0`

Output is exactly:

```text
10
9
8
7
6
5
4
3
2
1
```

 */
