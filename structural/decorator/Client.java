package structural.decorator;

public class Client {
    public static void main(String[] args) {
        Communicator emailService = new EmailService();
        Communicator phoneService = new PhoneService(emailService);
        phoneService.send("John", "Hi There John!");
    }
}
