package structural.decorator;

public abstract class CommunicatorDecorator implements Communicator {
    protected Communicator communicator;

    CommunicatorDecorator(Communicator communicator) {
        this.communicator = communicator;
    }
}
