package encapsulation;

public class NetBank {
int currentBalance = 50000;

public void setBalance(int deposit) {
	currentBalance += deposit;
}
}
