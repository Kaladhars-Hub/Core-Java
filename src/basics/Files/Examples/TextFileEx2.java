package basics.Files.Examples;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFileEx2 {

    public static void main(String[] args) throws IOException {

        File f = new File("./Resources/output.txt");
        FileReader fr = new FileReader(f);

        int character;

        while ((character = fr.read()) != -1){

            System.out.print((char) character);

        }
        fr.close();
    }
}