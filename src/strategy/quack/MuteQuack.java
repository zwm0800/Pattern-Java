package strategy.quack;

/**
 * 鸣叫行为-不会鸣叫
 * Created by jme on 2017/7/10.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("它不会叫……");
    }
}
