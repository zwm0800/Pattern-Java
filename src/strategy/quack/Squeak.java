package strategy.quack;

/**
 * 鸣叫行为-吱吱叫
 * Created by jme on 2017/7/10.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("它发吱吱的叫声……");
    }
}
