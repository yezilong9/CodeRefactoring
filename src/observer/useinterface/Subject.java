package observer.useinterface;

/**
 * Created by zilongye on 17/1/13.
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
