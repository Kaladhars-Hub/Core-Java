package Collections.List;

import java.util.*;

public class VectorEx01 {

    public static void main(String[] args) {

        Vector <String> courses = new Vector<>();

        courses.add("Java");
        courses.add("SQL");
        courses.add("Python");

        courses.set(2, "Spring Boot");
        courses.add(1, "HTML");

        System.out.println(courses.contains("SQL"));

        courses.remove("HTML");

        System.out.println(courses);
        System.out.println(courses.size());
    }
}


/*

🟢 VECTOR-01 — Student Course Management

Create a Java program that manages a student's enrolled courses using Vector<String>.

Requirements:
1. Create an empty Vector named courses.
2. Add these courses in order: "Java", "SQL", "Python".
3. The student decides to replace "Python" with "Spring Boot".
4. The student then enrolls in "HTML" and wants it immediately after "Java".
5. Check whether "SQL" is present in the Vector.
6. Remove "HTML" using its value, not its index.
7. Print the final Vector and its size.

 */