package Branch;

import java.sql.Date;

public class Salary extends Accounts {
	private Date lastTransactionDate;
	private boolean isFrozen;
	private String employerName;
	private String employeeId;
	private double monthlySalary;
	private int salaryCreditDate;
	private String companyAccountNo;
	private String salaryStatus;

	public Salary() {
		super();
	}

	public Salary(int accountNo, String customerName, double balance, String accountType, String phoneNumber,
			String email, String address, Date openingDate, String status, Transactions[] transactions,
			Date lastTransactionDate, boolean isFrozen, String employerName, String employeeId, double monthlySalary,
			int salaryCreditDate, String companyAccountNo, String salaryStatus) {
		super(accountNo, customerName, balance, accountType, phoneNumber, email, address, openingDate, status,
				transactions);
		this.lastTransactionDate = lastTransactionDate;
		this.isFrozen = isFrozen;
		this.employerName = employerName;
		this.employeeId = employeeId;
		this.monthlySalary = monthlySalary;
		this.salaryCreditDate = salaryCreditDate;
		this.companyAccountNo = companyAccountNo;
		this.salaryStatus = salaryStatus;
	}

	// Getters and Setters
	public Date getLastTransactionDate() {
		return lastTransactionDate;
	}

	public void setLastTransactionDate(Date lastTransactionDate) {
		this.lastTransactionDate = lastTransactionDate;
	}

	public boolean isFrozen() {
		return isFrozen;
	}

	public void setFrozen(boolean isFrozen) {
		this.isFrozen = isFrozen;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public int getSalaryCreditDate() {
		return salaryCreditDate;
	}

	public void setSalaryCreditDate(int salaryCreditDate) {
		this.salaryCreditDate = salaryCreditDate;
	}

	public String getCompanyAccountNo() {
		return companyAccountNo;
	}

	public void setCompanyAccountNo(String companyAccountNo) {
		this.companyAccountNo = companyAccountNo;
	}

	public String getSalaryStatus() {
		return salaryStatus;
	}

	public void setSalaryStatus(String salaryStatus) {
		this.salaryStatus = salaryStatus;
	}
}