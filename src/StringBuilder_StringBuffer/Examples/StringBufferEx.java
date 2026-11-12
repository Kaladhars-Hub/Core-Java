package StringBuilder_StringBuffer.Examples;

public class StringBufferEx {
    public static void main(String[] args) {

        StringBuffer message = new StringBuffer("Hello");

        StringBuffer oldMessage = message;

        System.out.println(message == oldMessage);

        message.append(" World");

        System.out.println(message == oldMessage);

        System.out.println("Message: " + message);

        System.out.println("Old Message: " + oldMessage);
    }
}


/*
========================================================
                 UNDERSTANDING STRINGBUFFER
========================================================

WHAT IS STRINGBUFFER?

- StringBuffer is a predefined Java class.
- It allows us to modify the existing object's content.
- Therefore, StringBuffer is MUTABLE.


WHY DO WE NEED STRINGBUFFER?

- StringBuilder is mutable but does not provide
  synchronized methods.
- When multiple threads access the same shared object,
  their operations may interfere with each other.
- StringBuffer provides synchronized methods to
  coordinate access to the shared object.


HOW DOES STRINGBUFFER WORK?

StringBuffer message = new StringBuffer("Hello");

- Creates a StringBuffer object containing "Hello".
- 'message' points to this object.

StringBuffer oldMessage = message;

- Copies the reference, not the object.
- Both variables point to the SAME object.

message.append(" World");

- append() adds text to the existing content.
- The same object's content changes to "Hello World".
- Both references see the updated content.


PROOF:

System.out.println(message == oldMessage);

OUTPUT: true

- Both references point to the same object.

System.out.println(message);
System.out.println(oldMessage);

OUTPUT:
Hello World
Hello World

- Both variables display the updated content.
- This proves StringBuffer is MUTABLE.


WHY IS STRINGBUFFER DIFFERENT FROM STRINGBUILDER?

StringBuffer:
- Mutable.
- Provides synchronized methods.
- Useful when multiple threads share the same object
  and synchronized method access is required.

StringBuilder:
- Mutable.
- Does not provide synchronized methods.
- Generally faster when synchronization is unnecessary.


========================================================
                       CONCLUSION
========================================================

StringBuffer and StringBuilder are both MUTABLE.

The main difference is:

StringBuffer  = Mutable + Synchronized methods.
StringBuilder = Mutable + Non-synchronized methods.

StringBuffer provides coordinated access to its individual
synchronized methods when multiple threads share an object.

========================================================
*/
