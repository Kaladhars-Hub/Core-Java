package OOPS.Inheritance.Examples;

public class PaymentEx9 {

    void processPayment() {
        System.out.println("Processing general payment");
    }
}

class UpiPaymentEx9 extends PaymentEx9 {

    void processPayment() {
        System.out.println("Processing UPI payment");
    }

    void showPaymentProcess() {
        processPayment();
        super.processPayment();

    }
    public static void main(String[] args) {

        UpiPaymentEx9 u = new UpiPaymentEx9();

        u.showPaymentProcess();
    }
}
