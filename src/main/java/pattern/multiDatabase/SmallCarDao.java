package pattern.multiDatabase;

import pattern.models.car.*;

/**
 * Created by khaitq
 * Date: 04/05/2018
 * Github:  https://github.com/quangkhai88
 */

public interface SmallCarDao {

    SmallCar getSmallCarByINumber();

    SmallCar updateSmallCar(SmallCar smallCar);

}
