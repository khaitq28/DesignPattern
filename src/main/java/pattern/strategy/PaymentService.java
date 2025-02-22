package pattern.strategy;

import java.math.BigDecimal;

public interface PaymentService {

    void pay(BigDecimal amount);
}
