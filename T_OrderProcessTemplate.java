

public abstract class T_OrderProcessTemplate {

    public final void processOrder() {
        selectProduct();
        makePayment();
        deliverProduct();
    }
    protected abstract void selectProduct();
    protected abstract void makePayment();
    protected abstract void deliverProduct();
}
