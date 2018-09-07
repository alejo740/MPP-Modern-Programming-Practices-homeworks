package test.standard2.prob2;

public class SavingsAccount extends Account {

	private double balance;
	private double interestRate;
	private String acctId;

	public SavingsAccount(String acctId, double interestRate, double startBalance) {
		balance = startBalance;
		this.interestRate = interestRate;
		this.acctId = acctId;
	}

	@Override
	String getAccountID() {
		return acctId;
	}

	@Override
	double getBalance() {
		return balance;
	}

	@Override
	double computeUpdateBalance() {
		return balance + (interestRate * balance);
	}

}
