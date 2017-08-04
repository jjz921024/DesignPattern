package observer.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by Jun on 2017/8/3.
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }


    protected void notifyObserver() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    /*protected void notifyObserverPaper() {
        for (Observer o : observers) {
            o.updatePaper(this);
        }
    }*/
}
