package behavioural.strategy;

public class AirNavigation implements NavigationStrategy {
    @Override
    public void navigate(Point from, Point to) {
        System.out.println("Travelling by air from: " + from.x + " to " + to.x);
    }
}
