package builder.message.svn;

/**
 * Created by khaitq
 * Date: 17/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class SvnBuilder extends  Builder {

    @Override
    public Buildable build(String input) {

        SvnBuildable object = new SvnBuildable();

        object.build(input);

        return object;
    }
}
