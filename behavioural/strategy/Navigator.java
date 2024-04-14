package behavioural.strategy;

public class Navigator {
    private NavigationStrategy navigationStrategy;

    public Navigator(NavigationStrategy navigationStrategy) {
        this.navigationStrategy = navigationStrategy;
    }

    public void navigate(Point from, Point to) {
        navigationStrategy.navigate(from, to);
    }
}
