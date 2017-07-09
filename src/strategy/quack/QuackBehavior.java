package strategy.quack;

/**
 * 鸣叫行为
 *
 * @author zhuweiming
 * @create 2017-07-09 09:14
 * @see strategy.quack
 */
public interface QuackBehavior {
    /**
     * 具体的鸣叫能力交给实现类去实现
     */
    void quack();
}
