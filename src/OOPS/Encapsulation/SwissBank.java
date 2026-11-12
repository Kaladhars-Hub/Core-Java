package OOPS.Encapsulation;

public class SwissBank {

    // Private variable cannot be accessed directly from outside the class.
    // It can only be accessed through public methods (getter and setter).

    private int balance;

    // Setter method is used to update the balance.
    // It validates the value before storing it.

    public void setBalance(int balance) {

        if(balance >= 0 ) {
        this.balance = balance;            // Left side "name" is class variable and right side "name" variable is parameter which is same as parameter inside paranthesis.
        } else {
            System.out.println("Invalid balance");
        }
    }

        // Getter method is used to read the private balance.

        public int getBalance() {
            return balance;
        }
        }