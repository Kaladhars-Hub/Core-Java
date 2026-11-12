/*
POLYMORPHISM

Polymorphism means one thing can have many forms.

1. Compile-Time Polymorphism
    - Achieved using Method Overloading.
    - Same method name with different parameters.
    - Java decides which method to use during compilation.

2. Runtime Polymorphism
    - Achieved using Method Overriding.
    - Parent and child have the same method.
    - The actual object decides which method runs.

Example:

Laptop l = new Lenovo();
l.copy();          // Lenovo copy

l = new HP();
l.copy();          // HP copy

Reference type = Laptop
Actual object = Lenovo / HP

The reference type tells us what we can access.
The actual object decides which overridden method runs.
*/