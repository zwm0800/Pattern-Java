package obersver;

/**
 * 测试类
 * Created by jme on 2017/7/18.
 */
public class Client {
    public static void main(String[] args) {
        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();

        ConcreteSubject subject = new ConcreteSubject();
        subject.add(observer1);
        subject.add(observer2);

        subject.change("new state");

        subject.remove(observer1);

        subject.change("state");
    }
}
