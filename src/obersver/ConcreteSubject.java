package obersver;

/**
 * 具体主题实现
 * Created by jme on 2017/7/18.
 */
public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    /**
     * 状态改变
     * @param state 新的状态值
     */
    public void change(String state) {
        this.state = state;
        notifyObservers();
    }

}
