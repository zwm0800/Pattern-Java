package obersver;

/**
 * 观察者
 * Created by jme on 2017/7/18.
 */
public interface Observer {
    /**
     * 更新操作
     * @param subject 主题对象
     */
    void update(Subject subject);
}
