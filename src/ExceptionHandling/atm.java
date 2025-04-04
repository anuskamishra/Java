package ExceptionHandling;

public class atm {
	private int pin = 1234;
	private int balance = 5000;

public void deposit(int pin, int amount) {
	if(this.pin == pin) {
		balance+=amount;
	}
	else {
		throw new InvalidPinException("pin is invalid");
	}

	public String withdraw(int pin, int amount) {
		if(this.pin == pin) {
			if(balance >= amount) {
				balance -= amount;
				return "amount withdraw, current balance: " this.balance;
			}
			else {
				throw new InsufficientFundException("insufficent fund");
			}
		}else {
			throw new InvalidPinException("Pin is invalid");
		}
	
}

	public static void main(String[] args) {
		atm atm = new atm();
		atm.withdraw(1234, 1000000);
		System.out.println(atm.withdraw(1234, 1000000));
	}
}
