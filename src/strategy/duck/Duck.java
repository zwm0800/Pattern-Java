package strategy.duck;

import strategy.fly.FlyBehavior;
import strategy.quack.QuackBehavior;

/**
 * 鸭子类
 *
 * @author zhuweiming
 * @create 2017-07-09 09:12
 * @see strategy.duck
 */
public abstract class Duck {
    /**
     * 飞行行为
     */
    private FlyBehavior flyBehavior;

    /**
     * 鸣叫行为
     */
    private QuackBehavior quackBehavior;

    /**
     * 鸭子飞行
     */
    public void performFly() {
        if (null != flyBehavior) {
            flyBehavior.fly();
        }
    }

    /**
     * 鸭子鸣叫
     */
    public void performQuack() {
        if (null != quackBehavior) {
            quackBehavior.quack();
        }
    }

    /**
     * 提供飞行行为的setter，子类具备什么飞行行为就传递什么飞行行为具体实现类
     *
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 提供鸣叫行为的setter，子类具备什么鸣叫行为就传递什么鸣叫行为具体实现类
     *
     * @param quackBehavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
