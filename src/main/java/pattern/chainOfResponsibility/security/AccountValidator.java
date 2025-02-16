package pattern.chainOfResponsibility.security;

public abstract class AccountValidator {
    protected AccountValidator nextAccountValidator;
    public AccountValidator setNextSecurity(AccountValidator accountValidator) {
        this.nextAccountValidator = accountValidator;
        return accountValidator;
    }
    public abstract boolean validateAccount(Account account) throws  InvalidAccountException;

    protected boolean validateByNextAccountValidator(Account account) throws  InvalidAccountException {
        if (nextAccountValidator == null) {
            return true;
        }
        return nextAccountValidator.validateAccount(account) ;
    }
}
