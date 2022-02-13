package pattern.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khaitq
 * Date: 09/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class ProxyInternet implements Internet {

    private Internet internet = new RealInternet();

    private static List<String> blackListSite = new ArrayList<String>();

    static {
        blackListSite.add("facebook.com");
        blackListSite.add("amazon.fr");
    }

    @Override
    public void conectTo(String host) throws Exception {

        if (blackListSite.contains(host)) {
            throw new Exception("connect to host : Access denied");
        }

        internet.conectTo(host);
    }
}
