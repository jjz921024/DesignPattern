package observer.example;

import org.junit.jupiter.api.Test;

/**
 * Created by Jun on 2017/8/3.
 */
public class Main {
    @Test
    public void test() {
        //创建主题
        WeatherSubject weatherSubject = new WeatherSubject();
        PaperSubject paperSubject = new PaperSubject();

        //创建观察者
        ConcreteObserver o1 = new ConcreteObserver();
        o1.setObserverName("张逗");
        ConcreteObserver o2 = new ConcreteObserver();
        o2.setObserverName("张花");

        //向主题注册观察者
        weatherSubject.attach(o1);
        weatherSubject.attach(o2);
        paperSubject.attach(o1);

        //发布状态
        weatherSubject.setWeatherState("这是第一条状态");
        weatherSubject.setWeatherState("这是第二条状态");
        paperSubject.setPaperSubject(1);
    }
}
