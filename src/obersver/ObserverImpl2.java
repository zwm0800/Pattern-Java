package obersver;

/**
 * Created by jme on 2017/7/18.
 */
public class ObserverImpl2 implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("observer2 收到通知！" + ((ConcreteSubject) subject).getState());
    }
}
