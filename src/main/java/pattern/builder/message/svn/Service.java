package pattern.builder.message.svn;

/**
 * Created by khaitq
 * Date: 17/05/2018
 * Github:  https://github.com/quangkhai88
 */

public abstract class Service {

    protected Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Object get(String input) {
        return builder.get(input);
    }
}
