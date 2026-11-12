package basics.Files.Write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingFileWriter {

    public static void main(String[] args) throws IOException {

        File file = new File("./Resources/output.text");

        FileWriter fw = new FileWriter(file);

        String text = "Hello Java\nIam learning File Handling.";

        fw.write(text);

        fw.close();
    }
}


/*
 * Summary:
 *
 * This program writes text to a file using FileWriter.
 *
 * Java Program → FileWriter → output.text
 *
 * 1. File represents the output.text file.
 * 2. FileWriter connects the file to the Java program for writing.
 * 3. A String variable stores the text that needs to be written.
 * 4. FileWriter allows us to write the String directly without converting
 *    it into bytes using getBytes().
 * 5. fw.write(text) writes the complete text to the file.
 * 6. \n is used to move the next text to a new line.
 * 7. close() closes the FileWriter after writing is complete.
 *
 * Benefit of using FileWriter:
 * FileWriter is designed for writing character/text data.
 * It is more convenient than FileOutputStream when working with
 * normal text because we can write a String directly.
 *
 * Important:
 * FileWriter writes the data to the file, not to the console.
 * Therefore, check output.text after running the program.
 *
 * Flow:
 *
 * String
 *   ↓
 * FileWriter
 *   ↓
 * Character/Text data
 *   ↓
 * output.text
 */

