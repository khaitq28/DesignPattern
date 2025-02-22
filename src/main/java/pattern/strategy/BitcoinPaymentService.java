package pattern.strategy;

import java.math.BigDecimal;

public class BitcoinPaymentService implements PaymentService {
    private final String walletAddress;

    public BitcoinPaymentService(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(BigDecimal amount) {
        String description = """
                Paying with Bitcoin
                Wallet address: %s
                Amount: %s
                """.formatted(walletAddress, amount);
        System.out.println(description);
    }
}
