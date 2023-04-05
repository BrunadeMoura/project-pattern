import one.facade.Facade;
import one.singleton.SingletonEager;
import one.singleton.SingletonLazy;
import one.singleton.SingletonLazyHolder;
import one.strategy.AgressiveBehavior;
import one.strategy.Behavior;
import one.strategy.DefensiveBehavior;
import one.strategy.NormalBehavior;
import one.strategy.Robot;

public class Test {
    public static void main(String[] args) {
        // Testes relacionados ao Design Pattern Singleton
        System.out.println("_______________________Singleton_______________________");

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager Eager = SingletonEager.getInstancia();
        System.out.println(Eager);
        Eager = SingletonEager.getInstancia();
        System.out.println(Eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        System.out.println(" ");
        System.out.println("_______________________Strategy_______________________");
        Behavior defensive = new DefensiveBehavior();
        Behavior normal = new NormalBehavior();
        Behavior agressive = new AgressiveBehavior();

        Robot robot = new Robot();

        robot.setStrategy(normal);
        robot.move();
        robot.move();

        robot.setStrategy(defensive);
        robot.move();

        robot.setStrategy(agressive);
        robot.move();
        robot.move();
        robot.move();

        System.out.println(" ");
        System.out.println("_______________________Facade_______________________");
        Facade facade = new Facade();
        facade.MigrarCliente("Bruna", "12.345-678");
    }
}
