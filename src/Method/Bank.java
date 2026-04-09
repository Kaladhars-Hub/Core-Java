package Method;

public class Bank {

    // Static variable → shared across all objects
    static int currentBalance = 1000;

    // Static method → no object required
    public static void greetCustomer() {

        // Printing welcome message
        System.out.println("Hello, Welcome to the banking application!");
    }

    // Non-static method → requires object
    public void deposit(int money) {

        // Adding money to current balance
        // Beginner-friendly version:
        currentBalance = currentBalance + money;

        // Short version:
        // currentBalance += money;

        System.out.println("Amount deposited successfully!");
    }

    // Static method → can be called directly
    public static void withdrawal(int money) {

        // Subtracting money
        currentBalance -= money;

        System.out.println("Amount withdrawn successfully!");
    }

    // Method returning value
    public int getCurrentBalance() {

        // Returning value to caller
        return currentBalance;
    }

    public static void main(String[] args) {

        // Creating object to access non-static methods
        Bank bank = new Bank();

        // Calling static method
        greetCustomer();

        // Getting balance (method returns value)
        System.out.println("Current balance is - " + bank.getCurrentBalance());

        // Depositing money
        bank.deposit(500);

        System.out.println("Current balance is - " + bank.getCurrentBalance());

        // Withdrawing money
        withdrawal(300);

        System.out.println("Current balance is - " + bank.getCurrentBalance());
    }
}