package Lambdas;

public class Mathlink {
    public static void main(String[] args) {

        MathOperation add = (a, b) ->      a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        // Call each lambda with 20 and 5, then print its result.

        System.out.println(add.operate(20,  5));
        System.out.println(subtract.operate(20,  5));
        System.out.println(multiply.operate(20,  5));
        System.out.println(division.operate(20,  5));

        }

    }






/*
 ============================================================
 TOPIC: MATH OPERATION USING LAMBDA EXPRESSIONS
 ============================================================

 GOAL:
 Create four lambda expressions to perform:
 1. Addition
 2. Subtraction
 3. Multiplication
 4. Division

 All four operations will use the SAME interface.


 ============================================================
 STEP 1: CREATE THE INTERFACE
 ============================================================

 The MathOperation interface defines a method called operate().

 int operate(int a, int b);

 - int before operate means the method returns an integer.
 - int a and int b are the two input numbers.
 - The interface tells us WHAT method must be implemented,
   but it does not specify HOW the calculation is performed.

 Since MathOperation has only one abstract method,
 it is called a FUNCTIONAL INTERFACE.


 ============================================================
 STEP 2: CREATE THE LAMBDA EXPRESSIONS
 ============================================================

 We create four variables of type MathOperation:

 add      -> performs addition
 subtract -> performs subtraction
 multiply -> performs multiplication
 division -> performs division

 Example:

 MathOperation add = (a, b) -> a + b;

 - MathOperation is the interface type.
 - add is the variable holding the lambda expression.
 - (a, b) represents the two input parameters.
 - -> separates the parameters from the calculation.
 - a + b performs the addition.

 Java understands that a and b are integers because
 the interface declares operate(int a, int b).

 IMPORTANT:
 We can use the same interface for all four lambdas.
 Only the calculation changes.

 Since each lambda contains a single expression,
 Java automatically returns the calculated result.
 We do not need curly braces or the return keyword.


 ============================================================
 STEP 3: CALL THE OPERATIONS
 ============================================================

 add.operate(20, 5);

 - Calls the operate() method represented by the add lambda.
 - Passes 20 as a and 5 as b.
 - Calculates 20 + 5 and returns 25.

 The same process happens for subtraction, multiplication
 and division, using their respective lambda expressions.

 System.out.println() displays each returned result.


 ============================================================
 STEP 4: UNDERSTAND THE OUTPUT
 ============================================================

 Addition:
 20 + 5 = 25

 Subtraction:
 20 - 5 = 15

 Multiplication:
 20 * 5 = 100

 Division:
 20 / 5 = 4

 Expected output:

 25
 15
 100
 4


 ============================================================
 MAIN CONCEPT TO REMEMBER
 ============================================================

 ONE INTERFACE + DIFFERENT LAMBDAS = DIFFERENT BEHAVIOURS

 The interface defines the common method.
 Each lambda provides its own implementation.
 We choose which behaviour to execute by calling
 operate() through the corresponding variable.

 This is one of the basic ideas behind functional
 programming in Java.

Quick revision tip:

Remember this simple pattern:
MathOperation — defines the method.
(a, b) -> a + b — implements the method using addition.
add.operate(20, 5) — executes that implementation and returns the result.
*/

