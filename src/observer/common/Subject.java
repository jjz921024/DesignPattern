package observer.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jun on 2017/8/3.
 */
public class Subject {
    //目标 内部维护了一个 订阅列表
    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有观察者的方法
     * 调用observer的update方法 即通知   (接口方法)
     * 将subject 订阅的主题传给 observer 处理
     *
     * 只有Subject的子类能调用  protected
     */
    protected void notifyObservers(){
        for (Observer o : observers) {
            o.update(this);
        }
    }
}
