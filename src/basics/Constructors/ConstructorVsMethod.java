package basics.Constructors;

public class ConstructorVsMethod {

    // =========================================================================
    // 1. THE SETUP BLOCK (The Constructor)
    // =========================================================================
    // WHY IT'S HERE: To handle things that must happen the exact moment an object is born.
    // WHAT HAPPENS: Because it has the exact same name as the class, Java knows it's a constructor.
    ConstructorVsMethod() {
        // This runs automatically. You don't have to call it.
        System.out.println("Student admitted");
    }

    // =========================================================================
    // 2. THE ACTION BLOCK (The Method)
    // =========================================================================
    // WHY IT'S HERE: To handle actions the object does later on.
    // WHAT HAPPENS: The word 'void' tells Java this is a regular method, not a constructor.
    void study() {
        // This will NOT run automatically. It waits until you manually ask for it.
        System.out.println("Student is studying");
    }

    // =========================================================================
    // 3. THE START BUTTON (The Main Method)
    // =========================================================================
    public static void main(String[] args) {

        // WHY WE WRITE THIS: To actually create the student object in computer memory.
        // WHAT HAPPENS: The 'new' keyword builds the object, which automatically
        // triggers the Setup Block above. "Student admitted" prints right here.
        ConstructorVsMethod student = new ConstructorVsMethod();

        // WHY WE WRITE THIS: Because the student object is built, we can now make it do actions.
        // WHAT HAPPENS: This manually triggers the Action Block above. "Student is studying" prints now.
        student.study();
    }
}