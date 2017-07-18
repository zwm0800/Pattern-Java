package obersver;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者观察的主题
 * Created by jme on 2017/7/18.
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    /**
     * 增加观察者
     *
     * @param observer 观察者实例
     */
    public void add(Observer observer) {
        if (null == observer) {
            throw new NullPointerException();
        }

        if (!this.observers.contains(observer)) {
            this.observers.add(observer);
        }
    }

    /**
     * 删除观察者
     *
     * @param observer 观察者实例
     */
    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    /**
     * 通知观察者
     */
    public void notifyObservers() {
        this.observers.forEach(observer -> {
            observer.update(this);
        });
    }
}
