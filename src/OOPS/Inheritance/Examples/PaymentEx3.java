package OOPS.Inheritance.Examples;

public class PaymentEx3 {

    String customerName;
    void showCustomerName() {
        System.out.println(customerName);
    }
}
class UpiEx3 extends PaymentEx3 {

    String upiId;
    void showUpiId() {
        System.out.println(upiId);
    }
}

class CardEx3 extends PaymentEx3 {

    String cardType;
    void showCardType() {
        System.out.println(cardType);
    }
    public static void main(String[] args) {

        UpiEx3 u = new UpiEx3();
        CardEx3 c = new CardEx3();

        u.customerName = "Rahul";
        u.upiId = "rahul@upi";

        c.customerName = "John";
        c.cardType = "Credit Card";

        u.showCustomerName(); // inherited
        u.showUpiId();        // UpiEx3's own

        c.showCustomerName(); // inherited
        c.showCardType();     // CardEx3's own
    }
}
