package StringBuilder_StringBuffer.Examples;

public class StringBuilderEx {
    public static void main(String[] args) {

        StringBuilder message = new StringBuilder("Hello");

        StringBuilder oldMessage = message;

        System.out.println(message == oldMessage);

        message.append(" World");

        message = new StringBuilder("Rahul");

        System.out.println(message == oldMessage);

        System.out.println("Message: " + message);
        System.out.println("Old Message: " + oldMessage);
    }
}

/*
====================================================================
                UNDERSTANDING STRINGBUILDER MUTABILITY
====================================================================

WHAT IS MUTABILITY?

Mutability means that an object's existing content can be
modified after the object has been created.

StringBuilder is mutable, whereas String is immutable.

Let's understand this using an example.


EXAMPLE:

StringBuilder message = new StringBuilder("Hello");

StringBuilder oldMessage = message;

System.out.println(message == oldMessage);

message.append(" World");

System.out.println(message == oldMessage);

message = new StringBuilder("Rahul");

System.out.println(message == oldMessage);

System.out.println("Message: " + message);
System.out.println("Old Message: " + oldMessage);


STEP 1: OBJECT CREATION

StringBuilder message = new StringBuilder("Hello");

- Creates a StringBuilder object containing "Hello".
- message points to this object.


STEP 2: REFERENCE COPYING

StringBuilder oldMessage = message;

- Copies the reference, NOT the object.
- Both variables point to the SAME object.

System.out.println(message == oldMessage);

OUTPUT: true

== compares object references.


STEP 3: MODIFYING THE EXISTING OBJECT

message.append(" World");

- append() adds content to the existing object.
- The object's content changes from "Hello" to "Hello World".
- No new StringBuilder object is created by append().
- Both message and oldMessage see the updated content
  because they point to the same object.

This proves that StringBuilder is MUTABLE.


STEP 4: CREATING A NEW OBJECT AND REASSIGNING

message = new StringBuilder("Rahul");

- Creates a NEW StringBuilder object containing "Rahul".
- message now points to the new object.
- oldMessage still points to the original object
  containing "Hello World".
- The original object is NOT modified by this reassignment.


STEP 5: COMPARING THE REFERENCES

System.out.println(message == oldMessage);

OUTPUT: false

- message points to the new "Rahul" object.
- oldMessage points to the original "Hello World" object.
- Therefore, they reference different objects.


====================================================================
                        FINAL OUTPUT
====================================================================

true
false
Message: Rahul
Old Message: Hello World


====================================================================
                    VISUAL REPRESENTATION
====================================================================

STAGE 1: AFTER REFERENCE COPYING

message     ----\
                 ---> Object 1: "Hello"
oldMessage  ----/

message == oldMessage  -> true


STAGE 2: AFTER append(" World")

message     ----\
                 ---> Object 1: "Hello World"
oldMessage  ----/

message == oldMessage  -> true


STAGE 3: AFTER REASSIGNMENT

message     ---------> Object 2: "Rahul"

oldMessage  ---------> Object 1: "Hello World"

message == oldMessage  -> false


====================================================================
                    IMPORTANT CONCEPTS
====================================================================

1. MUTABILITY:
   StringBuilder allows modification of its existing content.

2. REFERENCE COPYING:
   Assigning one reference variable to another copies
   the reference, NOT the object.

3. append():
   Modifies the existing StringBuilder object.

4. REFERENCE REASSIGNMENT:
   A reference variable can point to a completely new object.

5. ORIGINAL OBJECT:
   Reassigning one reference does not affect another reference
   pointing to the original object.

6. == OPERATOR:
   Compares object references.
   true  = Same object.
   false = Different objects.


====================================================================
                    INTERVIEW EXPLANATION
====================================================================

"StringBuilder is mutable, meaning we can modify its existing
content without creating a new StringBuilder object.

Initially, both message and oldMessage point to the same object.

When I use append(), the existing object's content changes.
Since both references point to the same object, both observe
the updated content.

Later, when I create a new StringBuilder object and reassign
message, only that reference changes its target.

oldMessage continues pointing to the original object.

This demonstrates both StringBuilder mutability and
reference reassignment."


====================================================================
                         FINAL TAKEAWAY
====================================================================

append()                  = Modifies the existing object.

new StringBuilder(...)    = Creates a new object.

Reference reassignment   = Changes where a variable points.

StringBuilder             = Mutable.

====================================================================
*/