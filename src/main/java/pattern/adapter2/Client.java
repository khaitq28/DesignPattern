package pattern.adapter2;

public class Client {

    private OldService service;

    public void setService(OldService service) {
        this.service = service;
    }

    public void doSomething() {
        service.run();
    }


    public static void main(String ...args) {

        Client client = new Client();

        client.setService(new OldService());
        client.doSomething();

        client.setService(new AdapterService(new NewService()));
        client.doSomething();

    }

}
