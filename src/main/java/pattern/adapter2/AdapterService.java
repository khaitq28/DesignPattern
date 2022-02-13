package pattern.adapter2;

public class AdapterService extends  SystemService {

    private InterService interService;

    @Override
    public void run() {
//        super.run();

        interService.run();
    }

    public AdapterService(InterService interService) {
        this.interService =  interService;
    }

}
