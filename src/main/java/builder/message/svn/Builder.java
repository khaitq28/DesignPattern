package builder.message.svn;

/**
 * Created by khaitq
 * Date: 17/05/2018
 * Github:  https://github.com/quangkhai88
 */

public abstract class Builder {

    public  abstract Buildable build(String input);

    public  abstract Object get(String input);
}
