package OOPS.Encapsulation;

public class StateBank {
    public int balance = 100;

    // Without Encapsulation:
// balance is public, so anyone can directly access and modify it.
// There is no control or validation before changing the value.

public static void main(String[] args) {
StateBank s = new StateBank();
s.balance = -50;     // So the invalid value is allowed here because of no Encapsulation or controlled methods.
    System.out.println(s.balance);
}
}
