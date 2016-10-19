package lk.harshana.model;

import java.util.Date;

public class TransactionDetails {

	private int id;
	private int accountId;
	private Date dataAndTime;
	private String method;
	private float amount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public Date getDataAndTime() {
		return dataAndTime;
	}

	public void setDataAndTime(Date dataAndTime) {
		this.dataAndTime = dataAndTime;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}
