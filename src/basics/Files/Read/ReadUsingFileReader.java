package basics.Files.Read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadUsingFileReader {

    public static void main(String[] args) throws IOException {

        // Represents the text file.
        File file = new File("./Resources/Sample.txt");

        // FileReader is used to read characters from a text file.
        FileReader fr = new FileReader(file);

        int character;

        // read() reads one character at a time.
        // It returns -1 when the end of the file is reached.
        while ((character = fr.read()) != -1) {

            // Convert the integer value into a character
            // and print it.
            System.out.print((char) character);

        }

        // Close the reader after reading is complete.
        fr.close();

    }
}



/*
 * Summary:
 *
 * This program reads characters from a text file using FileReader.
 *
 * File → FileReader → Java Program → Console
 *
 * 1. File represents the Sample.txt file.
 * 2. FileReader connects the text file to the Java program.
 * 3. FileReader reads the file one character at a time.
 * 4. read() returns the character as an integer value.
 * 5. (char) converts the integer value into a character.
 * 6. The character is printed to the console.
 * 7. read() returns -1 when the end of the file is reached.
 * 8. FileReader is closed after reading is complete.
 *
 * Benefit of using FileReader:
 * FileReader is designed specifically for reading character/text data.
 * It is simpler than FileInputStream when working with text files,
 * because you work with characters instead of raw bytes.
 *
* FileReader
 * → Used for reading character/text data.
 * → Good when you want to read a text file character by character.
 */
