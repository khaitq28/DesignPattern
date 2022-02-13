package pattern.chainOfResponsibility.security;

/**
 * Created by Intellij.
 * User: khaitq
 * Date: 27/04/2018
 */

public class InvalidAccountException extends  Exception {

    private String message;

    public  InvalidAccountException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
