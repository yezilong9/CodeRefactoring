package observer.jdk;

import observer.useinterface.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zilongye on 17/1/13.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{

    private Observable observable;
    private int temp;
    private int humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temp :" + temp + "  humidity:" + humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData data = (WeatherData)o;
            this.temp = data.getTemp();
            this.humidity = data.getHumidity();
            display();
        }
    }

    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(data);
        data.setMeasurements(1,2,3);
        data.setMeasurements(4,5,6);
        data.setMeasurements(7,8,9);
    }
}
