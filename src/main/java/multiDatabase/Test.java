package multiDatabase;

/**
 * Created by khaitq
 * Date: 04/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class Test {

    public  static  void  main(String... args) {

        DaoFactory entityDaoFactory = DaoFactory.getDaoFactoryByType(DbType.ORACLE);

        SmallCarDao smallCarOracleDao = entityDaoFactory.getSmallCarDao();

        SmallCarDao smallCarDb2Dao = DaoFactory.getDaoFactoryByType(DbType.DB2).getSmallCarDao();

        smallCarOracleDao.getSmallCarByINumber();
        smallCarDb2Dao.getSmallCarByINumber();

        SedanCarDao sedanCarDao = entityDaoFactory.getSedanCarDao();


    }
}
