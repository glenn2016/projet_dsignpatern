public class Main {

    public static void main(String[] args) {
        PaymentStrategy paypal = new PaypalPayment();
       // PaymentStrategy creditCard = new CreditCardPayment();

        T_OrderProcessTemplate onlineOrder = new T_CommandeEnLigne(paypal);
        onlineOrder.processOrder();

        System.out.println();

    }
}
