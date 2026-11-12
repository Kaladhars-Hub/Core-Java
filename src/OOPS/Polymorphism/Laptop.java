package OOPS.Polymorphism;

// Laptop is an interface.
//
// It defines a rule/contract that every class
// implementing Laptop must follow.
//
// Any class that implements Laptop must provide
// an implementation for copy().

public interface Laptop {

    // Abstract method.
    // The interface tells us WHAT should be done,
    // but does not provide the implementation here.

    void copy();
}
