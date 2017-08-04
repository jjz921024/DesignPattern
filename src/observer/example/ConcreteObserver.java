package observer.example;

/**
 * Created by Jun on 2017/8/3.
 */
public class ConcreteObserver implements Observer{
    private String observerName;

    //观察者知道的天气状态
    private String observerWeatherState;
    //观察者知道的报纸状态
    private int observerPaperState;


    /*@Override
    public void updateWeaher(WeatherSubject subject) {
        observerWeatherState = ((WeatherSubject) subject).getWeatherState();
        System.out.println(observerName + "知道了天气状态：" + observerWeatherState);
    }

    @Override
    public void updatePaper(WeatherSubject subject) {
        observerPaperState = ((PaperSubject)subject).getPaperSubject();
        System.out.println(observerName + "知道了报纸状态：" + observerPaperState);
    }*/

    @Override
    public void update(Subject subject) {
        if (subject instanceof PaperSubject) {
            observerPaperState = ((PaperSubject)subject).getPaperSubject();
            System.out.println(observerName + "知道了报纸状态：" + observerPaperState);
        } else if (subject instanceof  WeatherSubject) {
            observerWeatherState = ((WeatherSubject) subject).getWeatherState();
            System.out.println(observerName + "知道了天气状态：" + observerWeatherState);
        }
    }


    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }


}
