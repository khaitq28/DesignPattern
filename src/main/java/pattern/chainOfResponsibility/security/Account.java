package pattern.chainOfResponsibility.security;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;


@Data
@Builder
public class Account implements Serializable {

    private static final long serialVersionUID = 6866943439951057032L;

    private String username;

    private String password;

    private  Double balance;

    public Account(String username, String password, Double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }

}
