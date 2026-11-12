package OOPS.Interface.Examples;

public interface PaymentEx3 {

    void pay();

    default void showMessage() {
        System.out.println("Payment processing");
    }
}
