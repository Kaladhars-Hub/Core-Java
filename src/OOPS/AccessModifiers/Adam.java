package OOPS.AccessModifiers;

import OOPS.AccessModifiers.DiffPackage.Eve;

public class Adam {
    public static void main(String[] args) {
        Eve e = new Eve();
        System.out.println(e.age);             // public member: accessible from different package

        //System.out.println(e.chapter);        // protected member: not accessible because Adam is not a child class of Eve

        //System.out.println(e.birth);         // default member: not accessible because Adam is in a different package

        //System.out.println(e.house);        // private member: not accessible outside Eve class


    }
}






//Case 4: Another Class in Different Package
//
//"When a class tries to access another class from a different package,
// only public members are directly accessible.
// protected members can be accessed only through inheritance,
// default members are package-specific,
// and private members are restricted to the same class."