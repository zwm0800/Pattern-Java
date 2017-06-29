package singlePattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例测试类
 *
 * @author zhuweiming
 * @create 2017-06-28 21:07
 * @see singlePattern
 */
public class Client {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        // 懒汉式
        LazyUser lazyUser1 = LazyUser.getInstance();
        LazyUser lazyUser2 = LazyUser.getInstance();
        System.out.println(lazyUser1.equals(lazyUser2));

        // 饿汉式
        HungryUser hungryUser1 = HungryUser.getInstance();
        HungryUser hungryUser2 = HungryUser.getInstance();
        System.out.println(hungryUser1.equals(hungryUser2));

        /**
         * 通过反射验证普通单例类并不能保证对象的唯一性
         */
        Class<?> lazyUserClazz = LazyUser.class;
        Constructor[] constructors = lazyUserClazz.getDeclaredConstructors();
        for (Constructor c : constructors) {
            // 设置可访问私有属性
            c.setAccessible(true);
            // 调用无参构造实例对象
            LazyUser lazyUser3 = (LazyUser) c.newInstance();
            // 此时lazyUser3与lazyUser1不再是同一对象
            System.out.println(lazyUser3.equals(lazyUser1));
        }
    }
}
