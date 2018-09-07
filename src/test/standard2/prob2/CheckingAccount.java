package test.standard2.prob2;

public class CheckingAccount extends Account {

	private double balance;
	private double MonthlyFee;
	private String acctId;

	public CheckingAccount(String acctId, double fee, double startBalance) {
		balance = startBalance;
		MonthlyFee = fee;
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
		return balance - MonthlyFee;
	}

}
