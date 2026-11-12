package basics.ExceptionHandling.Examples;

public class ExceptionEX1 {

    public static void main(String[] args) {

        try {
            int a = 20;
            int b = 0;

            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Program completed");
    }
}

/*

Execution flow
1. Java enters try
   It assigns a = 20 and b = 0.
2. Java attempts a / b
   Integer division by zero throws an ArithmeticException. The remaining code in try is skipped.
3. Java enters the matching catch
   It prints Cannot divide by zero.
4. Java executes finally
   It prints Finally block executed.
5. Normal execution continues after the blocks
   It prints Program completed.

Expected output:
Cannot divide by zero
Finally block executed
Program completed

 */