package ch10.ex;

public class Account {
	private String accountNO;
	private String accountOwner;
	private long balance;
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Account(String accountNO, String accountOwner, long balance) {
		this.accountNO = accountNO;
		this.accountOwner = accountOwner;
		this.balance = balance;
	}

	public String getAccountNO() {
		return accountNO;
	}

	public void setAccountNO(String accountNO) {
		this.accountNO = accountNO;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public long getBalance() {
		return balance;
	}

	public void plusBalance(long money) {
		this.balance += money;
	}

	public void minusBalance(long money) {
		this.balance -= money;
	}

	@Override
	public String toString() {
		return String.format("%s \t %d \t %s", accountNO, balance, accountOwner);
	}

}
