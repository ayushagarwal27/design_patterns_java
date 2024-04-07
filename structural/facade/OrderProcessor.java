package structural.facade;

public class OrderProcessor {
    private int payment;
    private String inventory;

    public void process() {
        System.out.println("Make payment amount: " + this.payment);
        System.out.println("We have inventory: " + this.inventory);
    }
}
