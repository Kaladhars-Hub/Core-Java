package OOPS.Polymorphism;

// HP also implements the Laptop interface.
//
// HP must also provide its own implementation
// of the copy() method.

public class HP implements Laptop{

    @Override
    public void copy() {


        // HP has its own implementation.
        System.out.println("HP copy");
    }
}
