package org.tnsif.unidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int custid;
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	
	//Default constructor
	public Customer( ) {
		System.out.println("One to One -Unidirectional");
	}

	//Parameterized constructor
	public Customer(int empid, String name, Address address) {
		super();
		this.custid = custid;
		this.name = name;
		this.address = address;
	}
	
	
	//Getters and Setters
	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
		

}
