package multiDatabase;

/**
 * Created by khaitq
 * Date: 04/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class SmallCarDb2DaoFactory extends  DaoFactory {


    @Override
    SmallCarDao getSmallCarDao() {
        return new SmallCarDb2Dao();
    }
}
