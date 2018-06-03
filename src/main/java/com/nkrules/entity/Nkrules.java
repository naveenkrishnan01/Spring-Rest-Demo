package com.nkrules.entity;

// creation of the Pojo class on the webservices which interacts with Jackson 
public class Nkrules {
  
	private String  ruletype;
	private String CustomerId;

	// no construcotr arg
	public Nkrules() {
		
	}

	 // contructor with arg
	public Nkrules(String ruletype, String customerId) {
		super();
		this.ruletype = ruletype;
		this.CustomerId = customerId;
	}

	public String getRuletype() {
		return ruletype;
	}

	public void setRuletype(String ruletype) {
		this.ruletype = ruletype;
	}

	public String getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	
	
}
