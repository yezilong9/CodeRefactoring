package observer.useinterface;

/**
 * Created by zilongye on 17/1/13.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{

    private int temp;
    private int humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temp +"  humidity:" + humidity);
    }

    @Override
    public void update(int temp, int humidity, int pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }


    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(data);
        data.setMeasurements(1,2,3);
        data.setMeasurements(4,5,6);
        data.setMeasurements(7,8,9);

    }
}
