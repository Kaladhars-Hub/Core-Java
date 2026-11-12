package MultiThreading;

class Employee extends Thread {

    Employee(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName() + " >>> " +getId());
    }

}

class Manager extends Thread {

    Manager(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName() + " >>> " +getId());
    }
}

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Hyderabad");
        e1.start();
        Manager m1 = new Manager("Secunderabad");
        m1.start();

        System.out.println(Thread.activeCount());


// Anonymous class (a class with no name, created on the spot).

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class");
            }
        });

        t1.start();

        /*

       Let's break it down:

      1.new Thread() creates a Thread object.
      2.The Thread constructor expects a Runnable object.
      3.new Runnable() creates an anonymous class object that implements the Runnable interface.
      4.Inside that object, we provide the implementation of run().

     Think of it like this:

      - The Thread needs to know WHAT TASK it should execute.
       - We give that task using a Runnable object.

 */
        // Lambda (the shortest way). () is empty because run() takes no parameters
        Thread t2 = new Thread(() ->
                System.out.println("Hello from lambda")
        );

        t2.start();

        /*

        Why don't we write new Runnable() here?

        - Because Java automatically understands that the Thread constructor expects a Runnable object.
        - Since Runnable has only one abstract method (run()), we can use a lambda expression instead.

         */

    }
}

