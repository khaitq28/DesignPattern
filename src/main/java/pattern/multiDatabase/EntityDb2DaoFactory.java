package pattern.multiDatabase;

/**
 * Created by khaitq
 * Date: 04/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class EntityDb2DaoFactory extends  DaoFactory {
    @Override
    SedanCarDao getSedanCarDao() {
        return null; //return new SedanCarDb2Dao
    }

    @Override
    SmallCarDao getSmallCarDao() {
        return new SmallCarDb2Dao();
    }
}
