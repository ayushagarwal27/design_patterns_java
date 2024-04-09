package structural.decorator;

public class EmailService implements Communicator {
    @Override
    public void send(String target, String message) {
        System.out.println("Sending email to " + target + " having message " + message);
    }
}
