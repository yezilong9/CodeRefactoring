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
    private int _priceCode;

    public Movie(String _title, int _priceCode) {
        this._title = _title;
        this._priceCode = _priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void set_priceCode(int _priceCode) {
        this._priceCode = _priceCode;
    }

    public String getTitle() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }
}
