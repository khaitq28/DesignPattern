package pattern.strategy;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BitcoinPaymentServiceTest {

    private final BitcoinPaymentService bitcoinPaymentService = new BitcoinPaymentService("walletAddress");
    @Test
    void pay() {
        assertDoesNotThrow(() -> bitcoinPaymentService.pay(new BigDecimal(100)));
    }
}