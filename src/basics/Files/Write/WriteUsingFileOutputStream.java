package basics.Files.Write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUsingFileOutputStream {

    public static void main(String[] args) throws IOException {

        File file = new File("./Resources/output.txt");

        String text = "HELLO";

        FileOutputStream fos = new FileOutputStream(file);

        fos.write(text.getBytes());

        fos.close();

    }
}


/*
 * Summary:
 *
 * This program writes text to a file using FileOutputStream.
 *
 * Java Program → FileOutputStream → output.txt
 *
 * 1. File represents the output.txt file.
 * 2. A String variable stores the text we want to write.
 * 3. FileOutputStream connects the Java program to the file for writing.
 * 4. getBytes() converts the String into bytes.
 * 5. FileOutputStream writes those bytes into the file.
 * 6. close() closes the output stream after writing is complete.
 *
 * Benefit of using FileOutputStream:
 * FileOutputStream works with byte data, so it can be used to write
 * both text and binary data to a file.
 *
 * Important:
 * FileOutputStream writes the data to the file, not to the console.
 * Therefore, after running the program, check output.txt to see the result.
 *
 * Flow:
 *
 * String
 *   ↓
 * getBytes()
 *   ↓
 * byte[]
 *   ↓
 * FileOutputStream
 *   ↓
 * output.txt
 */