package multiDatabase;

/**
 * Created by khaitq
 * Date: 04/05/2018
 * Github:  https://github.com/quangkhai88
 */

public abstract class DaoFactory {

    abstract SmallCarDao getSmallCarDao();


    public static DaoFactory getDaoFactoryByType(DbType dbType) {
        switch (dbType) {
            case DB2:
                return new SmallCarDb2DaoFactory();

            case ORACLE:
                return new SmallCarOracleDaoFactory();

                default:
                    return null;
        }

    }


}


