package strategy.client;

import strategy.duck.Duck;
import strategy.duck.MallardDuck;
import strategy.duck.ModelDuck;
import strategy.fly.FlyNoWay;
import strategy.fly.FlyWithRocket;
import strategy.fly.FlyWithSwings;
import strategy.quack.MuteQuack;
import strategy.quack.Quack;
import strategy.quack.QuackWithSpeaker;

/**
 * 测试类
 *
 * @author zhuweiming
 * @create 2017-07-09 09:44
 * @see strategy.client
 */
public class Client {
    public static void main(String[] args) {
        // 模型鸭子，不会飞也不会叫
        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyNoWay());
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();

        // 想飞？给它造台火箭，带它装逼带它飞
        modelDuck.setFlyBehavior(new FlyWithRocket());
        // 想叫？老板来台5.0的扬声器，让它吼
        modelDuck.setQuackBehavior(new QuackWithSpeaker());
        modelDuck.performQuack();
        modelDuck.performFly();

        // 绿头鸭
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setQuackBehavior(new Quack());
        mallardDuck.setFlyBehavior(new FlyWithSwings());
        mallardDuck.display();

        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
