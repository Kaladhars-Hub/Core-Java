package Collections.List;

import java.util.*;

public class ArrayListEx01 {

    public static void main(String[] args) {

        ArrayList<String> skills = new ArrayList<>();

        skills.add("Java");
        skills.add("SQL");
        skills.add("HTML");

        skills.set(2, "Spring Boot");
        skills.add(1, "Git");

        skills.remove("SQL");

        System.out.println(skills);
        System.out.println(skills.size());
    }
}


/*

🟢 ARRAYLIST-01 — Employee Skills Management

Requirements:

1. Create an ArrayList<String> named skills.
2. Add "Java", "SQL", and "HTML".
3. Replace "HTML" with "Spring Boot".
4. Add "Git" at index 1.
5. Remove "SQL" using its value.
6. Print the final ArrayList and its size.

 */