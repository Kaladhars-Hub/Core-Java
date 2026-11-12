package basics.Strings.Exaamples;

public class StringsEx30 {

    public static void main(String[] args) {

        String value = "Java Programming";

        int count = 0;

        for(int i = 0; i < value.length(); i++) {
            if(value.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println(count);
     }
}

//Print the number of characters excluding spaces.
