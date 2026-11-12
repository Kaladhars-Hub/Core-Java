/*
   What we're demonstrating:

   FileInputStream → reads data from a file byte by byte.

   Flow:
   File → FileInputStream → Java Program → Console
*/


package basics.Files.Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadUsingFileInputStream {

    public static void main(String[] args) throws IOException {

        // File object represents the sample.txt file.
        // This does not read the file yet.
        File file = new File("./Resources/Sample.txt");

        // FileInputStream is used to read data from the file.
        // It reads the data byte by byte.
        FileInputStream fis = new FileInputStream(file);

        int asciiCode;

        // read() reads one byte at a time and returns its integer value.
        // We convert each byte to a character using (char), so the output
        // appears as normal text instead of showing the numeric byte values.
        // read() returns -1 when the end of the file is reached.
        // Therefore, we continue reading until we get -1.

        while ((asciiCode = fis.read()) != -1) {

            // Convert the integer value into a character
            // and print it on the console.
            System.out.print((char) asciiCode);
        }
    }


}
