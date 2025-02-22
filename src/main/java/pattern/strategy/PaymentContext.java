package pattern.strategy;

import java.math.BigDecimal;

public class PaymentContext {
    private PaymentService paymentService;

    public PaymentContext(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void pay(BigDecimal amount) {
        paymentService.pay(amount);
    }

    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new CreditCardPaymentService("1234 5678 9012 3456"));
        paymentContext.pay(new BigDecimal("100.00"));

        paymentContext.setPaymentService(new BitcoinPaymentService("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        paymentContext.pay(new BigDecimal("0.001"));
    }
}
