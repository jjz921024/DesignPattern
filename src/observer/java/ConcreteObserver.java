package observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Jun on 2017/8/4.
 */
public class ConcreteObserver implements Observer {

    private String observerName;

    @Override
    public void update(Observable o, Object arg) {
        //拉模型
        WeatherSubject o1 = (WeatherSubject) o;
        System.out.println(observerName + "收到了消息，拉消息" + o1.getState());

        //推模型
        //System.out.println(observerName + "收到了消息，推消息" + arg);
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }
}
