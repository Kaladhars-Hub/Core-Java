package OOPS.Polymorphism;

public class User {

    public static void main(String[] args) {

        // ==================================================
        // CASE 1: COMPILE-TIME POLYMORPHISM
        // Method Overloading
        // ==================================================

        // Creating Calculator object.
        Calculator c = new Calculator();

        // Java sees 2 arguments,
        // so it chooses add(int, int).
        c.add(10, 20);

        // Java sees 3 arguments,
        // so it chooses add(int, int, int).
        c.add(10, 20, 30);


        System.out.println("--------------------");


        // ==================================================
        // CASE 2: RUNTIME POLYMORPHISM
        // Method Overriding
        // ==================================================

        // Reference type = Guest
        // Actual object = Developer
        //
        // Developer is a child of Guest.
        Guest g = new Developer();

        // read() is overridden in Developer.
        //
        // Java looks at the actual object,
        // which is Developer,
        // so Developer's read() runs.
        g.read();


        System.out.println("--------------------");


        // ==================================================
        // CASE 3: RUNTIME POLYMORPHISM
        // Using Interface Reference
        // ==================================================

        // Reference type = Laptop
        // Actual object = Lenovo
        Laptop l = new Lenovo();

        // The actual object is Lenovo,
        // so Lenovo's copy() implementation runs.
        l.copy();


        // The same reference variable 'l'
        // can now refer to an HP object.
        l = new HP();

        // The actual object is now HP,
        // so HP's copy() implementation runs.
        l.copy();
    }
}
