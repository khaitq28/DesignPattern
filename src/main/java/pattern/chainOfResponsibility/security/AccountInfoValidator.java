package pattern.chainOfResponsibility.security;

import org.apache.commons.lang3.StringUtils;


public class AccountInfoValidator extends AccountValidator {

    public boolean validateAccount(Account acount) throws InvalidAccountException {

        boolean valid = acount != null &&
                        !isEmptyField(acount.getUsername()) &&
                        !isEmptyField(acount.getPassword());

        if (!valid) {
            throw  new InvalidAccountException("Username or Password is empty");
        }
        System.out.println("Account Infor is valid...");
        return validateByNextAccountValidator(acount);
    }

    private boolean isEmptyField(String field) {
        return StringUtils.isEmpty(field);
    }

}
