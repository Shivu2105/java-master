package abstraction.abstracts;

public class PaymentProcessor {
    static void main() {
        Payment payPal = new PayPalPayment(99.00, "12345142362");
        payPal.executePayment();

        Payment gPay = new GpayPayment(199.00, "110100101010");
        gPay.executePayment();
    }
}
