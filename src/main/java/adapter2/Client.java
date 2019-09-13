package adapter2;

public class Client {



    private SystemService service;

    public void setService(SystemService service) {
        this.service = service;
    }

    public void doSomething() {

        service.run();
    }


    public static void main(String ...args) {


        Client client = new Client();

        client.setService(new SystemService());
        client.doSomething();


        client.setService(new AdapterService(new InterService()));
        client.doSomething();

    }

}
