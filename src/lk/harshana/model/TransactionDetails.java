package lk.harshana.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class TransactionDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="dateNtime")
	private Date dataAndTime;
	@Column(name="amount")
	private float amount;
	@Column(name="method")
	private String method;
	@Column(name="account_id")
	private int accountId;
	@Column(name="account_bank_branch_id")
	private int branchId;
	@Column(name="account_bank_branch_bank_id")
	private int bankId;

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
