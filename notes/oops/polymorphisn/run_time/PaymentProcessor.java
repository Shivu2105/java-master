package polymorphisn.run_time;

public class PaymentProcessor {
    static void main() {
        Payment pay = new Payment();
        pay.details();

        // upcasting as using this we define at run time which method to be accessed not compile time dependency

        Payment upiWallet = new UpiWallet();
        upiWallet.details();

        Payment crPayment = new CryptoWallet();
        crPayment.details();

    }
}
