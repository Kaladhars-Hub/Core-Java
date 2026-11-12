package basics.Strings.Exaamples;

public class StringEx17 {

    public static void main(String[] args) {

        String name = "Java Programming";

        System.out.println(name.replace("Java", "Python"));
        name = name.replace("Java", "Python");
        System.out.println(name);
    }
}
