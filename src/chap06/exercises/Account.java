
package chap06.exercises;

public class Account {

	private int balance; // private으로 하는 게 좋음 
	private final static int MIN_BALANCE = 0;
	private final static int MAX_BALANCE = 1000000;

	public int getBalance() {
		return balance;
	}

	public int setBalance(int balance) {
		if ((balance > MIN_BALANCE) && (balance < MAX_BALANCE)) {
			this.balance = balance;
			return balance;
		} else {
			return balance;
		}
	
	}

}
