package corejava.basics;

/**
 * This class demonstrates all 8 Primitive Data Types in Java.
 */
public class DataTypes {

    // These are used to Check default values demonstration (static variables)
    static byte defaultByte;
    static int defaultInt;
    static boolean defaultBoolean;

    public static void main(String[] args) {
        System.out.println("=== Primitive Data Types Demo ===\n");

        // Declaration + Initialization
        //Examples of different of data types
        byte b = 127;
        short s = 32000;
        int i = 2147483647;
        long l = 9123456789L;      // L suffix required
        float f = 3.14f;           // f suffix required
        double d = 3.1415926535;
        boolean flag = true;
        char ch = 'A';

        // Checking Size (in bytes)
        // System.out.println(Short.SIZE / 8);   // prints 2

        // Checking Range
        // System.out.println(Byte.MIN_VALUE);     // -128
        // System.out.println(Byte.MAX_VALUE);     // 127
        // System.out.println(Integer.MIN_VALUE);  // -2147483648
        // System.out.println(Integer.MAX_VALUE);  // 2147483647

        System.out.println("Values:");
        System.out.println("byte   : " + b);
        System.out.println("int    : " + i);
        System.out.println("long   : " + l);
        System.out.println("double : " + d);
        System.out.println("char   : " + ch);

        System.out.println("\nSizes (in bytes):");
        System.out.println("int size    : " + (Integer.SIZE / 8));

        System.out.println("\nDefault Values:");
        System.out.println("byte default    : " + defaultByte);
        System.out.println("int default     : " + defaultInt);
        System.out.println("boolean default : " + defaultBoolean);

        // Checking Default Value
       // System.out.println(i);   // prints 0 (default value of int)

        System.out.println("\nSummary: Primitive types store actual value directly and have fixed size.");
    }
}