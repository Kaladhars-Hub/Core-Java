package OOPS.Interface.Examples;

public class UpiPaymentEx3 implements PaymentEx3 {


    @Override
    public void pay() {
        System.out.println("Payment through UPI");
    }
    public static void main(String[] args) {

        UpiPaymentEx3 u = new UpiPaymentEx3();

        u.pay();
        u.showMessage();
    }
}
