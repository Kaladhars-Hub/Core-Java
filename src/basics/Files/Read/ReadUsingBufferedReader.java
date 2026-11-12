package basics.Files.Read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadUsingBufferedReader {

    public static void main(String[] args) throws IOException {

        // Represents the text file.
        File file = new File("./Resources/Sample.txt");

        // FileReader connects the file for character reading.
        FileReader fr = new FileReader(file);

        // BufferedReader wraps the FileReader.
        // It allows us to conveniently read text line by line.
        BufferedReader br = new BufferedReader(fr);

        String line;

        // readLine() reads one complete line.
        // It returns null when there are no more lines.
        while ((line = br.readLine()) != null) {
        //Read one line → store it in line → if it is not null, print it → repeat.
            System.out.println(line);
        }

        // Close the BufferedReader.
        br.close();

        // Close the FileReader.
        fr.close();

    }
}


/*
 * Summary:
 *
 * This program reads text from a file using BufferedReader.
 *
 * File → FileReader → BufferedReader → Java Program → Console
 *
 * 1. File represents the Sample.txt file.
 * 2. FileReader connects the text file for character-based reading.
 * 3. BufferedReader wraps the FileReader and provides efficient reading.
 * 4. readLine() reads one complete line at a time.
 * 5. readLine() returns null when the end of the file is reached.
 * 6. Each line is stored in the String variable "line".
 * 7. Each line is printed to the console.
 * 8. BufferedReader and FileReader are closed after reading is complete.
 *
 * Benefit of using BufferedReader:
 * BufferedReader makes it easy to read text line by line instead of
 * reading one character at a time.
 *
 * It also uses a buffer, which reduces the number of direct read
 * operations from the file and makes reading large text files more efficient.
 *
 *
 * Flow:
 *
 * File
 *   ↓
 * FileReader
 *   ↓
 * BufferedReader
 *   ↓
 * readLine()
 *   ↓
 * Java Program
 *   ↓
 * Console
 */