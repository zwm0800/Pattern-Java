package singlePattern;

/**
 * 单例模式--饿汉式
 *
 * @author zhuweiming
 * @create 2017-06-28 21:08
 * @see singlePattern
 */
public class HungryUser {
    /**
     * 静态自身对象，在类加载时即创建实例，好处是运行时快
     */
    private static HungryUser hungryUser = new HungryUser();

    public static HungryUser getInstance() {
        return hungryUser;
    }

    private HungryUser() {
    }

}
