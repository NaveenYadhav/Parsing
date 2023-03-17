public class AccountDetails {
	
	
	private String payeeName;
	private String nickName;
	private String creditAccount;
	private String remarks;
	private String  debitAccount;
	private String transactionDate;
	private String amount;
	private String paymentType;
	private String payVia;
	
	
	public AccountDetails() {
		super();
		
	}


	public AccountDetails(String payeeName, String nickName, String creditAccount, String remarks, String debitAccount,
			String transactionDate, String amount, String paymentType, String payVia) {
		super();
		this.payeeName = payeeName;
		this.nickName = nickName;
		this.creditAccount = creditAccount;
		this.remarks = remarks;
		this.debitAccount = debitAccount;
		this.transactionDate = transactionDate;
		this.amount = amount;
		this.paymentType = paymentType;
		this.payVia = payVia;
	}


	public String getPayeeName() {
		return payeeName;
	}


	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public String getCreditAccount() {
		return creditAccount;
	}


	public void setCreditAccount(String creditAccount) {
		this.creditAccount = creditAccount;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	public String getDebitAccount() {
		return debitAccount;
	}


	public void setDebitAccount(String debitAccount) {
		this.debitAccount = debitAccount;
	}


	public String getTransactionDate() {
		return transactionDate;
	}


	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public String getPaymentType() {
		return paymentType;
	}


	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}


	public String getPayVia() {
		return payVia;
	}


	public void setPayVia(String payVia) {
		this.payVia = payVia;
	}


	@Override
	public String toString() {
		return "AccountDetails : [payeeName=" + payeeName + ", nickName=" + nickName + ", creditAccount="
				+ creditAccount + ", remarks=" + remarks + ", debitAccount=" + debitAccount + ", transactionDate="
				+ transactionDate + ", amount=" + amount + ", paymentType=" + paymentType + ", payVia=" + payVia + "]";
  }

}
