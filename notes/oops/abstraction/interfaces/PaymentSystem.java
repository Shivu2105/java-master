package abstraction.interfaces;

public class PaymentSystem {
    public static void main(String[] args) {

        // Abstraction: reference variable of interface
        Payment p1 = new CreditCardPayment(5000, "1234567812345678");

        Payment p2 = new PayPalPayment(2500, "user@gmail.com");

        // Runtime polymorphism
        p1.processPayment();
        p1.generateReceipt();
        p1.paymentStatus();

        System.out.println("----------------");

        p2.processPayment();
        p2.generateReceipt();
        p2.paymentStatus();

    }
}
