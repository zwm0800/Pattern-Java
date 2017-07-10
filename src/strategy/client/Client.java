package strategy.client;

import strategy.duck.Duck;
import strategy.duck.ModelDuck;
import strategy.fly.FlyNoWay;

/**
 * 测试类
 *
 * @author zhuweiming
 * @create 2017-07-09 09:44
 * @see strategy.client
 */
public class Client {
    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyNoWay());
        modelDuck.display();
    }
}
