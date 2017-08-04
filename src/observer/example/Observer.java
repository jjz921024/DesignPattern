package observer.example;

/**
 * Created by Jun on 2017/8/3.
 */
interface Observer {
    //void updateWeaher(WeatherSubject subject);
    //void updatePaper(WeatherSubject subject);
    void update(Subject subject);
}
