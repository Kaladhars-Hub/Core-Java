package basics.Strings.Exaamples;

public class StringEx18 {

    public static void main(String[] args) {

        String name = "Java Programming";

        String[] word = name.split(" ");

        System.out.println(word[0]);
        System.out.println(word[1]);

    }
}

//split() is used when you want to separate a String into multiple parts based on a separator.

//An array stores multiple values, and each value has an index.
//
//split() is simply one way of creating a String array from a String.

//Before split(): we were dealing with individual characters and their indexes.
//After split(): the separated words become individual array elements, and those elements have indexes.
//like same as numbers in arrays problems we have practised.
//Here, the space " " is the separator, so the String is separated into:
//Java
//Programming
//Notice that the result is stored in a String array because there are now multiple Strings.
