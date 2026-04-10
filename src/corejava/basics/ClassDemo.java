package corejava.basics;

/**
 * ClassDemo.java
 * This class is created to understand:
 * - What is a Class?
 * - What is an Object?
 * - How to create object?
 * - How to access variables and methods using object?
 */
public class ClassDemo {

    public static void main(String[] args) {

        System.out.println("=== What is a Class? ===");
        System.out.println("Class is a blueprint or template.");
        System.out.println("Object is a real thing created from that blueprint.\n");

        // Creating objects from Dog class
        Dog dog1 = new Dog();   // dog1 is an object
        Dog dog2 = new Dog();   // dog2 is another object

        // Setting values using objects
        dog1.breed = "German Shepherd";
        dog1.height = 30;

        dog2.breed = "Labrador";
        dog2.height = 25;

        // Printing using objects
        System.out.println("Dog 1 Breed : " + dog1.breed);
        System.out.println("Dog 1 Height: " + dog1.height);

        System.out.println("\nDog 2 Breed : " + dog2.breed);
        System.out.println("Dog 2 Height: " + dog2.height);

        // Calling method using object
        dog1.bark();
        dog2.bark();

        System.out.println("\nSummary:");
        System.out.println("- Class = Blueprint (Dog)");
        System.out.println("- Object = Real dog created with 'new' keyword");
        System.out.println("- We use object to access variables and methods");
    }
}
