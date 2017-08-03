package observer.example;

/**
 * Created by Jun on 2017/8/3.
 */
public class WeatherSubject extends Subject {

    private String weatherState;

    public String getWeatherState() {
        return weatherState;
    }

    public void setWeatherState(String weatherState) {
        this.weatherState = weatherState;
        this.notifyObserverWeather();
    }
}
