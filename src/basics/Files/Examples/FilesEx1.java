package basics.Files.Examples;

import java.io.File;
import java.io.IOException;

public class FilesEx1 {

    public static void main(String[] args) {

        File f = new File("student.txt");

        try {
            if(f.createNewFile()) {
                System.out.println("File created successfully");
            }else {
                System.out.println("File already existed");
            }
            System.out.println(f.exists());
            System.out.println(f.getName());
            System.out.println(f.getAbsolutePath());

        } catch(IOException e) {
            System.out.println("File has a problem");
        }

    }
}

/*

Create a Java class called FileEx1 in IntelliJ.

Requirements:

1. Create a File object representing student.txt.
2. Attempt to create the actual file using createNewFile().
3. If it is created, print File created successfully.
4. If it already exists, print File already exists.
5. Afterward, print whether the file exists, its name, and its absolute path.
6. Handle the possible IOException using try-catch.
Use only the methods we just learned. The File and IOException imports are the same as in our examples.


Expected output on the first run (assuming the file is created successfully):
File created successfully
true
student.txt
/Users/.../student.txt

 */