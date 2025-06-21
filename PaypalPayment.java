

public class PaypalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payé " + amount + "€ via PayPal.");
    }
}
