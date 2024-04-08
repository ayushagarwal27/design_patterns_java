package structural.adapter;

public class PayPalAdapter implements PaymentProvider {
    //    We can initialise PayPal instance and call it individual api methods

    @Override
    public void makePayment() {
        System.out.println("Make PayPal payment");
    }

    @Override
    public PaymentStatus getStatus(String paymentId) {
        return PaymentStatus.NOTSTARTED;
    }
}
