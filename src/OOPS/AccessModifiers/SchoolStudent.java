package OOPS.AccessModifiers;

public class SchoolStudent extends Student {

    public void display() {
        System.out.println(name);    // public - accessible
        System.out.println(age);     // protected - accessible
        System.out.println(garden);  // default - accessible (same package)

        // System.out.println(chapter);
        // private - NOT accessible
    }

    public static void main(String[] args) {
        SchoolStudent s = new SchoolStudent();
        s.display();
    }
}


//Case 3: Child Class
//
//SchoolStudent is a child class of Student.
//It inherits the variables from Student.
//public and protected members are accessible.
//Default members are accessible because both classes are in the same package.
//private members cannot be accessed directly in the child class.
