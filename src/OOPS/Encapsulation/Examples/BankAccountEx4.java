package OOPS.Encapsulation.Examples;

public class BankAccountEx4 {

   private int accountNumber = 12345;
    private int balance = 5000;

    public int getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int newBalance) {
        if(newBalance >= 0) {
            balance = newBalance;
        }
        }
    public static void main(String[] args) {
        BankAccountEx4 b = new BankAccountEx4();

        System.out.println(b.getAccountNumber());
        System.out.println(b.getBalance());
        b.setBalance(8000);
        System.out.println(b.getBalance());
        b.setBalance(-2000);
        System.out.println(b.getBalance());
    }
}
