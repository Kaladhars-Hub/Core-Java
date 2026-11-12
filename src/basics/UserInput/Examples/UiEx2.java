package basics.UserInput.Examples;

import java.util.Scanner;

public class UiEx2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product name: ");
        String product = sc.nextLine();

        System.out.println("Enter price: ");
        double price = sc.nextDouble();

        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.println("----- Bill -----");
        System.out.println("Product: " + product);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total= " + (price*quantity));

        sc.close();

    }
}



/*

Problem

Create a program that asks the user for:

Product name
Product price
Quantity

Then calculate:

Total = price × quantity

Example:

Enter product name:
Laptop

Enter price:
65000.50

Enter quantity:
2

----- Bill -----
Product: Laptop
Price: 65000.50
Quantity: 2
Total: 130001.0

 */