package builder.message.svn;

/**
 * Created by khaitq
 * Date: 17/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class SvnBuildable extends  SvnDTO implements Buildable {

    @Override
    public Buildable build(String input) {

        this.setInCode(input);
        this.setNumber(input);

        return this;
    }
}
