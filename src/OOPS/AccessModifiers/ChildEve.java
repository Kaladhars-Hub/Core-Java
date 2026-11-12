//Case 5: Child Class in Different Package

package OOPS.AccessModifiers;

import OOPS.AccessModifiers.DiffPackage.Eve;

public class ChildEve extends Eve {

    public void display() {

        System.out.println(age);
        System.out.println(chapter);

        // System.out.println(birth);
        // Default: not accessible because it is a different package

        // System.out.println(house);
        // Private: not accessible because it belongs only to Eve
    }

        public static void main(String[] args) {
            ChildEve c = new ChildEve();
            c.display();
        }
    }


    // "When a child class inherits from a parent class located in another package,
// it can access the parent's public and protected members.
// The protected member is accessible because of inheritance.
// However, default members cannot be accessed because they are limited to the same package,
// and private members cannot be accessed because they belong only to the parent class."
