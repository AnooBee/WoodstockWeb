package com.anup.woodstock.web.jsf.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;



@ManagedBean(name ="urlModel")
@ViewScoped
public class URLModel {
	
	private String employeeID;
	private String customerNum;
	
	
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getCustomerNum() {
		return customerNum;
	}
	public void setCustomerNum(String customerNum) {
		this.customerNum = customerNum;
	}
	
	
	@Override
	public String toString() {
		return String.format("URLModel [employeeID=%s, customerNum=%s]",
				employeeID, customerNum);
	}
	
	
	
	
	

}
