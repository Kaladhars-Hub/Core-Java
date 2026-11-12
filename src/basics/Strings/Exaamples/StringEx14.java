package basics.Strings.Exaamples;

public class StringEx14 {

    public static void main(String[] args) {

        String name = "   Java   ";

        System.out.println(name.trim());
        name = name.trim();
        System.out.println(name.contains("Java"));
    }
}


/*
 * STRING-14 — trim(), assignment, and contains()
 *
 * Code:
 *
 * String name = "   Java   ";
 *
 * name = name.trim();
 *
 * System.out.println(name.contains("Java"));
 *
 *
 * 1. String name = "   Java   ";
 *
 *    We create a String variable called 'name'.
 *
 *    Its value contains extra spaces at the beginning and end:
 *
 *        "   Java   "
 *
 *
 * 2. name = name.trim();
 *
 *    trim() removes spaces from the beginning and end of the String.
 *
 *    Before trim():
 *        name = "   Java   "
 *
 *    name.trim() produces:
 *        "Java"
 *
 *    But trim() does not automatically change the value stored in 'name'.
 *
 *    Therefore, we use:
 *
 *        name = name.trim();
 *
 *    The right side:
 *        name.trim()
 *
 *    produces the new String:
 *        "Java"
 *
 *    The assignment '=' stores that result back into 'name'.
 *
 *    After this line:
 *        name = "Java"
 *
 *
 * 3. System.out.println(name.contains("Java"));
 *
 *    contains() checks whether the String contains the specified text.
 *
 *    At this point, 'name' contains:
 *
 *        "Java"
 *
 *    So:
 *
 *        name.contains("Java")
 *
 *    returns:
 *
 *        true
 *
 *    println() then prints:
 *
 *        true
 *
 *
 * IMPORTANT POINT:
 *
 * These two statements are different:
 *
 *    System.out.println(name.trim());
 *
 *    This only prints the trimmed result.
 *    It does NOT change the value stored in 'name'.
 *
 *
 *    name = name.trim();
 *
 *    This stores the trimmed result back into 'name'.
 *
 *
 * FINAL CODE:
 */
