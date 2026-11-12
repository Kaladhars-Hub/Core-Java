package basics.Constructors;

public class ParameterizedConstructor {

    // =========================================================================
    // THE PARAMETERIZED CONSTRUCTOR (The data-catcher)
    // =========================================================================
    // WHY IT'S HERE: Sometimes you don't just want a blank student; you want to give
    // the student data (like a name) right at the moment they are created.
    // WHAT HAPPENS: The 'String name' inside the brackets acts like a funnel. It catches
    // whatever text you throw into it during object creation.
    ParameterizedConstructor(String name) {

        // This prints out the exact text that was caught by the 'name' funnel.
        System.out.println("Student admitted: " + name);
    }

    // =========================================================================
    // THE START BUTTON
    // =========================================================================
    public static void main(String[] args) {

        // WHY WE WRITE THIS: To create a specific student object with a name.
        // WHAT HAPPENS: We pass the text "Rahul" inside the brackets. Java takes this text,
        // shoots it straight up to the 'String name' funnel above, and runs the print code.
        ParameterizedConstructor student = new ParameterizedConstructor("Rahul");
    }
}