package chainOfResponsibility.security;

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
}
