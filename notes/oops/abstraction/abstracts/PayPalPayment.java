package abstraction.abstracts;

public class PayPalPayment extends Payment{

    private String cardNumber;

    public PayPalPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }


    @Override
    public void paymentMethod() {
        System.out.println("Pay Pal Payment Processing : " +cardNumber);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Receipt of Transaction amount"+ amount);
        System.out.println("Receipt Time :"+System.currentTimeMillis());
    }
}
