package pattern.decorator.component;

/**
 * Created by khaitq
 * Date: 29/04/2018 - Paris, France
 * Github:  https://github.com/quangkhai88
 */

public class Gps {

    private float x;


    private float y;

    public void activeGps() {

        System.out.println("GPS active...");

        System.out.println(toString());

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Position {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
