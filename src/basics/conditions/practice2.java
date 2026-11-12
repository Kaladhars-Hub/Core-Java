package basics.conditions;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day name: ");

        String Day = sc.nextLine();

        switch (Day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Uff,its a weekday");
                break;

            case "Saturday":
            case "Sunday":
                System.out.println("yayy,its a weekend");
                break;

            default:
                System.out.println("Invalid day name");

        }
        sc.close();

    }
}
