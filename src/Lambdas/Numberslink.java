package Lambdas;

public class Numberslink {

    public static void main(String[] args) {

        Numbers n = (a, b) -> a + b; {
            System.out.println(n.add(10, 20));
        }
    }
}


/*
Lambda with a Return Type:

Style 1: single expression (no braces, no return)

When the body is one expression, Java automatically returns its result.
You don’t write return.

 */

/*
Style 2: with braces (you must write return)

Calculator c = (a, b) -> {
    int sum = a + b;
    return sum;
};

Use this when the body needs more than one line.
 */

/*
These are wrong:

(a, b) -> return a + b;        // ❌ return without braces
(a, b) -> { a + b };           // ❌ braces without return

These are correct:

(a, b) -> a + b;               // ✅
(a, b) -> { return a + b; };   // ✅

 */