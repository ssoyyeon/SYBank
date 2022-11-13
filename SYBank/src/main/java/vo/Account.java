package vo;

public class Account {

	private int accountNo;
	private String accountNumber;
	private String customerId;
	private int balance;
	private String createDate;
	private String updateDate;
	
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountNumber=" + accountNumber + ", customerId=" + customerId
				+ ", balance=" + balance + ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	
}
