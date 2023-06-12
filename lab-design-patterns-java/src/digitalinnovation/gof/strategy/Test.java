package digitalinnovation.gof.strategy;

import digitalinnovation.gof.singleton.SingletonEager;
import digitalinnovation.gof.singleton.SingletonLazy;
import digitalinnovation.gof.singleton.SingletonLazyHolder;

public class Test {
    public static void main(String[] args) {
        Behavior defense = new DefenseBehavior();
        Behavior aggressive = new AggressiveBehavior();
        Behavior normal = new NormalBehavior();

        Robot robot = new Robot();

        robot.setStrategy(normal);
        robot.move();
        robot.setStrategy(defense);
        robot.move();
        robot.setStrategy(aggressive);
        robot.move();
    }
}
