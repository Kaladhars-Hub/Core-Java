package basics.loopingstatements.Examples;

public class WhileEx2 {

    public static void main(String[] args) {

        int i = 2;
        while(i <= 10) {
                System.out.println(i);
                i = i + 2;
            }
        }
    }


/*

### WHILE-02 — Print even numbers from 2 to 10

Use a **`while` loop** to print:

```text
2
4
6
8
10
```

1. What number should you start with?
2. What should the stopping condition be?
3. How should the number change after each repetition?

### Explanation:

Your `while` loop is working exactly as required.

* Starts at `2`
* Continues while `i <= 10`
* Prints the current value
* Increases by `2`, so it visits only the even numbers

Output:

```text
2
4
6
8
10
```

 */