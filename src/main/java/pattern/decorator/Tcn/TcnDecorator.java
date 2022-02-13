package pattern.decorator.Tcn;

/**
 * Created by khaitq
 * Date: 01/06/2018
 * Github:  https://github.com/quangkhai88
 */

public class TcnDecorator extends  Tcn {

    private TcnDto tcnDto;

    public String getCodeIsin() {
        return tcnDto.getCodeIsin();
    }

    public String getLabel() {
        return tcnDto.getLabel();
    }

}
