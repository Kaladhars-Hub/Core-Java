package OOPS.Abstract;

public class User {

    public static void main(String[] args) {

        // --------------------------------------------------
        // Normal Object Creation - Lenovo
        // --------------------------------------------------

        // Reference type = Lenovo
        // Object type = Lenovo
        // We can access Lenovo's inherited methods
        // as well as its own extra methods.

        Lenovo l = new Lenovo();

        l.copy();
        l.paste();
        l.cut();
        l.keyboard();

        System.out.println("____________");


        // --------------------------------------------------
        // Normal Object Creation - HP
        // --------------------------------------------------

        // Reference type = HP
        // Object type = HP
        // We can access HP's inherited methods
        // as well as HP's own extra methods.


        HP h = new HP();

        h.copy();
        h.paste();
        h.cut();
        h.keyboard();
        h.printing();

        System.out.println("____________");


        // --------------------------------------------------
        // Abstraction using Interface Reference
        // --------------------------------------------------

        // Reference type = Laptop (Interface)
        // Object type = Lenovo
        //
        // We can access only the methods declared
        // in the Laptop interface.
        //
        // The actual implementation is still inside Lenovo.
        // When l1.copy() is called, Lenovo's copy() executes.
        //
        // In IntelliJ, ⌘ + Click / ⌘ + B on copy()
        // takes us to the copy() declaration in Laptop.

        Laptop l1 = new Lenovo();

        l1.copy();
        l1.paste();

        System.out.println("____________");


        // --------------------------------------------------
        // Abstraction using Abstract Class Reference
        // --------------------------------------------------

        // Reference type = SampleAbstractClass
        // Object type = Lenovo
        //
        // copy() is already implemented inside
        // SampleAbstractClass.
        //
        // Therefore, ⌘ + Click / ⌘ + B on copy()
        // takes us to the implementation inside
        // SampleAbstractClass.

        SampleAbstractClass l2 = new Lenovo();

        l2.copy();


    }
}


//You now have three different reference types pointing to a Lenovo object:
//Lenovo l = new Lenovo();
//Laptop l1 = new Lenovo();
//SampleAbstractClass l2 = new Lenovo();

//Think of it like this:

//Lenovo l
 //  ↓
//Can access what Lenovo provides


//Laptop l1
//   ↓
//Can access what Laptop defines


//SampleAbstractClass l2
 //  ↓
//Can access what SampleAbstractClass

//The object is still Lenovo in all three cases:

//new Lenovo()


//The thing that changes is the reference type, which controls
// what methods you can access through that reference.

  //That's actually a very useful example
// to keep in your User class because it lets you see the difference between
// normal object creation, interface reference, and abstract-class reference side by side.