package basics.Files;

import java.io.File;
import java.io.IOException;

public class FileOperations {

    public static void main(String[] args) throws IOException {

        File file = new File("./Resources/resume.txt");

        // Check whether the file exists
        System.out.println(file.exists());

        // Create the file
        System.out.println(file.createNewFile());

        // Check whether it is a file
        System.out.println(file.isFile());

        // Check whether it is a directory
        System.out.println(file.isDirectory());

        // Check permissions
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        // Check whether it is hidden
        System.out.println(file.isHidden());

        // Get file name
        System.out.println(file.getName());

        // Get complete path
        System.out.println(file.getAbsolutePath());

        // Get parent
        System.out.println(file.getParent());

        // Delete the file
        // System.out.println(file.delete());
    }
}


//File folder = new File("./Resources");

//System.out.println(folder.mkdir());

//        System.out.println(folder.exists());
//        System.out.println(folder.isDirectory());

//        System.out.println(Arrays.toString(folder.list()));
//        System.out.println(Arrays.toString(folder.listFiles());