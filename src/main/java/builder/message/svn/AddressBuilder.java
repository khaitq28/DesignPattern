package builder.message.svn;

import builder.message.svn.dto.AddressDTO;

/**
 * Created by khaitq
 * Date: 18/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class AddressBuilder implements  Buildable {

    @Override
    public Object build(String input) {

        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setHost(input);
        addressDTO.setPort(input.length());
        return addressDTO;
    }
}
