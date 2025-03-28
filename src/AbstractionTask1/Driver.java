package AbstractionTask1;

public class Driver {
	public static void main(String[] args) {
        CreditCardPayment creditPayment = new CreditCardPayment(600.0, "TXN12345");
        creditPayment.processPayment();

        PayPalPayment paypalPayment = new PayPalPayment(300.0, "TXN67890");
        paypalPayment.processPayment();
    }
}
