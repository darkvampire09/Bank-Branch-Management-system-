package Branch;

import java.sql.Date;

public class SavingsAccount extends Accounts {
	private double minimumBalance;
	private double interestRate;
	private double withdrawalLimit;
	private String debitCardNumber;
	private String nomineeName;
	private boolean autoSweepEnabled;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int accountNo, String customerName, double balance, String accountType, String phoneNumber,
			String email, String address, Date openingDate, String status, Transactions[] transactions,
			double minimumBalance, double interestRate, double withdrawalLimit, String debitCardNumber,
			String nomineeName, boolean autoSweepEnabled) {
		super(accountNo, customerName, balance, accountType, phoneNumber, email, address, openingDate, status,
				transactions);
		this.minimumBalance = minimumBalance;
		this.interestRate = interestRate;
		this.withdrawalLimit = withdrawalLimit;
		this.debitCardNumber = debitCardNumber;
		this.nomineeName = nomineeName;
		this.autoSweepEnabled = autoSweepEnabled;
	}

	// Getters and Setters
	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getWithdrawalLimit() {
		return withdrawalLimit;
	}

	public void setWithdrawalLimit(double withdrawalLimit) {
		this.withdrawalLimit = withdrawalLimit;
	}

	public String getDebitCardNumber() {
		return debitCardNumber;
	}

	public void setDebitCardNumber(String debitCardNumber) {
		this.debitCardNumber = debitCardNumber;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public boolean isAutoSweepEnabled() {
		return autoSweepEnabled;
	}

	public void setAutoSweepEnabled(boolean autoSweepEnabled) {
		this.autoSweepEnabled = autoSweepEnabled;
	}
}
