package Branch;

import java.sql.Date;

public class Loan extends Accounts {
	private double loanAmount;
	private double amountRepaid;
	private double interestRate;
	private String loanType;
	private int tenureMonths;
	private double emiAmount;
	private Date startDate;
	private Date dueDate;
	private String collateralDetails;
	private String loanStatus;

	public Loan() {
		super();
	}

	public Loan(double loanAmount, double amountRepaid, double interestRate, String loanType, int tenureMonths,
			double emiAmount, Date startDate, Date dueDate, String collateralDetails, String loanStatus) {
		super();
		this.loanAmount = loanAmount;
		this.amountRepaid = amountRepaid;
		this.interestRate = interestRate;
		this.loanType = loanType;
		this.tenureMonths = tenureMonths;
		this.emiAmount = emiAmount;
		this.startDate = startDate;
		this.dueDate = dueDate;
		this.collateralDetails = collateralDetails;
		this.loanStatus = loanStatus;
	}

	public Loan(int accountNo, String customerName, double balance, String accountType, String phoneNumber,
			String email, String address, Date openingDate, String status, Transactions[] transactions,
			double loanAmount, double amountRepaid, double interestRate, String loanType, int tenureMonths,
			double emiAmount, Date startDate, Date dueDate, String collateralDetails, String loanStatus) {
		super(accountNo, customerName, balance, accountType, phoneNumber, email, address, openingDate, status,
				transactions);
		this.loanAmount = loanAmount;
		this.amountRepaid = amountRepaid;
		this.interestRate = interestRate;
		this.loanType = loanType;
		this.tenureMonths = tenureMonths;
		this.emiAmount = emiAmount;
		this.startDate = startDate;
		this.dueDate = dueDate;
		this.collateralDetails = collateralDetails;
		this.loanStatus = loanStatus;
	}

	// Getters and Setters
	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getAmountRepaid() {
		return amountRepaid;
	}

	public void setAmountRepaid(double amountRepaid) {
		this.amountRepaid = amountRepaid;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public int getTenureMonths() {
		return tenureMonths;
	}

	public void setTenureMonths(int tenureMonths) {
		this.tenureMonths = tenureMonths;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getCollateralDetails() {
		return collateralDetails;
	}

	public void setCollateralDetails(String collateralDetails) {
		this.collateralDetails = collateralDetails;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
}