package StringBuilder_StringBuffer.Examples;

public class StringDemo {

    public static void main(String[] args) {

        String message = new String("Hello");

        String oldMessage = message;

        message = message.concat(" World");

        System.out.println("OldMessage: " + oldMessage);
        System.out.println("Message: " + message);

        System.out.println(oldMessage == message);
    }
}

/*
================================================================
                    STRING IMMUTABILITY
================================================================

WHAT IS IMMUTABILITY?

Immutability means that once a String object is created,
its existing content cannot be modified.

However, reference variables are mutable. They can be
reassigned to point to different String objects.


EXAMPLE:

String message = new String("Hello");

String oldMessage = message;

message = message.concat(" World");


STEP 1: STRING OBJECT CREATION

String message = new String("Hello");

- Creates a String object containing "Hello".
- message points to this object.


STEP 2: REFERENCE COPYING

String oldMessage = message;

- Copies the reference, NOT the String object.
- Both variables point to the SAME "Hello" object.

System.out.println(message == oldMessage);

OUTPUT: true


STEP 3: STRING CONCATENATION

message = message.concat(" World");

- concat() creates a NEW String object containing
  "Hello World" because the content changes.
- message is reassigned to the new object.
- oldMessage still points to the original "Hello" object.
- The original String object is NOT modified.


STEP 4: VERIFYING THE REFERENCES

System.out.println(oldMessage == message);

OUTPUT: false

WHY?

- oldMessage points to "Hello".
- message points to "Hello World".
- They reference two different objects.


STEP 5: VERIFYING THE CONTENTS

System.out.println(oldMessage);
System.out.println(message);

OUTPUT:

Hello
Hello World


================================================================
                    IMPORTANT CONCEPTS
================================================================

1. String is immutable: Its existing content cannot be changed.

2. Reference variables are mutable: They can point to
   different objects.

3. Reference copying: Multiple variables can point to
   the same String object.

4. == : Compares object references (same or different object).

5. equals() : Compares String contents.

6. Garbage Collection: Objects with no reachable references
   become eligible for garbage collection, but are not
   necessarily destroyed immediately.


================================================================
                  INTERVIEW EXPLANATION
================================================================

"String is immutable, meaning once a String object is created,
its existing content cannot be modified.

Initially, both message and oldMessage point to the same
String object.

When I call concat(), Java creates a new String object
instead of modifying the original String.

The message reference is reassigned to the new object,
while oldMessage continues pointing to the original object.

That is why oldMessage == message returns false.

So, String objects are immutable, but reference variables
are mutable."


================================================================
                    FINAL TAKEAWAY
================================================================

STRING OBJECT     = IMMUTABLE
REFERENCE VARIABLE = MUTABLE

We cannot modify an existing String object's content,
but we can change where a reference variable points.

================================================================
*/
