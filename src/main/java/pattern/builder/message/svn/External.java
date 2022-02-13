package pattern.builder.message.svn;

import pattern.builder.message.svn.dto.SvnDTO;

/**
 * Created by khaitq
 * Date: 17/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class External {

    public static void main(String... args) {

        Service service = new SvnService();
        service.setBuilder(new ResultBuilder());

        SvnDTO obj = (SvnDTO) service.get("test");

        System.out.println(obj);
    }
}
