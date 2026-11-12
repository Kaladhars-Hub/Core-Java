package OOPS.Abstract;

public abstract class SampleAbstractClass implements Laptop {

    public void copy() {
        System.out.println("Copy Code");
    }

    public void paste() {
        System.out.println("Paste Code");
    }

    public abstract void cut();

    public abstract void keyboard();
    }

// SampleAbstractClass
// Implements the common methods (copy and paste).
// Leaves the remaining methods (cut and keyboard) for child classes.
// This demonstrates partial implementation.