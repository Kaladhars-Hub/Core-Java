package OOPS.Inheritance.Examples;

public class AccountEx8 {
    String bank = "SBI";

    AccountEx8() {
        System.out.println("Account created");
    }
}
class SavingsEx8 extends AccountEx8 {

    String bank = "HDFC";
    SavingsEx8() {
        super();
        System.out.println("Savings created");
    }

    void showBanks() {
        System.out.println(bank);
        System.out.println(super.bank);
    }
    public static void main(String[] args) {

        SavingsEx8 s = new SavingsEx8();

        s.showBanks();
    }
}

/*

When this executes:

SavingsEx8 s = new SavingsEx8();

Java enters the child constructor:
SavingsEx8() {
    super();
    System.out.println("Savings created");
}

Then:
super();

calls the immediate parent constructor:
AccountEx8()

so:
Account created

prints first. Then control returns to the child constructor and:
Savings created

prints.
Later:
s.showBanks();

executes:
System.out.println(bank);        // HDFC
System.out.println(super.bank);  // SBI

So you've correctly combined two different uses of super:
super()      → parent constructor
super.bank   → parent variable

 */