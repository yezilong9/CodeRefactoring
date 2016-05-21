package one;

/**
 * Created by zilongye on 16/5/12.
 * 表示某个顾客租了一部影片
 */
public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public void set_movie(Movie _movie) {
        this._movie = _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public void set_daysRented(int _daysRented) {
        this._daysRented = _daysRented;
    }


    public double getCharge() {
        double result = 0;
        switch (getMovie().getPriceCode()){
            case Movie.REGULAR:
                result += 2;
                if(getDaysRented() > 2){
                    result += (getDaysRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if(getDaysRented() > 3){
                    result += (getDaysRented() - 3) * 1.5;
                }
                break;
        }
        return result;
    }
}
