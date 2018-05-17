package builder.message.svn;

/**
 * Created by khaitq
 * Date: 17/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class SvnService {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Buildable getResult(String input) {

        Buildable buildable =    builder.build(input);

        return buildable;
    }
}
