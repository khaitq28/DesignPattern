package builder.message.svn;

import builder.message.svn.dto.AddressDTO;
import builder.message.svn.dto.SvnDTO;

/**
 * Created by khaitq
 * Date: 17/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class ResultBuilder extends  Builder {

//    @Override
//    public Buildable build(String input) {
//        SvnBuilder object = new SvnBuilder();
//        object.build(input);
//        return object;
//    }

    @Override
    public Object get(String input) {


        SvnDTO  svnDTO          = (SvnDTO)      new SvnBuilder().build(input);
        AddressDTO addressDTO   = (AddressDTO)  new AddressBuilder().build(input);

        svnDTO.setAddressDTO(addressDTO);

        return svnDTO;
    }
}
