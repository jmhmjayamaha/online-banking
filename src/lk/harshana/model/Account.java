package lk.harshana.model;

public class Account {

	private int id;
	private float amount;
	private int branchId;	
	private int bankId;
	private int customerId;
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}
