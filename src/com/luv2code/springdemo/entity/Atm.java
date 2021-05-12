package com.luv2code.springdemo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Atm")
public class Atm {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="atmpin")
	private String atmpin;
	
	@Column(name="cashwithdrawal")
	private String cashwithdrawal;
	
	@Column(name="transfer")
	private String transfer;
	
	@Column(name="billpayment")
	private String billpayment;
	
	@Column(name="deposit")
	private String deposit;
	
	
	@Column(name="balanceinquiry")
	private String balanceinquiry;
	
	@Column(name="exit")
	private String exit;
	
	
	
	
	public Atm() {
		
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getAtmpin() {
		return atmpin;
	}




	public void setAtmpin(String atmpin) {
		this.atmpin = atmpin;
	}




	public String getCashwithdrawal() {
		return cashwithdrawal;
	}




	public void setCashwithdrawal(String cashwithdrawal) {
		this.cashwithdrawal = cashwithdrawal;
	}




	public String getTransfer() {
		return transfer;
	}




	public void setTransfer(String transfer) {
		this.transfer = transfer;
	}




	public String getBillpayment() {
		return billpayment;
	}




	public void setBillpayment(String billpayment) {
		this.billpayment = billpayment;
	}




	public String getDeposit() {
		return deposit;
	}




	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}




	public String getBalanceinquiry() {
		return balanceinquiry;
	}




	public void setBalanceinquiry(String balanceinquiry) {
		this.balanceinquiry = balanceinquiry;
	}




	public String getExit() {
		return exit;
	}




	public void setExit(String exit) {
		this.exit = exit;
	}




	@Override
	public String toString() {
		return "Atm [id=" + id + ", atmpin=" + atmpin + ", cashwithdrawal=" + cashwithdrawal + ", transfer=" + transfer
				+ ", billpayment=" + billpayment + ", deposit=" + deposit + ", balanceinquiry=" + balanceinquiry
				+ ", exit=" + exit + "]";
	}
	
	


}
