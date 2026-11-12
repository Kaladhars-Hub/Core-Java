package basics.Constructors;

public class DefaultConstructor {

    // =========================================================================
    // LOOK, MA! NO CONSTRUCTOR HERE!
    // =========================================================================
    // WHY LEAVE IT BLANK: To show that you don't *have* to write a constructor.
    // WHAT HAPPENS: Because this space is totally empty, Java secretly builds a
    // hidden one for us behind the scenes called a "Default Constructor".

    // =========================================================================
    // THE START BUTTON
    // =========================================================================
    public static void main(String[] args) {

        // WHY WE WRITE THIS: To create our object.
        // WHAT HAPPENS: Even though we didn't write any code for 'DefaultConstructor()',
        // the program does NOT crash. Java uses its own hidden, blank setup block
        // to successfully build the object in memory.
        DefaultConstructor student = new DefaultConstructor();
        System.out.println("Object created successfully");
    }
}