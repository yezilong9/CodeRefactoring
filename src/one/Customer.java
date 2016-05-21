package one;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by zilongye on 16/5/12.
 * 用来表示顾客，就像其他类一样，它也用友数据和响应的访问函数
 */
public class Customer {

    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String _name) {
        this._name = _name;
    }

    public void addRental(Rental rental){
        _rentals.add(rental);
    }

    public String getName() {
        return _name;
    }

    public String statement(){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while(rentals.hasMoreElements()){
            double thisAmount;
            Rental each = (Rental) rentals.nextElement();

            thisAmount = each.getCharge();

            frequentRenterPoints ++;

            if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1){
                frequentRenterPoints ++;
            }
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

}
