package builder.message.svn;

import builder.message.svn.dto.AddressDTO;
import builder.message.svn.dto.SvnDTO;

/**
 * Created by khaitq
 * Date: 17/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class SvnBuilder extends  Builder {

    @Override
    public Buildable build(String input) {

        SvnBuildable object = new SvnBuildable();

        object.build(input);

        return object;
    }

    @Override
    public Object get(String input) {


        AddressBuildable addressBuildable   = new AddressBuildable();
        SvnBuildable svnBuildable           = new SvnBuildable();

        SvnDTO  svnDTO          = (SvnDTO) svnBuildable.build(input);
        AddressDTO addressDTO   = (AddressDTO) addressBuildable.build(input);

        svnDTO.setAddressDTO(addressDTO);

        return svnDTO;
    }
}
