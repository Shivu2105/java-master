package abstraction.interfaces;

public interface Payment {

    void processPayment();

    void refundPayment();

    void generateReceipt();

    default void paymentStatus() {
        System.out.println("Payment completed successfully.");
    }

    static void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
    }
}