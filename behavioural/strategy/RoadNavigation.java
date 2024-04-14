package behavioural.strategy;

public class RoadNavigation implements NavigationStrategy {
    @Override
    public void navigate(Point from, Point to) {
        System.out.println("Travelling by road from: " + from.x + " to " + to.x);
    }
}
