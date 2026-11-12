package basics.Object;

public class Test {

    // 1. Every object created will get its own blank copy of these boxes
    int i;
    int j;

    // 2. A simple method that adds this object's specific numbers together
    public int add() {
        return i + j;
    }

    // 🔑 THE ENGINE KEY: Execution starts here line-by-line
    public static void main(String[] args) {

    // 🏗️ OBJECT 1: Creating a physical memory block named t1
        Test t1 = new Test();
        t1.i = 10; //Putting 10 inside t1's box
        t1.j = 20; // Putting 30 inside t2's box

        // 🏗️ OBJECT 2: Creating a completely separate memory block named t2
        Test t2 = new Test();
        t2.i = 30; // Putting 30 inside t2's box
        t2.j = 40; // Putting 40 inside t2's box

        // 📊 PRINTING RESULTS (Proving they run completely separate operations)
        System.out.println("t1 Sum: " + t1.add()); // Prints 30 (10 + 20)
        System.out.println("t2 Sum: " + t2.add()); // Prints 70 (30 + 40)

        // ⚖️ PROVING THEY ARE DIFFERENT MEMORY BLOCKS
        // This checks if they point to the exact same memory location on the Heap
        System.out.println("Are t1 and t2 the same object? " + (t1 == t2));

        // 🪪 CHECKING THEIR DIGITAL ID CARDS
        System.out.println("Object 1 Memory ID: " + t1.hashCode());
        System.out.println("Object 2 Memory ID: " + t2.hashCode());
    }
}
