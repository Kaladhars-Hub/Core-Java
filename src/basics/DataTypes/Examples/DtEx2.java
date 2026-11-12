package basics.DataTypes.Examples;

public class DtEx2 {

    public static void main(String[] args) {

        double laptop = 65000.50;
        int laptopQuantity = 2;
        double mouse = 750.75;
        int mouseQuantity = 1;

        System.out.println("Laptop Total: " + laptopQuantity * laptop);
        System.out.println("Mouse Total: " + mouseQuantity * mouse);
        System.out.println("Grand Total = " + (laptopQuantity * laptop + mouseQuantity * mouse));
    }
}




/*

Create a program for a shopping bill.

A customer buys:

A laptop costing 65000.50
2 laptops
A mouse costing 750.75
1 mouse

Your program must calculate:

Total laptop cost

Total mouse cost

Grand total

Output should be similar to:

Laptop Price: 65000.50
Laptop Quantity: 2
Mouse Price: 750.75
Mouse Quantity: 1


Laptop Total: ...
Mouse Total: ...
Grand Total: ...
Rules
Choose the data types yourself.
Use variables.
Use arithmetic operators.
Put your variables inside main().
Use the traditional:
public static void main(String[] args)

 */