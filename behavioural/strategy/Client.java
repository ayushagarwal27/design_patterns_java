package behavioural.strategy;

public class Client {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new RoadNavigation());
        navigator.navigate(new Point(0, 0), new Point(10, 5));
    }
}
