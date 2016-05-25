package one;

/**
 * Created by zilongye on 16/5/12.
 * 影片，只是一个简单的纯数据类
 */
public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private Price price;

    public Movie(String _title, int _priceCode) {
        this._title = _title;
        setPriceCode(_priceCode);
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int _priceCode) {
        switch (_priceCode){
            case CHILDRENS:
                price = new ChildrensPrice();
                break;
            case REGULAR:
                price = new RegularPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("unknow Price Code");
        }
    }

    public String getTitle() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }


    public double getCharge(int daysRented){
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }
}
