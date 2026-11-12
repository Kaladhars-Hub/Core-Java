package basics.Strings.Exaamples;

public class StringEx6 {

    public static void main(String[] args) {

        String name = "Java";

        for(int i = name.length() -1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
    }
}

//Similar to SingleDimensional Array - 16