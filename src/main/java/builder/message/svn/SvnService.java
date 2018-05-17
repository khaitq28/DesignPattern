package builder.message.svn;

/**
 * Created by khaitq
 * Date: 17/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class SvnService extends Service {

//    public Buildable getResult(String input) {
//        Buildable buildable =  builder.build(input);
//        return buildable;
//    }

    @Override
    public Object get(String input) {
        return builder.get(input);
    }
}
