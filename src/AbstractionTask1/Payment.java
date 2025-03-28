package AbstractionTask1;

abstract class Payment {
private double amount;
private String transactionId;

public Payment(double amount, String transactionId) {
	this.amount = amount;
	this.transactionId = transactionId;
}
public double getAmount() {
    return amount;
}

public String getTransactionId() {
    return transactionId;
}

public double calculateDiscount() {
    return amount > 500 ? 0.1 * amount : 0.0;
}
public double calculateFinalAmount(double transactionFeeRate) {
    double discount = calculateDiscount();
    double transactionFee = (amount - discount) * transactionFeeRate;
    return (amount - discount) + transactionFee;
}

public abstract void processPayment();
}
