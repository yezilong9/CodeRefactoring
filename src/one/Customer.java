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
    private double thisAmount;

    public Customer(String _name) {
        this._name = _name;
    }

    public void addRental(Rental rental){
        _rentals.add(rental);
    }

    public String getName() {
        return _name;
    }

    /**
     * 可以添加功能
     * @return
     */
    public String statement(){
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }

        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) + " frequent renter points";
        return result;
    }


    private double getTotalCharge(){
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getFrequentRenterPoints(){
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

}
