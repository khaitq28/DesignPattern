package pattern.chainOfResponsibility.security;

/**
 * Created by Intellij.
 * User: khaitq
 * Date: 27/04/2018
 */

public class AccountBalanceValidator extends  AccountValidator {


    public boolean validateAcount(Account account) throws InvalidAccountException {

        if (account.getBalance() < 0 || account.getBalance() == Double.MAX_VALUE) {
            throw  new InvalidAccountException("Balance is not valid : smaller than 0 or bigger than Max ");
        }

        System.out.println("Account balance is valid...");

        return validateByNextAccountValidator(account);

    }


    public static void main(String ...args) throws InvalidAccountException {

        AccountInfoValidator infoValidator = new AccountInfoValidator();
        AccountBalanceValidator balanceValidator = new AccountBalanceValidator();
        infoValidator.setNextSecurity(balanceValidator);

        Account account = new Account("vbc", "bvc", -20d);

        infoValidator.validateAcount(account);


    }

}
