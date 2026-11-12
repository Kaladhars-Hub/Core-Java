package basics.Strings.Exaamples;

public class StringEx28 {

    public static void main(String[] args) {

        String name1 = "Java";
        String name2 = "java";

        System.out.println(name1.equalsIgnoreCase(name2));
    }
}

//Print whether both Strings are equal without considering uppercase/lowercase differences.