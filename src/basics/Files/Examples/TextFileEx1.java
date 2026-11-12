package basics.Files.Examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileEx1 {

    public static void main(String[] args) {

        try{
            File f = new File("./Resources/output.text");

            FileWriter fw = new FileWriter(f, true); //writing

            fw.write("\nCourse: Java");

            fw.close();

            System.out.println("Data written successfully");

        }
        catch (IOException e) {
            System.out.println("Problem writing to file");

        }


    }
}
