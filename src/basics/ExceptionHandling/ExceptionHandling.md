
Absolutely. I’d keep this as a **separate `ExceptionHandling-Part1.md` file** under your Basics folder. I’ve organized it from the basic idea → keywords → flow → hierarchy → complete example → revision notes.

# Exception Handling — Part 1

## 1. What is an Exception?

An **exception** is a problem that occurs while a Java program is running and interrupts the normal flow of the program.

### Example

```java
int a = 10;
int b = 0;

System.out.println(a / b);
```

Java cannot divide an integer by zero.

So when the program runs:

```text
10 / 0
   ↓
ArithmeticException
   ↓
Normal program flow is interrupted
```

---

# 2. What is Exception Handling?

**Exception handling** is a way of handling problems that may occur while the program is running.

Without exception handling:

```java
System.out.println(10 / 0);

System.out.println("Hello");
```

The program stops when the exception occurs.

With exception handling:

```java
try {
    System.out.println(10 / 0);
}
catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}

System.out.println("Hello");
```

Output:

```text
Cannot divide by zero
Hello
```

The exception was handled, so the program was able to continue.

---

# 3. What are `try`, `catch`, and `finally`?

`try`, `catch`, and `finally` are **blocks of code** used for exception handling.

They are NOT:

* Methods
* Variables
* Data types
* Constructors
* Classes

They are simply **exception-handling blocks**.

Just like we have:

```java
if (condition) {
    // block
}
else {
    // block
}
```

we also have:

```java
try {
    // block
}
catch (...) {
    // block
}
finally {
    // block
}
```

---

# 4. What is the `try` block?

The `try` block contains the code that **may cause an exception**.

```java
try {
    System.out.println(10 / 0);
}
```

Simple meaning:

> "Try to execute this code. Something may go wrong here."

---

# 5. What is the `catch` block?

The `catch` block is used to **handle the exception** that occurs inside the `try` block.

```java
try {
    System.out.println(10 / 0);
}
catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

Simple flow:

```text
try
 ↓
Exception occurs
 ↓
catch
 ↓
Exception is handled
```

Real-life example:

```text
Someone throws a ball
        ↓
You catch the ball
```

In Java:

```text
Exception is thrown
        ↓
catch block handles it
```

---

# 6. What is `e` in `catch`?

Consider:

```java
catch (ArithmeticException e)
```

Here:

```text
ArithmeticException → type
e                   → reference variable
```

This is similar to:

```java
Student s = new Student();
```

where:

```text
Student → type
s       → reference variable
```

Similarly:

```java
ArithmeticException e
```

means that `e` is a reference variable referring to the exception object.

---

# 7. What is the `finally` block?

The `finally` block contains code that **normally executes after the `try`/`catch` process**.

Example:

```java
try {
    System.out.println(10 / 2);
}
catch (ArithmeticException e) {
    System.out.println("Exception occurred");
}
finally {
    System.out.println("Finally block");
}
```

Output:

```text
5
Finally block
```

If an exception occurs:

```java
try {
    System.out.println(10 / 0);
}
catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
finally {
    System.out.println("Finally block");
}
```

Output:

```text
Cannot divide by zero
Finally block
```

### Important

`finally` does NOT necessarily mean the entire program ends.

Code can execute after `finally`:

```java
try {
    System.out.println(10 / 0);
}
catch (ArithmeticException e) {
    System.out.println("Handled");
}
finally {
    System.out.println("Finally");
}

System.out.println("Program continues");
```

Output:

```text
Handled
Finally
Program continues
```

So:

> `finally` is the final block in the try/catch/finally structure, not necessarily the end of the entire program.

`finally` is commonly used for cleanup work such as closing resources.

---

# 8. What is `throw`?

`throw` is used to **manually throw an exception**.

Example:

```java
if (balance < 0) {
    throw new IllegalArgumentException("Balance cannot be negative");
}
```

Here we are telling Java:

> "This condition is not valid, so throw an exception."

Flow:

```text
Condition is true
      ↓
throw
      ↓
Exception is created
      ↓
Exception is sent
```

### Important

`throw` does NOT mean:

> "Throw the code back to Java."

It means:

> **"Throw an exception at this point."**

---

# 9. What is `throws`?

`throws` is used in a **method declaration**.

It tells the caller that the method **may throw an exception**.

Example:

```java
public void readFile() throws IOException {
    // file reading code
}
```

Here:

```java
throws IOException
```

means:

> "This method may produce an IOException."

The method is basically telling the caller:

> "I am not handling this exception here. You need to deal with it."

---

# 10. Difference Between `throw` and `throws`

This is an important interview question.

### `throw`

Used to **actually throw an exception**.

```java
throw new IllegalArgumentException();
```

### `throws`

Used in a **method declaration** to tell the caller that the method may throw an exception.

```java
public void test() throws IOException {
}
```

### Easy way to remember

```text
throw
  ↓
Actually throws the exception

throws
  ↓
Declares that the method may throw an exception
```

---

# 11. Checked Exceptions

A **checked exception** is an exception that Java checks during compilation.

Java basically tells us:

> "You need to handle this exception or declare it."

Examples:

```text
IOException
SQLException
FileNotFoundException
```

For example, file operations can have problems:

```text
File does not exist
File cannot be opened
File cannot be read
```

Java expects these possibilities to be handled or declared.

---

# 12. Unchecked Exceptions

An **unchecked exception** is an exception that occurs during runtime and Java does not force us to handle or declare it during compilation.

Examples:

```text
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException
```

Example:

```java
int a = 10;
int b = 0;

System.out.println(a / b);
```

Java allows the code to compile.

But when the program runs:

```text
ArithmeticException
```

occurs.

Unchecked exceptions are under:

```text
RuntimeException
```

---

# 13. Checked vs Unchecked

```text
Exception
    |
    |----------------------|
    ↓                      ↓
Checked              RuntimeException
Exceptions                 ↓
                      Unchecked
```

### Checked

```text
Checked during compilation
Usually needs to be handled or declared
Examples:
IOException
SQLException
FileNotFoundException
```

### Unchecked

```text
Occurs during runtime
Java does not force us to handle or declare it
Examples:
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException
```

---

# 14. Exception Hierarchy

The important Java hierarchy is:

```text
Object
   ↓
Throwable
   ├── Exception
   │      ↓
   │   RuntimeException
   │      ├── ArithmeticException
   │      ├── NullPointerException
   │      └── ArrayIndexOutOfBoundsException
   │
   └── Error
```

### Important relationships

```text
Object
   ↓
Throwable
   ↓
Exception
   ↓
RuntimeException
   ↓
ArithmeticException
```

So:

```java
ArithmeticException
```

has this parent chain:

```text
ArithmeticException
        ↓
RuntimeException
        ↓
Exception
        ↓
Throwable
        ↓
Object
```

---

# 15. `Throwable` — Important Point

`Throwable` is the main parent of:

```text
Exception
Error
```

So:

```text
Throwable
├── Exception
└── Error
```

`Exception` is therefore a child of `Throwable`.

### Interview point

If asked:

> "What is the superclass of Exception?"

Answer:

```text
Throwable
```

If asked:

> "What is the superclass of ArithmeticException?"

Answer:

```text
RuntimeException
```

However, many interview questions commonly focus on `Exception`, so understand the complete hierarchy rather than memorizing only one answer.

---

# 16. `Throwable` and `Serializable`

`Throwable` extends `Object`.

It also implements the `Serializable` interface.

So these are two different relationships:

```text
Class inheritance:

Object
   ↓
Throwable
```

and:

```text
Interface implementation:

Throwable implements Serializable
```

A Java class can have a parent class and also implement interfaces.

For example:

```java
class Student extends Person implements Serializable {
}
```

So implementing an interface does not prevent a class from extending another class.

---

# 17. How to Verify the Exception Hierarchy in IntelliJ

You don't have to simply memorize the hierarchy.

You can open the Java class in IntelliJ and check the `extends` relationship.

For example, when you go to `ArithmeticException`, you can see that it extends:

```text
RuntimeException
```

Then `RuntimeException` extends:

```text
Exception
```

Then `Exception` extends:

```text
Throwable
```

Then `Throwable` extends:

```text
Object
```

So you can verify the hierarchy yourself.

---

# 18. What is `printStackTrace()`?

Suppose we have:

```java
catch (ArithmeticException e) {
    e.printStackTrace();
}
```

`e` refers to the exception object.

`printStackTrace()` prints detailed information about:

* What exception occurred
* The exception message
* Where the exception occurred
* The method calls that led to the exception

Example output:

```text
java.lang.ArithmeticException: / by zero
    at OOPS.ExceptionHandling.User.main(User.java:10)
```

The exact output depends on your code.

### Simple meaning

> `e.printStackTrace()` helps us understand where and why an exception occurred.

---

# 19. Why can we use `e.printStackTrace()`?

Because:

```java
catch (ArithmeticException e)
```

means `e` refers to an `ArithmeticException` object.

`ArithmeticException` inherits methods from its parent classes.

One of the available methods is:

```java
printStackTrace()
```

Therefore:

```java
e.printStackTrace();
```

means:

> "Exception object `e`, show me the details about this exception."

---

# 20. Complete Example — try, catch, finally, throw and throws

```java
package OOPS.ExceptionHandling;

public class User {

    // 'throws' tells the caller:
    // "This method may throw an IllegalArgumentException."
    public static void checkBalance(int balance)
            throws IllegalArgumentException {

        // 'throw' is used to manually throw
        // an exception when our condition is not valid.
        if (balance < 0) {

            throw new IllegalArgumentException(
                    "Balance cannot be negative"
            );
        }

        System.out.println("Valid balance: " + balance);
    }

    public static void main(String[] args) {

        try {

            // Calling the method that has 'throws'.
            checkBalance(-50);

        }
        catch (IllegalArgumentException e) {

            // 'catch' handles the exception.
            System.out.println("Exception handled");

            // Shows detailed information about
            // the exception and where it occurred.
            e.printStackTrace();

        }
        finally {

            // 'finally' executes after the
            // try/catch process.
            System.out.println("Finally block executed");
        }

        // Code can continue after finally.
        System.out.println("Program continues");
    }
}
```

---

# 21. Complete Flow of the Example

When Java starts:

```text
main()
   ↓
try block
   ↓
checkBalance(-50)
   ↓
Method has 'throws'
   ↓
balance < 0
   ↓
'throw' executes
   ↓
IllegalArgumentException is thrown
   ↓
catch block receives it
   ↓
e refers to the exception object
   ↓
e.printStackTrace()
   ↓
finally block executes
   ↓
Program continues
```

### In simple words:

```text
try
↓
"Try this code"

throw
↓
"Something is wrong, throw an exception"

catch
↓
"Catch and handle that exception"

finally
↓
"Do the final/cleanup work"

Code after finally
↓
"Program can continue"
```

---

# 22. The Five Important Keywords/Blocks

| Keyword / Block | Simple Meaning                                |
| --------------- | --------------------------------------------- |
| `try`           | Contains code that may cause an exception     |
| `catch`         | Handles the exception                         |
| `finally`       | Runs after try/catch processing               |
| `throw`         | Manually throws an exception                  |
| `throws`        | Declares that a method may throw an exception |

---

# 23. Important Things to Remember

### `try`, `catch`, and `finally`

These are:

> **Blocks used for exception handling.**

They are not methods, variables, classes, constructors, or data types.

### `throw`

> Actually throws an exception.

### `throws`

> Declares that a method may throw an exception.

### `e`

```java
catch (ArithmeticException e)
```

`e` is a **reference variable** referring to the exception object.

### `printStackTrace()`

> Shows detailed information about the exception and where it occurred.

### `finally`

> Does not necessarily mean the entire program ends. Code can execute after it.

---

# 24. Quick Revision Flow

```text
                    Exception Handling
                           |
        -----------------------------------------
        |                  |                    |
      Handle            Throw                Hierarchy
        |                  |                    |
  try/catch/finally    throw / throws       Throwable
                                             /      \
                                      Exception     Error
                                          |
                                  RuntimeException
                                          |
                          ------------------------------
                          |             |               |
                    Arithmetic     NullPointer    ArrayIndexOutOfBounds
```

---

# 25. One-Line Definitions for Revision

**Exception:**
A problem that occurs during program execution and interrupts the normal flow.

**Exception Handling:**
A way to handle exceptions so the program can respond properly.

**try:**
Contains code that may cause an exception.

**catch:**
Handles the exception.

**finally:**
Contains code that normally executes after try/catch processing.

**throw:**
Used to manually throw an exception.

**throws:**
Used in a method declaration to tell the caller that the method may throw an exception.

**Checked Exception:**
An exception that Java checks during compilation and normally requires handling or declaration.

**Unchecked Exception:**
An exception under `RuntimeException` that occurs during runtime and is not forced to be handled or declared.

**Throwable:**
The main parent of `Exception` and `Error`.

**printStackTrace():**
Displays detailed information about the exception and where it occurred.

---

# 26. Easy Memory Trick

```text
try     → Try the code
catch   → Catch the problem
throw   → Throw the exception
throws  → Tell that it may throw
finally → Final/cleanup block
```

### Most important flow to remember:

```text
try
 ↓
Exception occurs
 ↓
catch handles it
 ↓
finally executes
 ↓
program can continue
```