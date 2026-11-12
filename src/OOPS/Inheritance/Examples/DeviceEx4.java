package OOPS.Inheritance.Examples;

public class DeviceEx4 {
     DeviceEx4() {
        System.out.println("Device constructor");
    }
}
class PhoneEx4 extends DeviceEx4 {
    PhoneEx4() {
        System.out.println("Phone constructor");
    }
}
class SmartPhoneEx4 extends PhoneEx4 {
    SmartPhoneEx4() {
        System.out.println("SmartPhone constructor");
    }
    public static void main(String[] args) {

        SmartPhoneEx4 s1 = new SmartPhoneEx4();

    }
}

/*
=========================================================
INHERITANCE-04 — MULTILEVEL INHERITANCE + CONSTRUCTORS
=========================================================

Inheritance structure:

DeviceEx4
    ↓
PhoneEx4
    ↓
SmartPhoneEx4


1. WHAT TYPE OF INHERITANCE IS THIS?
------------------------------------

This is MULTILEVEL INHERITANCE.

DeviceEx4 is the parent of PhoneEx4.

PhoneEx4 is the child of DeviceEx4,
but PhoneEx4 is also the parent of SmartPhoneEx4.

SmartPhoneEx4 is the child of PhoneEx4.


Relationship:

DeviceEx4
    ↓
PhoneEx4
    ↓
SmartPhoneEx4


2. WHAT DOES "extends" MEAN?
----------------------------

class PhoneEx4 extends DeviceEx4

means:

PhoneEx4 inherits accessible properties and methods
from DeviceEx4.


class SmartPhoneEx4 extends PhoneEx4

means:

SmartPhoneEx4 inherits from PhoneEx4.

Because PhoneEx4 already extends DeviceEx4,
SmartPhoneEx4 is part of the complete inheritance chain:

DeviceEx4 → PhoneEx4 → SmartPhoneEx4


3. WHERE DOES PROGRAM EXECUTION START?
--------------------------------------

Java calls:

public static void main(String[] args)

Inside main() we have:

SmartPhoneEx4 s1 = new SmartPhoneEx4();


Break this line into parts:

SmartPhoneEx4
→ class/type

s1
→ reference variable

new SmartPhoneEx4()
→ creates a SmartPhoneEx4 object

s1
→ refers to that object


IMPORTANT:

We explicitly create ONLY ONE object here.

We are NOT writing:

new DeviceEx4();
new PhoneEx4();
new SmartPhoneEx4();

We only write:

new SmartPhoneEx4();


4. THEN WHY DO THREE CONSTRUCTORS RUN?
--------------------------------------

Even though we explicitly create one SmartPhoneEx4 object,
SmartPhoneEx4 belongs to an inheritance chain.

Before Java finishes the child constructor,
the parent part must be initialized first.

So the constructor chain is:

DeviceEx4
    ↓
PhoneEx4
    ↓
SmartPhoneEx4


Therefore:

new SmartPhoneEx4()

causes:

DeviceEx4 constructor
        ↓
PhoneEx4 constructor
        ↓
SmartPhoneEx4 constructor


5. STEP-BY-STEP EXECUTION
-------------------------

STEP 1:

main() contains:

SmartPhoneEx4 s1 = new SmartPhoneEx4();

Java starts creating the SmartPhoneEx4 object.


STEP 2:

SmartPhoneEx4 extends PhoneEx4.

Before the SmartPhoneEx4 constructor body executes,
its immediate parent constructor must execute.


STEP 3:

The immediate parent is PhoneEx4.

But PhoneEx4 itself extends DeviceEx4.

So before PhoneEx4 finishes its constructor,
its parent DeviceEx4 must be initialized first.


STEP 4:

DeviceEx4 is at the top of our inheritance chain.

Its constructor executes:

DeviceEx4() {
    System.out.println("Device constructor");
}

Output:

Device constructor


STEP 5:

After DeviceEx4 constructor finishes,
execution returns to PhoneEx4.

PhoneEx4 constructor executes:

PhoneEx4() {
    System.out.println("Phone constructor");
}

Output:

Phone constructor


STEP 6:

After PhoneEx4 constructor finishes,
execution returns to SmartPhoneEx4.

SmartPhoneEx4 constructor executes:

SmartPhoneEx4() {
    System.out.println("SmartPhone constructor");
}

Output:

SmartPhone constructor


FINAL OUTPUT:

Device constructor
Phone constructor
SmartPhone constructor


6. WHERE IS super()?
--------------------

We did NOT manually write super() in this program.

For example:

PhoneEx4() {
    System.out.println("Phone constructor");
}

But Java effectively calls the no-argument parent
constructor first when appropriate.

Conceptually, think of it like:

PhoneEx4() {
    super();
    System.out.println("Phone constructor");
}


Similarly:

SmartPhoneEx4() {
    super();
    System.out.println("SmartPhone constructor");
}


Here:

super()

means:

Call the constructor of the IMMEDIATE parent class.


For SmartPhoneEx4:

super()
→ calls PhoneEx4 constructor


For PhoneEx4:

super()
→ calls DeviceEx4 constructor


That produces the chain:

SmartPhoneEx4()
    ↓
PhoneEx4()
    ↓
DeviceEx4()


But constructor bodies FINISH from parent to child:

DeviceEx4 constructor
    ↓
PhoneEx4 constructor
    ↓
SmartPhoneEx4 constructor


7. IMPORTANT: IMMEDIATE PARENT
------------------------------

super() refers to the immediate parent constructor.

SmartPhoneEx4 extends PhoneEx4

Therefore inside SmartPhoneEx4:

super()
→ PhoneEx4 constructor

It does NOT directly jump to DeviceEx4.


PhoneEx4 extends DeviceEx4

Therefore inside PhoneEx4:

super()
→ DeviceEx4 constructor


8. OBJECTS VS CONSTRUCTOR EXECUTION
-----------------------------------

Do NOT confuse these two concepts.

This:

SmartPhoneEx4 s1 = new SmartPhoneEx4();

explicitly creates ONE SmartPhoneEx4 object.

But THREE constructors execute:

DeviceEx4()
PhoneEx4()
SmartPhoneEx4()


So:

Objects explicitly created with new = 1

Constructors executed = 3


The number of constructors executed does NOT mean
we explicitly created three separate objects.


9. WHY DOES THE PARENT CONSTRUCTOR RUN FIRST?
---------------------------------------------

The child depends on its parent through inheritance.

Java initializes the parent part first before completing
the child initialization.

Think:

Foundation first
    ↓
DeviceEx4
    ↓
PhoneEx4
    ↓
SmartPhoneEx4


10. IMPORTANT CONSTRUCTOR RECALL
--------------------------------

A constructor:

- has the same name as the class
- has no return type
- runs automatically during object creation
- is mainly used to initialize an object


Examples:

DeviceEx4() { }

PhoneEx4() { }

SmartPhoneEx4() { }


11. IMPORTANT INHERITANCE RECALL
--------------------------------

Inheritance allows a child class to use accessible
properties and behaviours inherited from its parent.

Keyword:

extends


Example:

class PhoneEx4 extends DeviceEx4

PhoneEx4 = Child/Subclass
DeviceEx4 = Parent/Superclass


12. KEY REVISION RULES
----------------------

Remember:

1. extends is used for class inheritance.

2. Parent → Child is the inheritance direction.

3. A child can use accessible inherited members.

4. A separate parent object is NOT required just to use
   members that the child has inherited.

5. Creating a child object can cause parent constructors
   to execute as part of initialization.

6. Parent constructor executes before child constructor body.

7. super() calls the immediate parent constructor.

8. When an appropriate no-argument parent constructor exists,
   Java can insert the super() call automatically.

9. One explicitly created child object does NOT mean
   one constructor must execute.

10. In multilevel inheritance, constructor execution proceeds
    from the highest parent down to the final child.


QUICK MEMORY:

Inheritance chain:

DeviceEx4
    ↓
PhoneEx4
    ↓
SmartPhoneEx4


Object creation:

new SmartPhoneEx4()
        ↓
ONE object explicitly created


Constructor execution:

DeviceEx4()
    ↓
PhoneEx4()
    ↓
SmartPhoneEx4()


Final output:

Device constructor
Phone constructor
SmartPhone constructor


ONE-LINE REVISION:

"When a child object is created in multilevel inheritance,
the parent constructor chain runs first, from the highest
parent down to the child constructor."

*/
