package com.tt.onetomany.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Softedge
 *
 */
@Entity
@Table(name="vendors")
public class Vendor {

	@Id
	private int vendorId;
	private String vendorName;
	private String vendorAddress;
	
	@ManyToOne
	@JoinColumn(name="customerId")
	private Customer customer;
	
	


	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Vendor(int vendorId, String vendorName, String vendorAddress) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
	}


	
	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public int getVendorId() {
		return vendorId;
	}



	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}



	public String getVendorName() {
		return vendorName;
	}



	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}



	public String getVendorAddress() {
		return vendorAddress;
	}



	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	
	
	
}
