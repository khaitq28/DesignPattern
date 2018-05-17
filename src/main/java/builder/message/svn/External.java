package builder.message.svn;

/**
 * Created by khaitq
 * Date: 17/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class External {

    public static void main(String... args) {

        SvnService service = new SvnService();
        service.setBuilder(new SvnBuilder());

        Buildable obj =    service.getResult("test");

        SvnBuildable svnBuildable = (SvnBuildable) obj;

        System.out.println(svnBuildable);
    }
}
