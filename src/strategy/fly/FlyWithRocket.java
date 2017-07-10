package strategy.fly;

/**
 * 飞行能力-有火箭飞行
 *
 * @author zhuweiming
 * @create 2017-07-09 09:39
 * @see strategy.fly
 */
public class FlyWithRocket implements FlyBehavior {
    /**
     * 用火箭飞行
     */
    @Override
    public void fly() {
        System.out.println("它在用火箭飞行，牛逼!");
    }
}
