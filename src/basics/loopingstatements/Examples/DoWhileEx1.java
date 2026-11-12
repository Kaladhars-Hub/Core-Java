package basics.loopingstatements.Examples;

public class DoWhileEx1 {

    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println(i);
            i++;
        }
        while( i <= 5);
    }
}


/*

### DO-WHILE-01 — Print numbers 1 to 5

Use a **`do-while` loop** to print:

```text
1
2
3
4
5
```

1. What should the starting value be?
2. What condition should control when the loop stops?
3. What should happen to the value after each repetition?

Your **`do-while` code is fully correct**.

Your understanding is also correct:

* `i` starts at `1`.
* The `do` block executes first.
* `i` is printed.
* `i` increases by `1`.
* Then `i <= 5` is checked.
* When `i` becomes `6`, the condition is false and the loop stops.

Output:

```text
1
2
3
4
5
```

 */