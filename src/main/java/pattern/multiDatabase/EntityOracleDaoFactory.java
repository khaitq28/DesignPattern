package pattern.multiDatabase;

/**
 * Created by khaitq
 * Date: 04/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class EntityOracleDaoFactory extends  DaoFactory {


    @Override
    SedanCarDao getSedanCarDao() {
        return null; //return new SedanCarOracleDao();
    }

    @Override
    SmallCarDao getSmallCarDao() {
        return new SmallCarOracleDao();
    }
}
