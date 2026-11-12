package OOPS.Polymorphism;


// This class demonstrates Method Overloading.
//
// Method Overloading means:
// Same method name + different parameters.
//
// Because Java decides which method to call during compilation,
// Method Overloading is called Compile-Time Polymorphism.

public class Calculator {

    // First version of add()
    // This method accepts 2 parameters.
    public void add(int a, int b) {
        System.out.println(a + b);
    }

  // Second version of add()
  // Same method name, but this time it accepts 3 parameters.

public void add(int a, int b, int c) {
    System.out.println(a + b + c);
}
}
