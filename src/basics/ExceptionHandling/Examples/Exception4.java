package basics.ExceptionHandling.Examples;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exception4 {

    public static void main(String[] args) {

        File f = new File("./Resources/output.txt");

        try(FileReader fr = new FileReader(f)) {     //try with resource


            int character;

            while ((character = fr.read()) != -1) {
            System.out.print((char)character);
            }
        }
            catch(IOException e) {
            System.out.println("File has a problem while reading");
            }

    }


}
