package Branch;

import java.sql.Date;

public class Accounts extends Bank_Branch {

	private int accountNo;
	private String customerName;
	private double balance;
	private String accountType;
	private String phoneNumber;
	private String email;
	private String address;
	private Date openingDate;
	private String status;
	private Transactions[] transactions;

	public Accounts() {
		super();
		this.transactions = new Transactions[10];
	}

	public Accounts(int accountNo, String customerName, double balance, String accountType, String phoneNumber,
			String email, String address, Date openingDate, String status, Transactions[] transactions) {
		super();
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.balance = balance;
		this.accountType = accountType;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.openingDate = openingDate;
		this.status = status;
		this.transactions = transactions;
	}

	// Getters and Setters
	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Transactions[] getTransactions() {
		return transactions;
	}

	public void setTransactions(Transactions[] transactions) {
		this.transactions = transactions;
	}
}