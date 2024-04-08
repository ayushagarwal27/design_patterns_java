package structural.adapter;

public interface PaymentProvider {
    void makePayment();

    PaymentStatus getStatus(String paymentId);
}
