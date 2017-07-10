package strategy.quack;

/**
 * 鸣叫行为-有扬声器发出声音
 * Created by jme on 2017/7/10.
 */
public class QuackWithSpeaker implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("哇塞，它使用内置5.0的扬声器发出嘎嘎的声音……");
    }
}
