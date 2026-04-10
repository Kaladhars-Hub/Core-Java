package corejava.basics;

/**
 * This class demonstrates all 8 Primitive Data Types in Java.
 */
public class DataTypes {

    // These are used to Check default values demonstration (static variables)
    static byte defaultByte;
    static int defaultInt;
    static boolean defaultBoolean;
    static short defaultShort;
    static char defaultChar;
    static double defaultDouble;
    static float defaultFloat;
    static long defaultLong;

    public static void main(String[] args) {
        System.out.println("=== Primitive Data Types Demo ===\n");

        // 1. Declaration + Initialization
        //Examples of different of data types
        byte b = 127;
        short s = 32000;
        int i = 2147483647;
        long l = 9123456789L;      // L suffix required
        float f = 3.14f;           // f suffix required
        double d = 3.1415926535;
        boolean booleanVar = true;
        char ch = 'A';

        // Checking Size (in bytes)
        // System.out.println(Short.SIZE / 8);   // prints 2

        // Checking Range
        // System.out.println(Byte.MIN_VALUE);     // -128
        // System.out.println(Byte.MAX_VALUE);     // 127
        // System.out.println(Integer.MIN_VALUE);  // -2147483648
        // System.out.println(Integer.MAX_VALUE);  // 2147483647


        // 2. Printing values
        System.out.println("Values:");
        System.out.println("byte   : " + b);
        System.out.println("short  : " + s);
        System.out.println("int    : " + i);
        System.out.println("long   : " + l);
        System.out.println("float   : " + f);
        System.out.println("double : " + d);
        System.out.println("boolean: " + booleanVar);
        System.out.println("char   : " + ch);

        System.out.println("\nSizes (in bytes) using Wrapper Classes ===");
        System.out.println("byte   size : " + (Byte.SIZE / 8) + " byte");
        System.out.println("short  size : " + (Short.SIZE / 8) + " bytes");
        System.out.println("int    size : " + (Integer.SIZE / 8) + " bytes");
        System.out.println("long   size : " + (Long.SIZE / 8) + " bytes");
        System.out.println("float  size : " + (Float.SIZE / 8) + " bytes");
        System.out.println("double size : " + (Double.SIZE / 8) + " bytes");
        System.out.println("char   size : " + (Character.SIZE / 8) + " bytes");

        System.out.println("\n=== Range (Min & Max) ===");
        System.out.println("byte   : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short  : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int    : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long   : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);


        // Checking Default Value
       // System.out.println(i);   // prints 0 (default value of int)
        System.out.println("\n=== Default Values ===");
        System.out.println("byte default    : " + defaultByte);
        System.out.println("short default   : " + defaultShort);
        System.out.println("int default     : " + defaultInt);
        System.out.println("long default    : " + defaultLong);
        System.out.println("float default   : " + defaultFloat);
        System.out.println("double default  : " + defaultDouble);
        System.out.println("boolean default : " + defaultBoolean);
        System.out.println("char default    : " + (int)defaultChar + " (unicode \\u0000)");


        System.out.println("\nSummary: Primitive types store actual value directly and have fixed size.");
    }
}