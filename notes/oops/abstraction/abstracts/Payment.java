package abstraction.abstracts;

abstract class Payment {

    protected double amount;

    public Payment(double amount){
        this.amount = amount;
    }

    public abstract void paymentMethod();
    public abstract void generateReceipt();

    // Concrete method - common for all payment types
    public void logTransaction() {
        System.out.println("Transaction logged for: $" + amount);
        System.out.println("Timestamp: " + System.currentTimeMillis());
    }

    public void executePayment(){
        paymentMethod();
        generateReceipt();
        logTransaction();
    }
}
