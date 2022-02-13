package pattern.liskov.before;

/**
 * Created by khaitq
 * Date: 04/07/2019
 * Github:  https://github.com/quangkhai88
 */

public class CivilPlane extends  Plane {

    @Override
    public void fly() {

    }

    @Override
    public void fire() throws  Exception {
        throw  new Exception("not fire");
    }
}
