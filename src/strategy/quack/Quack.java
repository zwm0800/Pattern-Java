package strategy.quack;

/**
 * 鸣叫行为-呱呱叫声
 * Created by jme on 2017/7/10.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("它发出呱呱的叫声……");
    }
}
