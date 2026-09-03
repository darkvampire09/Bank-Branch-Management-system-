package Branch;

public class Test {

	public static void main(String[] args) {
		
		Bank_Branch branch = new Bank_Branch();
		branch.setBankName("State Bank");
		branch.setBranchName("Downtown Branch");
		branch.setIfscCode("SBIN0001234");
		System.out.println("Bank Name: " + branch.getBankName());
		System.out.println("Branch Name: " + branch.getBranchName());
		System.out.println("IFSC Code: " + branch.getIfscCode());

		
		SavingsAccount savings = new SavingsAccount();
		savings.setAccountNo(1001);
		savings.setCustomerName("Samarth ");
		savings.setBalance(50000.0);
		savings.setMinimumBalance(1000.0);
		savings.setInterestRate(4.5);
		System.out.println("Account No: " + savings.getAccountNo());
		System.out.println("Customer Name: " + savings.getCustomerName());
		System.out.println("Balance: " + savings.getBalance());
		System.out.println("Interest Rate: " + savings.getInterestRate() + "%");

	
		Transactions tx = new Transactions();
		tx.setTransactionId(5001);
		tx.setAccountNo(1001);
		tx.setTransactionType("Credit");
		tx.setAmount(10000.0);
		tx.setStatus("Success");
		System.out.println("Tx ID: " + tx.getTransactionId());
		System.out.println("Tx Type: " + tx.getTransactionType());
		System.out.println("Amount: " + tx.getAmount());
		System.out.println("Status: " + tx.getStatus());

	
	}

}
