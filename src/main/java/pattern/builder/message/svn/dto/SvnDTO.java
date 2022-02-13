package pattern.builder.message.svn.dto;

/**
 * Created by khaitq
 * Date: 17/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class SvnDTO {

    private String number;

    private AddressDTO addressDTO;

    @Override
    public String toString() {
        return "SvnDTO{" +
                "number='" + number + '\'' +
                ", addressDTO=" + addressDTO +
                ", inCode='" + inCode + '\'' +
                '}';
    }

    public AddressDTO getAddressDTO() {
        return addressDTO;
    }

    public void setAddressDTO(AddressDTO addressDTO) {
        this.addressDTO = addressDTO;
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
