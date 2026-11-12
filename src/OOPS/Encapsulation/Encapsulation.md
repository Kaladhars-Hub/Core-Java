/*
==========================
Encapsulation Notes
==========================

1. private int balance;
    - The 'balance' variable is private, so it cannot be accessed
      directly from outside the class.

2. setBalance()
    - The setter method is used to update the balance.
    - It provides controlled access by validating the value before
      storing it.

3. this.balance = balance;
    - 'this.balance' refers to the instance (class) variable.
    - 'balance' refers to the method parameter.
    - The 'this' keyword is used to distinguish the instance variable
      from the parameter when both have the same name.

4. getBalance()
    - The getter method is used to read the value of the private variable.
    - It provides controlled (read-only) access to the data.

Why use Encapsulation?
----------------------
✔ Protects data from unauthorized or direct access.
✔ Allows validation before updating data.
✔ Improves security and maintainability.
✔ Provides controlled access through getter and setter methods.

Definition:
Encapsulation is the process of wrapping data (variables) and methods
into a single unit (class) while restricting direct access to the data
using the private access modifier.
*/