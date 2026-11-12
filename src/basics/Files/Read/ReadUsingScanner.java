package basics.Files.Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadUsingScanner {

    public static void main(String[] args) throws IOException {

        // Represents the sample.txt file.
        File file = new File("./Resources/Sample.txt");

        // FileInputStream connects the file to Java.
        FileInputStream fis = new FileInputStream(file);

        // Scanner reads data from the FileInputStream.
        Scanner sc = new Scanner(fis);

        while (sc.hasNextLine()) {

            // nextLine() reads the next complete line.
            System.out.println(sc.nextLine());
        }


        // Close the Scanner after reading is complete.
            sc.close();

            // Close the input stream.
            fis.close();

        }


    }

/*
 * Summary:
 *
 * This program reads text from a file using Scanner.
 *
 * File → FileInputStream → Scanner → Java Program → Console
 *
 * 1. File represents the sample.txt file.
 * 2. FileInputStream connects the file to the Java program.
 * 3. Scanner reads the data from the FileInputStream.
 * 4. hasNextLine() checks whether another line is available.
 * 5. nextLine() reads one complete line at a time.
 * 6. Each line is printed to the console.
 * 7. Scanner and FileInputStream are closed after reading.
 *
 * Benefit of using Scanner:
 * Scanner makes it easy to read and process data in different formats,
 * such as lines, words, integers, and other primitive data types.
 * It is especially convenient when reading text line by line or
 * extracting specific types of input.
 */