package com.tibet.sign.domain;


import java.io.Serializable;

public class SignUpSerialNumber implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 7849299212748189534L;


    private String serialNumber;
	private String name;




	public String getSerialNumber() {
		return serialNumber;
	}




	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	@Override
    public String toString() {
        return getSerialNumber() + "," + getName();
    }
    
}
