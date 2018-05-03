package multiDatabase;

/**
 * Created by khaitq
 * Date: 04/05/2018
 * Github:  https://github.com/quangkhai88
 */

public abstract class DaoFactory {

    abstract SmallCarDao getSmallCarDao();

    abstract SedanCarDao getSedanCarDao();


    public static DaoFactory getDaoFactoryByType(DbType dbType) {
        switch (dbType) {
            case DB2:
                return new EntityDb2DaoFactory();

            case ORACLE:
                return new EntityOracleDaoFactory();

                default:
                    return null;
        }

    }


}


