package basics.conditions;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks: ");

        int marks = sc.nextInt();

        if (marks < 35) {
            System.out.println("fail");
        }
         else if (marks == 35) {
            System.out.println("Pass");
        }
         else if (marks > 35 && marks <= 70) {
        System.out.println("Third Class");
    }
                else if(marks >70 && marks <= 85) {
        System.out.println("Second Class");
    }
        else  {
            System.out.println("first class");
}

            sc.close();

    }
}
