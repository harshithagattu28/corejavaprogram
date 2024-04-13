package com.harshu.defaultconstructor;

public class Customer {

	private String customername;   // data members
	private int customerid;
	private String customercity;
	
	public Customer() {
		System.out.println("default constructor");
	}

	public Customer(String customername, int customerid, String customercity) {
		super();
		this.customername = customername;
		this.customerid = customerid;
		this.customercity = customercity;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomercity() {
		return customercity;
	}

	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}

	@Override
	public String toString() {
		return "Customer [customername=" + customername + ", customerid=" + customerid + ", customercity="
				+ customercity + "]";
	}
	
	
	
	
}




