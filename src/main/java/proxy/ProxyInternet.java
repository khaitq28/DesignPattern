package proxy;

/**
 * Created by khaitq
 * Date: 09/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class ProxyInternet implements Internet {

    private Internet internet = new RealInternet();

    @Override
    public void conectTo(String host) throws Exception {

        if (host.equalsIgnoreCase("google.com")) {
            throw new Exception("connect to google : Access denied");
        }

        internet.conectTo(host);
    }
}
