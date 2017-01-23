package anonymous;

/**
 * Created by zilongye on 17/1/23.
 */
public class AgeListen implements Listen{
    @Override
    public void doString(String s) {
        System.out.println("年龄:" + s);
    }
}
