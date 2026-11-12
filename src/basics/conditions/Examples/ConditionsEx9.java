package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();

        if(marks >= 90) {
            System.out.println("Grade-A");
        }else if(marks >= 75) {
            System.out.println("Grade-B");
        }else if(marks >=60) {
            System.out.println("Grade-C");
        } else if (marks >=35) {
            System.out.println("Grade-D");
        }else{
            System.out.println("Fail");
        }
        sc.close();
    }
}


/*

This will strengthen your if → else if → else logic.

Write a Java program that takes a student's marks as input and prints the grade according to these rules:

|    Marks | Grade |
| -------: | :---- |
|   90–100 | A     |
|    75–89 | B     |
|    60–74 | C     |
|    35–59 | D     |
| Below 35 | Fail  |

Because Java checks the conditions from top to bottom, you don't need to write an upper limit for every grade.

For example:

if marks >= 90       → A
else if marks >= 75  → B
else if marks >= 60  → C
else if marks >= 35  → D
else                 → Fail

Why does marks >= 75 correctly mean 75–89?

Because if the mark were 90 or more, Java would have already entered the first if. So when Java reaches:

else if(marks >= 75)

we already know the mark is less than 90.

Now your turn

Write the complete Java program yourself.

Use:

Scanner
int marks
if
else if
else
sc.close()


Java checks top to bottom and stops at the first true condition.

For example, if:

marks = 82

Java checks:

82 >= 90  ❌
82 >= 75  ✅ → Grade B

It prints B and doesn't check the remaining conditions.

 */