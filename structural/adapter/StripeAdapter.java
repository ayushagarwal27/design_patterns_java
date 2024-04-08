package structural.adapter;

public class StripeAdapter implements PaymentProvider {
//    We can initialise Stripe instance and call it individual api methods
    
    @Override
    public void makePayment() {
        System.out.println("Make Stripe payment");
    }

    @Override
    public PaymentStatus getStatus(String paymentId) {
        return PaymentStatus.NOTSTARTED;
    }
}
