//Step:1 Create a Parent Class

package OOPS.AccessModifiers;

public class Student {
    public String name = "Adam";
    protected int age = 20;
    String garden = "Eden Garden";
     double chapter = 1;

// Case1: Same Class

    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(garden);
        System.out.println(chapter);
    }
}