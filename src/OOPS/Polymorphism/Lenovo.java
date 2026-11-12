package OOPS.Polymorphism;

public class Lenovo implements Laptop{

    @Override
    public void copy() {

        // Lenovo provides its own implementation
        // of the copy() method.

        System.out.println("Lenovo copy");
    }
}
