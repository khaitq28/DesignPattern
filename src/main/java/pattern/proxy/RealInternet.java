package pattern.proxy;

/**
 * Created by khaitq
 * Date: 09/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class RealInternet implements Internet {

    @Override
    public void conectTo(String host) {
        System.out.println("connect to host : " + host);
    }
}
