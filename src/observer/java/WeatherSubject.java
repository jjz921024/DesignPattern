package observer.java;

import java.util.Observable;

/**
 * Created by Jun on 2017/8/4.
 */
public class WeatherSubject extends Observable {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        //在通知之前要调用setChanged方法
        this.setChanged();

        //拉模型
        this.notifyObservers();
        //推模型 带参数
        //this.notifyObservers(state);
    }
}
