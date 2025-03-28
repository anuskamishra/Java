package AbstractionTask1;

public class PayPalPayment extends Payment{
	public PayPalPayment(double amount, String transactionId) {
        super(amount, transactionId);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal Payment...");
        System.out.println("Transaction ID: " + getTransactionId());
        double originalAmount = getAmount();
        double discount = calculateDiscount();
        double transactionFee = (originalAmount - discount) * 0.03;
        double finalAmount = calculateFinalAmount(0.03);

        System.out.println("Original Amount: $" + originalAmount);
        System.out.println("Discount Applied: $" + discount);
        System.out.println("Transaction Fee: $" + transactionFee);
        System.out.println("Final Payable Amount: $" + finalAmount);
        System.out.println("PayPal Payment Successful!\n");
    }
}
