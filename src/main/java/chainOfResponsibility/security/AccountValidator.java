package chainOfResponsibility.security;

/**
 * Created by Intellij.
 * User: khaitq
 * Date: 27/04/2018
 */

public abstract class AccountValidator {

    protected AccountValidator nextAccountValidator;


    public AccountValidator setNextSecurity(AccountValidator accountValidator) {
        this.nextAccountValidator = accountValidator;
        return accountValidator;
    }

    public abstract boolean validateAcount(Account account) throws  InvalidAccountException;


    protected boolean validateByNextAccountValidator(Account account) throws  InvalidAccountException {

        if (nextAccountValidator == null) {
            return true;
        }

        return nextAccountValidator.validateAcount(account) ;
    }
}
