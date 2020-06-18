package chap10.examples.sec100701;

public class Account {
	
	private long balance;
	public Account() { }
	public long getBalance() {
		return balance;
	}
	
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInSufficientException {
		if (balance < money) {
			throw new BalanceInSufficientException("잔고부족 " + (money-balance) + " 모자람");
		}
		balance -= money;
	}

}
