package observer.useinterface;

import java.util.ArrayList;

/**
 * Created by zilongye on 17/1/13.
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private int temp;
    private int humidity;
    private int pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i > 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i=0;i<observers.size();i++){
            Observer observer = observers.get(i);
            observer.update(temp,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(int temp,int humidity,int pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
