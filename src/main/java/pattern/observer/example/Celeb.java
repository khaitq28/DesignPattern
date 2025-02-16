package pattern.observer.example;

import java.util.ArrayList;
import java.util.List;

public class Celeb {
    private List<Fan> fans = new ArrayList<>();

    public void addFollower(Fan fan) {
        fans.add(fan);
    }

    public void removeFollower(Fan fan) {
        fans.remove(fan);
    }

    public void notifyFollowers(String status) {
        fans.forEach(fan -> fan.update(status));
    }

    public static void main(String[] args) {
        Celeb celeb = new Celeb();
        celeb.addFollower(new Follower());
        celeb.addFollower(new Follower());
        celeb.addFollower(new Follower());
        celeb.notifyFollowers("I am going to the gym");
    }
}
