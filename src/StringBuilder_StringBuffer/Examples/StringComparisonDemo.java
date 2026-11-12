package StringBuilder_StringBuffer.Examples;

public class StringComparisonDemo {

    public static void main(String[] args) {

        // 1. STRING - IMMUTABLE

        String message = new String("Hello");
        String oldMessage = message;

        message = message.concat(" Rahul");

        System.out.println("========== STRING ==========");
        System.out.println("Same Object: " + (message == oldMessage));
        System.out.println("Message: " + message);
        System.out.println("Old Message: " + oldMessage);


        // 2. STRINGBUILDER - MUTABLE

        StringBuilder builder = new StringBuilder("Hello");
        StringBuilder oldBuilder = builder;

        builder.append(" Rahul");

        System.out.println("\n====== STRINGBUILDER ======");
        System.out.println("Same Object: " + (builder == oldBuilder));
        System.out.println("Message: " + builder);
        System.out.println("Old Message: " + oldBuilder);


        // 3. STRINGBUFFER - MUTABLE

        StringBuffer buffer = new StringBuffer("Hello");
        StringBuffer oldBuffer = buffer;

        buffer.append(" Rahul");

        System.out.println("\n======= STRINGBUFFER ======");
        System.out.println("Same Object: " + (buffer == oldBuffer));
        System.out.println("Message: " + buffer);
        System.out.println("Old Message: " + oldBuffer);
    }
}


/*
================================================================
          STRING vs STRINGBUILDER vs STRINGBUFFER
================================================================

1. STRING - IMMUTABLE

   - Existing String content cannot be modified.
   - concat() returns a new String when content changes.
   - Reference variables can be reassigned.


2. STRINGBUILDER - MUTABLE

   - Existing object content can be modified.
   - append() modifies the existing object.
   - Methods are not synchronized.
   - Generally preferred when synchronization is not needed.


3. STRINGBUFFER - MUTABLE

   - Existing object content can be modified.
   - append() modifies the existing object.
   - Methods are synchronized.
   - Provides thread-safe individual method operations.


================================================================
                     IMPORTANT DIFFERENCES
================================================================

String        = Immutable
StringBuilder = Mutable + Not synchronized
StringBuffer  = Mutable + Synchronized


REFERENCE CONCEPT:

- Multiple reference variables can point to the same object.
- Changes to a mutable object are visible through all
  references pointing to that object.
- Reassigning one reference does not change the object
  referenced by another variable.

==  compares object references.
equals() compares object contents (for String).


================================================================
                    INTERVIEW TAKEAWAY
================================================================

String:
Use when the content should be immutable.

StringBuilder:
Use when you need mutable strings without synchronization.

StringBuffer:
Use when multiple threads share the same instance and
synchronized individual operations are needed.

================================================================
*/

/*
“String is immutable, so any change creates a new object. StringBuilder and StringBuffer are mutable,
so they change the same object using append(). The difference between them is that StringBuffer is synchronized and thread-safe but slower,
while StringBuilder is not synchronized and faster.So I use String for fixed text, StringBuilder for changing text in a single thread,
and StringBuffer when multiple threads share the same object.”
 */
