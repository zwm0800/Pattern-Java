package strategy.duck;

/**
 * 绿头鸭
 * Created by jme on 2017/7/10.
 */
public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是一只MallardDuck……");
        performQuack();
        performFly();
    }
}
