package pattern.adapter2;

public class AdapterService extends OldService {

    private NewService newService;

    @Override
    public void run() {
        newService.run();
    }

    public AdapterService(NewService newService) {
        this.newService = newService;
    }

}
