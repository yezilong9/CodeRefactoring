package anonymous;

/**
 * Created by zilongye on 17/1/23.
 */
public class XiaoMin implements People{
    @Override
    public void appect(String s) {
        System.out.println(s);
    }

    @Override
    public void appect(String s, Listen listen) {
        listen.doString(s);
    }


    public static void main(String[] args) {
        String string = "测试！";
        XiaoMin xiaoMin = new XiaoMin();
        xiaoMin.appect(string);
        xiaoMin.appect(string, new Listen() {
            @Override
            public void doString(String s) {
                System.out.println(s + "xxx");
            }
        });

        Listen listen = new Listen() {
            @Override
            public void doString(String s) {
                System.out.println(s + "不错哦！");
            }
        };
        xiaoMin.appect(string,listen);
    }
}
