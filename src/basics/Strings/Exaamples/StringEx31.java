package basics.Strings.Exaamples;

public class StringEx31 {

    public static void main(String[] args) {

        String name = "java is easy";

        String[] words = name.split(" ");

        for(String word : words) {

            for(int i = word.length() -1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
        }
        }
    }