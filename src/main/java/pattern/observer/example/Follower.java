package pattern.observer.example;

public class Follower implements Fan {

    private String status;

    @Override
    public void update(String status) {
        setStatus(status);
    }
    public void setStatus(String status) {
        this.status = status;
        System.out.println(this + " get status: " + this.status + " - ");
    }
}
