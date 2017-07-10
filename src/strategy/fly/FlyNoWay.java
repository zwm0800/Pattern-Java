package strategy.fly;

/**
 * 飞行能力-无飞行能力
 * @author zhuweiming
 * @create 2017-07-09 09:37
 * @see strategy.fly
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("它无法飞行……");
    }
}
