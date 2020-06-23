package exception;


public class Custemer extends Exception{
private String CustNo;
private String CustName;
private String category;


Custemer(String CustNo,String CustName,String category){  
this.CustNo= CustNo;
this.CustName= CustName;
this.category= category;
}
public String getCustNo() {
	if ((str.CharAt()!= 'C'||str.CharAt()!= 'c')
			{
		
			}
	return CustNo;
}

public void setCustNo(String custNo) {
	CustNo = custNo;
}

public String getCustName() {
	return CustName;
}

public void setCustName(String custName) {
	CustName = custName;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}
public char CharAt() {
	// TODO Auto-generated method stub
	return 0;
}
}