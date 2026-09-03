package Branch;

import java.sql.Date;

public class CurrentAccount extends Accounts {
	private double overdraftLimit;
	private double interestRate;
	private String businessName;
	private String gstNumber;
	private double monthlyServiceFee;
	private String chequeBookNumber;
	private double transactionLimit;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(int accountNo, String customerName, double balance, String accountType, String phoneNumber,
			String email, String address, Date openingDate, String status, Transactions[] transactions,
			double overdraftLimit, double interestRate, String businessName, String gstNumber, double monthlyServiceFee,
			String chequeBookNumber, double transactionLimit) {
		super(accountNo, customerName, balance, accountType, phoneNumber, email, address, openingDate, status,
				transactions);
		this.overdraftLimit = overdraftLimit;
		this.interestRate = interestRate;
		this.businessName = businessName;
		this.gstNumber = gstNumber;
		this.monthlyServiceFee = monthlyServiceFee;
		this.chequeBookNumber = chequeBookNumber;
		this.transactionLimit = transactionLimit;
	}

	// Getters and Setters
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public double getMonthlyServiceFee() {
		return monthlyServiceFee;
	}

	public void setMonthlyServiceFee(double monthlyServiceFee) {
		this.monthlyServiceFee = monthlyServiceFee;
	}

	public String getChequeBookNumber() {
		return chequeBookNumber;
	}

	public void setChequeBookNumber(String chequeBookNumber) {
		this.chequeBookNumber = chequeBookNumber;
	}

	public double getTransactionLimit() {
		return transactionLimit;
	}

	public void setTransactionLimit(double transactionLimit) {
		this.transactionLimit = transactionLimit;
	}
}
