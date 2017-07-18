package obersver;

/**
 * Created by jme on 2017/7/18.
 */
public class ObserverImpl1 implements Observer {
    @Override
    public void update(Subject subject) {
        ConcreteSubject concreteSubject = (ConcreteSubject) subject;
        System.out.println("observer1 收到通知！" + concreteSubject.getState());
    }
}
