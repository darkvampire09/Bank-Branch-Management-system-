package Branch;

public class Bank_Branch {
	private String bankName;
	private String bankCode;
	private String branchName;
	private String branchCode;
	private String ifscCode;
	private String address;
	private String phoneNumber;
	private String email;
	private Accounts[] accounts;
	private int accountCount;

	public Bank_Branch() {
		this.bankName = "Null";
		this.bankCode = "Null";
		this.branchName = "Null";
		this.branchCode = "Null";
		this.ifscCode = "Null";
		this.address = "Null";
		this.phoneNumber = "Null";
		this.email = "Null";
		this.accounts = new Accounts[10];
		this.accountCount = 0;
	}

	public Bank_Branch(String bankName, String bankCode, String branchName, String branchCode, String ifscCode,
			String address, String phoneNumber, String email, Accounts[] accounts, int accountCount) {
		this.bankName = bankName;
		this.bankCode = bankCode;
		this.branchName = branchName;
		this.branchCode = branchCode;
		this.ifscCode = ifscCode;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.accounts = accounts;
		this.accountCount = accountCount;
	}

	// Getters and Setters
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Accounts[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Accounts[] accounts) {
		this.accounts = accounts;
	}

	public int getAccountCount() {
		return accountCount;
	}

	public void setAccountCount(int accountCount) {
		this.accountCount = accountCount;
	}
}