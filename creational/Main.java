package creational;

public class Main {
    public static void main(String[] args) {

//        Singleton Pattern
        SingletonPattern singletonPattern = SingletonPattern.getInstance();
        SingletonPattern singletonPattern2 = SingletonPattern.getInstance();
        System.out.println(singletonPattern);
        System.out.println(singletonPattern2);

//        Builder Pattern
        BuilderPattern bd = BuilderPattern.getBuilder().setValueInteger(90).setValueString("Hi There").build();
        System.out.println(bd.getValueInteger());
        System.out.println(bd.getValueString());
    }
}
