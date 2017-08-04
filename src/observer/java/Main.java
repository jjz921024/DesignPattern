package observer.java;

import org.junit.Test;

/**
 * Created by Jun on 2017/8/4.
 */
public class Main {
    @Test
    public void test() {
        WeatherSubject weatherSubject = new WeatherSubject();

        ConcreteObserver o1 = new ConcreteObserver();
        o1.setObserverName("张花");

        weatherSubject.addObserver(o1);

        weatherSubject.setState("天气晴");
    }
}
