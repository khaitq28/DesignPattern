package solid.liskov.before;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khaitq
 * Date: 04/07/2019
 * Github:  https://github.com/quangkhai88
 */

public class Test {


    public static void main(String[] args) throws Exception {

        List<Plane> list = new ArrayList<Plane>();
        list.add(new CivilPlane());
        list.add(new FighterPlane());


        fire(list);

    }

    public static void fire(List<Plane> list) throws Exception {
        for (Plane plane: list) {
            plane.fire();
        }
    }
 }
