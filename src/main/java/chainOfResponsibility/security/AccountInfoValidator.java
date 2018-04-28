package chainOfResponsibility.security;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Intellij.
 * User: khaitq
 * Date: 27/04/2018
 */

public class AccountInfoValidator extends AccountValidator {



    public boolean validateAcount(Account acount) throws InvalidAccountException {

        boolean isAcountInforValid = acount != null &&
                                    !isEmptyField(acount.getUsername()) &&
                                    !isEmptyField(acount.getPassword());

        if (!isAcountInforValid) {
            throw  new InvalidAccountException("Username or Password is empty");
        }

        System.out.println("Account Infor is valid...");

        return validateByNextAccountValidator(acount);
    }

    private boolean isEmptyField(String field) {

        if (StringUtils.isEmpty(field)) {
            return true;
        }

        return false;
    }

}
