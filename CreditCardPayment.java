

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payé " + amount + "€ par carte de crédit.");
    }
}
