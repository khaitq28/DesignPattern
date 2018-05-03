package multiDatabase;

/**
 * Created by khaitq
 * Date: 04/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class SmallCarOracleDaoFactory extends  DaoFactory {


    @Override
    SmallCarDao getSmallCarDao() {
        return new SmallCarOracleDao();
    }
}
