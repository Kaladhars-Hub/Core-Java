package basics.Constructors;

public class NoArgumentConstructor {

    // =========================================================================
    // THE NO-ARGUMENT CONSTRUCTOR (Made by you!)
    // =========================================================================
    // WHY IT'S HERE: You wanted to manually control what happens when a student is created.
    // WHAT HAPPENS: The empty brackets () mean it does not require you to pass in
    // any extra data (like a name or ID number) to do its job.
    NoArgumentConstructor() {
        System.out.println("Student admitted");
    }

    // =========================================================================
    // THE START BUTTON
    // =========================================================================
    public static void main(String[] args) {

        // WHY WE WRITE THIS: To create the student object.
        // WHAT HAPPENS: Look at the empty brackets inside 'new NoArgumentConstructor()'.
        // Since they are empty, Java looks up, finds your matching empty-bracket setup
        // block, and runs the print statement inside it.
        NoArgumentConstructor student = new NoArgumentConstructor();
    }
}