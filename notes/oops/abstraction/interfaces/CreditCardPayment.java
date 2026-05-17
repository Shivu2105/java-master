package abstraction.interfaces;

public  class CreditCardPayment implements Payment {

    private double amount;
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        Payment.validateAmount(amount);
        this.amount = amount;
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card Payment");
        System.out.println("Amount: $" + amount);
        System.out.println("Card Number: **** **** **** "
                + cardNumber.substring(cardNumber.length() - 4));
    }

    @Override
    public void refundPayment() {
        System.out.println("Refund sent to Credit Card");
    }

    @Override
    public void generateReceipt() {
        System.out.println("Receipt Generated for Credit Card Payment");
    }
}