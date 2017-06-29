package singlePattern;

/**
 * 用户信息--懒汉式
 *
 * @author zhuweiming
 * @create 2017-06-28 21:01
 * @see singlePattern
 */
public class LazyUser {
    /**
     * 私有静态实例
     */
    private static LazyUser lazyUser;

    /**
     * 获取实例对象，只有当要使用时才创建对象，好处是类加载快
     *
     * @return
     */
    public static LazyUser getInstance() {
        if (null == lazyUser) {
            lazyUser = new LazyUser();
        }

        return lazyUser;
    }

    /**
     * 私有构造
     */
    private LazyUser() {
    }

}
