package OOPS.Inheritance.Super;

import OOPS.Inheritance.Multilevel.Developer;

public class Admin extends Developer {

    @Override
    public void read() {
        System.out.println("Admin read code");
    }

    public void manage() {
        super.read();   // Calls Guest's read()
        write();        // Calls Developer's write()
        read();         // Calls Admin's read()
    }
    }


/*

super()        → Calls the  immediate parent's no argument constructor
super(value)   → Calls the immediate parent's matching constructor and pass the value to it.
super.variable → Accesses the immediate parent's bank variable. This is especially useful when parent and child both have a variable named bank.
super.method() → Call immediate parent's method

super(...)  → constructor
super.name  → variable
super.show() → method

 */