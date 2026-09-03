package Branch;

import java.sql.Date;
import java.sql.Time;

public class Transactions {
	private int transactionId;
	private int accountNo;
	private String transactionType;
	private double amount;
	private Date transactionDate;
	private Time transactionTime;
	private String mode;
	private String referenceNo;
	private double balanceAfterTransaction;
	private String description;
	private String status;

	public Transactions() {
	}

	public Transactions(int transactionId, int accountNo, String transactionType, double amount,
			Date transactionDate, Time transactionTime, String mode, String referenceNo,
			double balanceAfterTransaction, String description, String status) {
		this.transactionId = transactionId;
		this.accountNo = accountNo;
		this.transactionType = transactionType;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;
		this.mode = mode;
		this.referenceNo = referenceNo;
		this.balanceAfterTransaction = balanceAfterTransaction;
		this.description = description;
		this.status = status;
	}

	// Getters and Setters
	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Time getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(Time transactionTime) {
		this.transactionTime = transactionTime;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public double getBalanceAfterTransaction() {
		return balanceAfterTransaction;
	}

	public void setBalanceAfterTransaction(double balanceAfterTransaction) {
		this.balanceAfterTransaction = balanceAfterTransaction;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
