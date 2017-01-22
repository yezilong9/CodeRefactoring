package decorator;

/**
 * Created by zilongye on 17/1/22.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    public String getDescription(){
        return description;
    }

    public abstract double cost();
}