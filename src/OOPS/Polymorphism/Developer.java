package OOPS.Polymorphism;

// Developer is the child class of Guest.
//
// Developer inherits read() from Guest,
// but provides its own implementation of read().
//
// This is called Method Overriding.
//
// Method Overriding is used to achieve
// Runtime Polymorphism.

public class Developer extends Guest {

    // @Override tells Java that we are overriding
    // the read() method from the parent class.
    //
    // @Override is not mandatory,
    // but it helps Java detect mistakes.

    @Override
    public void read() {
        System.out.println("Developer reads");
    }
}
