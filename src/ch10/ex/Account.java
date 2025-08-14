package ch10.ex;

import java.util.ArrayList;

public class Account {
	private String accountNo;
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
		this.accountNo = accountNO;
		this.accountOwner = accountOwner;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
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
		return String.format("%s \t %d \t %s", accountNo, balance, accountOwner);
	}

	public Account findAccount(String accountNum, ArrayList<Account> accounts) {
		for (Account acc : accounts) {
			if (acc.getAccountNo().equals(accountNum)) {
				return acc;
			}
		}
		return null;
	}

}
