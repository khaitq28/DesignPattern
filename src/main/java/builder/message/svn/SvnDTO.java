package builder.message.svn;

/**
 * Created by khaitq
 * Date: 17/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class SvnDTO {

    private String number;

    @Override
    public String toString() {
        return "SvnDTO{" +
                "number='" + number + '\'' +
                ", inCode='" + inCode + '\'' +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getInCode() {
        return inCode;
    }

    public void setInCode(String inCode) {
        this.inCode = inCode;
    }

    private String inCode;


}
