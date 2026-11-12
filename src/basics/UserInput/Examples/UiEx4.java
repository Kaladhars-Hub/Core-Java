package basics.UserInput.Examples;

import java.util.Scanner;

public class UiEx4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your Marks in Java: ");
        int java = sc.nextInt();

        System.out.println("Enter your Marks in SQL: ");
        int sql = sc.nextInt();

        System.out.println("Enter your Marks in Mathematics: ");
        int mathematics = sc.nextInt();


        int total = java+sql+mathematics;
        System.out.println("Total= " + (total));

        double average = total/3.0;
        System.out.println("Average: " + (average));

        double percentage = (total/300.0) * 100;
        System.out.println("Percentage: " + (percentage));

        System.out.println("----- Student Result -----\n");

        System.out.println("Name: " + name);

        System.out.println("Java: " + java);

        System.out.println("SQL: " + sql);

        System.out.println("Mathematics: " + mathematics);

        System.out.println("Total: " + total);

        System.out.println("Average: " + average);

        System.out.println("Percentage: " + percentage);

        sc.close();
    }

}


/*

Create a program that asks a student for:

Student name
Marks in Java
Marks in SQL
Marks in Mathematics

Assume each subject is out of 100.

Calculate:

Total marks
Java + SQL + Mathematics
Average
Total / 3
Percentage

Since each subject is out of 100:

(Total / 300) × 100

Then display:

----- Student Result -----
Name: ...
Java: ...
SQL: ...
Mathematics: ...
Total: ...
Average: ...
Percentage: ...
Example

If the student enters:

Java = 80
SQL = 75
Mathematics = 90

Then:

Total = 245
Average = 81.666...
Percentage = 81.666...

 */