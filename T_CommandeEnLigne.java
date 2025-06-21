
public class T_CommandeEnLigne  extends T_OrderProcessTemplate{

    private PaymentStrategy payment;

    public T_CommandeEnLigne(PaymentStrategy payment) {
        this.payment = payment;
    }

    @Override
    protected void selectProduct() {
        System.out.println("Produit sélectionné : call off ");

    }

    @Override
    protected void makePayment() {
        payment.pay(25.0);

    }

    @Override
    protected void deliverProduct() {
        System.out.println("Produit livré par email (car version numérique).");
    }
}
