package abstraction.abstracts;

public class GpayPayment extends Payment{

    private String accountNumber;

    public GpayPayment(double amount, String accountNumber){
        super(amount);
        this.accountNumber = accountNumber;
    }

    @Override
    public void paymentMethod() {
        System.out.println("Gpay Payment Processing for accountNumber :"+accountNumber);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Receipt Generated for amount : "+amount);
        System.out.println("Receipt Time :"+System.currentTimeMillis());
    }
}
