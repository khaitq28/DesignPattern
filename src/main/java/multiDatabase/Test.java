package multiDatabase;

/**
 * Created by khaitq
 * Date: 04/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class Test {

    public  static  void  main(String... args) {

        DaoFactory smallCarDaoFactory = DaoFactory.getDaoFactoryByType(DbType.ORACLE);

        SmallCarDao smallCarDao = smallCarDaoFactory.getSmallCarDao();

        smallCarDao.getSmallCarByINumber();
    }
}
