package pattern.strategy;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

import java.math.BigDecimal;


public class CreditCardPaymentService implements PaymentService {
    private final String cardNumber;
    public CreditCardPaymentService(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(BigDecimal amount) {
        String description = """
                Paying with credit card
                Card number: %s
                Amount: %s
                """.formatted(cardNumber, amount);
        System.out.println(description);
    }
}
