package structural.adapter;

public class PaymentProcessor {
    final private PaymentProvider paymentProvider;

    public PaymentProcessor(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }


    public void processPayment() {
        this.paymentProvider.makePayment();
        PaymentStatus status = this.paymentProvider.getStatus("paymentID");
    }
}
