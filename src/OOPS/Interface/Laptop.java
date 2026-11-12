package OOPS.Interface;

public interface Laptop {

    // Abstract methods
    // These are the common features that every laptop should have.
    // We only declare the methods here.
    // We do not write the implementation (code) here.

    void copy();

    void paste();

    void cut();

    void keyboard();

    // Default Method (Java 8)
    // A default method already contains implementation.
    // Any class implementing this interface can use this method directly.
    // If required, the implementing class can also override it
    // and provide its own implementation.

    default void security() {
        commonCode();
        System.out.println("Default security");
    }

    // Static Method (Java 8)
    // A static method belongs to the interface itself.
    // It is called using the interface name.
    // Example:
    // Laptop.audio();

    static void audio() {
        commonCode();
        System.out.println("Laptop audio");
    }

    // Private Static Method (Java 9)
    // This method is used only inside the interface.
    // It contains common code that can be shared by
    // default and static methods.
    // This avoids writing the same code multiple times.

    private static void commonCode() {
        System.out.println("CommonCode");
    }
}

/*
-------------------------------- NOTES --------------------------------

What are we doing here?

1. We created an interface named Laptop.

2. The interface acts like a business document or contract.

3. It tells every laptop manufacturer which features must be available.

4. The interface only defines WHAT should be present.
   It does not explain HOW those features should work.

5. Every class that implements this interface must implement:
      - copy()
      - paste()
      - cut()
      - keyboard()

6. We created three implementing classes:
      - Lenovo
      - HP
      - Apple

   These classes represent different laptop manufacturers.

7. Each class provides its own implementation of the methods.
   For example:
      Lenovo -> Lenovo copy code
      HP      -> HP copy code
      Apple   -> Apple copy code

8. An implementing class can also add its own extra methods.
   Example:
      HP -> printing()
      Lenovo -> capture()

9. Default Method:
   Used when we want to add a new feature to the interface
   without forcing every implementing class to write that method.
   Classes can use the default implementation or override it.

10. Static Method:
    Belongs to the interface.
    It is called using the interface name.
    Example:
        Laptop.audio();

11. Private Static Method:
    Used only inside the interface.
    It stores common code so we don't repeat the same code
    in multiple methods.

Remember:

Interface = Rules (What to do)

Implementing Class = Actual Code (How to do it)

*/