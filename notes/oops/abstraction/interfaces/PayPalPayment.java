package abstraction.interfaces;

class PayPalPayment implements Payment {

    private double amount;
    private String email;

    public PayPalPayment(double amount, String email) {
        Payment.validateAmount(amount);
        this.amount = amount;
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal Payment");
        System.out.println("Amount: $" + amount);
        System.out.println("PayPal Account: " + email);
    }

    @Override
    public void refundPayment() {
        System.out.println("Refund sent to PayPal Account");
    }

    @Override
    public void generateReceipt() {
        System.out.println("Receipt Generated for PayPal Payment");
    }
}
