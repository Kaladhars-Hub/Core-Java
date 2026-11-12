package basics.Files.Write;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteUsingBufferedWriter {

    public static void main(String[] args) throws IOException {

        File file = new File("./Resources/output.text");

        FileWriter fw = new FileWriter(file);

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Hello Java");
        bw.newLine();
        bw.write("Iam learning BufferedWriter.");

        bw.close();
    }
}


/*
 * Summary:
 *
 * This program writes text to a file using BufferedWriter.
 *
 * Java Program → FileWriter → BufferedWriter → output.text
 *
 * 1. File represents the output.text file.
 * 2. FileWriter connects the file to the Java program for writing characters.
 * 3. BufferedWriter wraps the FileWriter and provides buffered text writing.
 * 4. write() writes text to the file.
 * 5. newLine() moves the next text to a new line.
 * 6. BufferedWriter uses a buffer, which reduces direct write operations
 *    to the file and can make writing large amounts of text more efficient.
 * 7. close() closes the BufferedWriter after writing is complete.
 *
 * Benefit of using BufferedWriter:
 * BufferedWriter is convenient for writing text efficiently, especially
 * when writing multiple lines or larger amounts of text.
 *
 * Important:
 * BufferedWriter writes the data to the file, not to the console.
 * Therefore, check output.text after running the program.
 *
 * Flow:
 *
 * String/Text
 *     ↓
 * FileWriter
 *     ↓
 * BufferedWriter
 *     ↓
 * output.text
 */