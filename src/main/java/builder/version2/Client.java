package builder.version2;

public class Client {

    public void test() {

        User user = new User.UserBuilder().setId(1).setName("sd").build();

        User user2 = new User.UserBuilder().setId(1).build();

    }
}
