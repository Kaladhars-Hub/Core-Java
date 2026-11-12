package basics.conditions.Examples;

import java.util.Scanner;

public class ConditionsEx27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Did you pass the driving test?");
        boolean hasPassedTest = sc.nextBoolean();

        System.out.println("Did you submit the required documents?");
        boolean submittedRequiredDocuments = sc.nextBoolean();

        if(age >=18 && hasPassedTest && submittedRequiredDocuments) {
            System.out.println("Eligible to Apply");
        }else{
            System.out.println("Not Eligible to Apply");
        }
        sc.close();
    }
}


/*

OP-28 — Driving License

A person is allowed to apply for a driving license if:

They are 18 years or older
AND they have passed the driving test
AND they have submitted the required documents.

Print:

Eligible to Apply

or

Not Eligible to Apply

 */