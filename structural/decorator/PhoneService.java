package structural.decorator;

public class PhoneService extends CommunicatorDecorator {

    public PhoneService(Communicator communicator) {
        super(communicator);
    }

    @Override
    public void send(String target, String message) {
        communicator.send(target, message);
        System.out.println("Sending phone sms to " + target + " having message " + message);
    }
}
