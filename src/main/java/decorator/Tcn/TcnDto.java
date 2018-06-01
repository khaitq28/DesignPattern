package decorator.Tcn;

/**
 * Created by khaitq
 * Date: 01/06/2018
 * Github:  https://github.com/quangkhai88
 */

public class TcnDto {

    private String codeIsin;

    private String label;

    private Integer amount;

    public TcnDto(String codeIsin, String label, Integer amount) {
        this.codeIsin = codeIsin;
        this.label = label;
        this.amount = amount;
    }

    public String getCodeIsin() {
        return codeIsin;
    }

    public void setCodeIsin(String codeIsin) {
        this.codeIsin = codeIsin;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
