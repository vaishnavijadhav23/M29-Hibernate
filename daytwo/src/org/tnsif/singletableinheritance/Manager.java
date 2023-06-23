package org.tnsif.singletableinheritance;

import javax.persistence.DiscriminatorValue;

import javax.persistence.Entity;
//CHILD CLASS

@Entity
@DiscriminatorValue("MNG")
public class Manager extends Employee{
	//private data member
	private String depName;

	//getters and setters
	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}
	
	
	

}
